package Section5corejava;


class animal {     //parent class
	public int height=3;   // variable in parent class
	 public void display()   //method in parent class
	{
		System.out.println("animal display");
	}
}
	class dog extends animal    //child class
	{
		int weight=60;// variable in child class
		void display1()   //method in parent class
		{
			System.out.println("dog display");
	    }
	}
  
 public class Inheritance42 {
	 	
	public static void main(String[] args) {
	animal objanimal=new animal();   //object creation for parent
	dog objdog=new dog();   //object creation for child
		System.out.println(objanimal.height);  //accessing parent variable  with parent object
		objanimal.display();  //accessing parent method with parent object
		
		System.out.println(objdog.height); //accessing parent   variable  with child object
		objdog.display();            //accessing parent method with child object
		System.out.println(objdog.weight);  //accessing child   variable  with child object
		objdog.display1();   ////accessing child method  with child object
		
		}	
		
 }
