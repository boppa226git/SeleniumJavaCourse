package Section5corejava;

public class ExceptionHandling1 {

	public static void main(String[] args) {
	System.out.println("Beginning");
	
	try
	{
		System.out.println("entered into try block");
		int divide=10/0;
	
	System.out.println(divide);
	}
	//catch(Throwable t)  //throwable super class
	catch(Exception e)
	{
		System.out.println("Entered into catch block");
		System.out.println("error occured");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	System.out.println("after try and catch blocks");
	System.out.println("Ending");
	

	System.out.println("Array index out of range check");
	
	int i[]=new int[4];
	
	try
	{
		System.out.println("entered into try block");
		i[5]=10;
		
	}
	catch(Exception e)
	{
		System.out.println("entered into catch block");
		System.out.println("error occured");
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}
	
	
	}
}
