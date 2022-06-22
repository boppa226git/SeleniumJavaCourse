package Collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();
System.out.println(list);
System.out.println(list.size());
//add elements
list.add(10);
list.add(1, 10);
list.add("java");
list.add(null);
list.add(true);
list.add(false);
System.out.println(list.size());
System.out.println(list);
//how to fetch elements
System.out.println(list.get(0));
System.out.println(list.get(1));
System.out.println(list.size());
System.out.println(list);
//remove
list.remove(1);
System.out.println(list.size());
System.out.println(list);

for(int i=0;i<list.size();i++)
System.out.println(list.get(i));


ArrayList<Integer> list1=new ArrayList<Integer>();
list1.add(10);
//list1.add(10.3);   gives error
list.get(1);  //return type in integer only

	}
}


