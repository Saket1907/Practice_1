// A Class that represents use-defined expception 
class MyException extends Exception 
{ 
	public MyException(String s) 
	{ 
		// Call constructor of parent Exception 
		super(s); 
	} 
} 

// A Class that uses above MyException 
public class Main 
{ 
	// Driver Program 
	public static void main(String args[]) 
	{ 
		try
		{ 
			int i = 7;
			System.out.println("top");
			if(i == 7)
			throw new MyException("GeeksGeeks"); 
			System.out.println("below");

		} 
		catch (MyException ex) 
		{ 
			System.out.println("Caught"); 

			// Print the message from MyException object 
			System.out.println(ex.getMessage()); 
		} 
	} 
} 
