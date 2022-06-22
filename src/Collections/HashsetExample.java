package Collections;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
	
	set.add("Java");
	set.add("Selenium");
	set.add("Automation");
	set.add("Java");//not included duplicates
	//example window ids -example for set
	System.out.println(set); //output is not in order

	int k=set.size();
	//for(int i=0;i<k;i++)
	//System.out.println(set.get(i));  error
	
	//reading values from set method-I
	for(String var:set)
	System.out.println(var);
	
	//reading values from set method-I
	java.util.Iterator<String> itr=set.iterator();
	while(itr.hasNext())
				{
		System.out.println(itr.next());
		
	}
	

}
}
