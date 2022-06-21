package Section5corejava;


class Demo {
	int a;
	int b; 
	int c;
	double d;
	
	
	void sum()
	{
		a=10;
b=20;
		System.out.println(a+b);
	}
	
	
	void sum(int x,int y)
	{
		a=x;b=y;
		System.out.println(a+b);
	}
	
	
	
	void sum(int x,int y , int z)
	{
		a=x;
		b=y;
		c=z;
		System.out.println(a+b+c);
	}
	
	
	
	void sum(int x,double y)
	{
		a=x;
		d=y;
		System.out.println(a+d);
	}
	
		
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo objx=new Demo();
		objx.sum();
		objx.sum(5,10);
		objx.sum(1,2,3);
		objx.sum(1,2.5);
		
	}
}

