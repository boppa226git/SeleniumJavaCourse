package Section5corejava;


		class Rbi {     //parent class
			public int roi1 =8;   // variable in parent class
			 public void display()   //method in parent class
			{
				System.out.println("RBI ROI ");
			}
		}
			class HSBC extends Rbi     //child class
			{
				int roi2=10;// variable in child class
				public void display()   //method in parent class
				{
					System.out.println("HSBC ROI ");
			    }
			}
		  
			public class overriding {

				public static void main(String[] args) {
				Rbi x=new Rbi();   //object creation for parent
				HSBC y=new HSBC();   //object creation for child
				System.out.println(x.roi1);  //accessing parent variable  with parent object
				x.display();  //accessing parent method with parent object --as per parent display code
				
				System.out.println(y.roi1); //accessing parent   variable  with child object
				y.display();            //accessing parent method with child object  ---as per child code
				System.out.println(y.roi2);  //accessing child   variable  with child object
				y.display();   ////accessing child method  with child object        ---as per child code  ( overriding)
				
				Rbi z=new HSBC();
				System.out.println(z.roi1);
				}	
				
		 


	}


