import java.util.Stack;

public class InterviewQuestion1 {

	public static void main(String[] args) {
		String inputString = "{{[]()}}()[[{()}]]";
		
		Stack<Character> myStack = new Stack<Character>();
		
		if(inputString.length() % 2 > 0) {
			System.out.println("Not balance");
		}
		char[] inputStringToCharArray = new char[inputString.length()];
		
		for(int i = 0; i < inputString.length(); i++){
			char tempVal = inputString.charAt(i);
			inputStringToCharArray[i] = tempVal;
		}
		
		for(int j = 0; j < inputStringToCharArray.length; j++) {
			if(inputStringToCharArray[j] == '(')  {
				myStack.push('(');
			}
			if(inputStringToCharArray[j] == '{')  {
				myStack.push('{');
			}
			if(inputStringToCharArray[j] == '[')  {
				myStack.push('[');
			}
			
			if(inputStringToCharArray[j] == '}') {
				if(myStack.peek() == '{') {
					myStack.pop();
					continue;
				}
			}
			if(inputStringToCharArray[j] == ']') {
				if(myStack.peek() == '[') {
					myStack.pop();
					continue;
				}
		}
			if(inputStringToCharArray[j] == ')') {
				if(myStack.peek() == '(') {
					myStack.pop();
					continue;
				}

	}

}
		if(myStack.isEmpty()) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
		
	}
}
