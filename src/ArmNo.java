
public class ArmNo {

	public static void main(String[] args) {
		int inputNumber = 407;
		 int inputTemp = inputNumber;
		int reminder = 0;
		int byTimes = 0;
		int sum = 0;
		
		inArmNumber(inputNumber, inputTemp, reminder, sum);

	}

	private static void inArmNumber(int inputNumber, int inputTemp, int reminder,  int sum) {
		
		while(inputTemp > 0) {
			reminder = inputNumber % 10;
			int byTimes = inputNumber/10;
			sum = sum + reminder^3;
			inputNumber = reminder;
			inArmNumber(inputNumber,byTimes, reminder, sum);
			
			
			System.out.println("sum = "+sum);
			}
		}
		
	}


