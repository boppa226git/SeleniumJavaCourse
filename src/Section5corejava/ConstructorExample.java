package Section5corejava;


	
	
	
	 class Student {
			int rollNo=100;
			String stname="ravi"; 
			int c=3;
			double d=10.0;
			public Student() 
			{
				rollNo=4;
				stname="tanvi";
			}
			
			public Student(int i, String j)
			{// TODO Auto-generated constructor stub
				rollNo=i;
				stname=j;
			}
				
			void display()
			{
				System.out.println("student roll num="+rollNo);
			System.out.println("stname="+stname);
			
			
			}
				
	 }
	 public class ConstructorExample {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Student objst=new Student();
				objst.display();
				
				Student objst1=new Student(100,"Hanvika");
				objst1.display();
				
				
			}
		}

	
	
	
	
	

