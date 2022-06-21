package Section5corejava;

public class ExceptionHandling2 {

	public static void main(String[] args) throws Exception {
		
int i[]= new int[4];
//i[5]=10;
System.out.println("Wel come");
Thread.sleep(1000);//if we use try catch block every sleep we have to use try and catch block
	System.out.println("After sleep");
	
	try {
		System.out.println("entered into try block");
	//int a=10/0;//exception occured and catch block and final block to be excuted
	int a=10/2; //no exception only try and finally block executed
	}
	catch(Exception e)
	{
		System.out.println("entered into catch block");
	}
	finally {
		System.out.println("finally block code");
	}
	
	
	throw new Exception("Error occured");    // creating an exception explicitly
	}

}
