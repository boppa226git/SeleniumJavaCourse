package ReflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {
		Test t=new Test();
		//System.out.println(t.getClass().getSimpleName());
		Class clazz=t.getClass();
		System.out.println(clazz.getSimpleName());
		Constructor[] cons=clazz.getDeclaredConstructors();
		System.out.println("no of constructors-->"+cons.length);
		for(Constructor con:cons)
		{System.out.println(con.getName());
		}
		
		Method[] arrayOfMethods=clazz.getDeclaredMethods();
        System.out.println(arrayOfMethods.length);
	
	    for(Method m: arrayOfMethods) 
	    {
        System.out.println("method name--->"+m.getName()+"   return type-->"+m.getReturnType());//"   method parameters--->"+m.getParameterTypes());
        Parameter[] par=m.getParameters();
	    for(Parameter param:par)
	    {
	    	System.out.println(param.getName());
	    }
	    }
	}
}
