package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
Map<String,String> map=new HashMap<String,String>();
map.put("firstname", "Ravi");
map.put("lastname", "Raju");
	System.out.println(map);
	System.out.println(map.size());
	 System.out.println(map.get("firstname"));
	
	Set<String>keys=map.keySet();
			for(String key:keys)
			{
				System.out.println("key==>"+key+" value is--->"+map.get(key));
			}
			Map<String,List<String>> map1=new HashMap<String,List<String>>();
	List<String> listEmails=new ArrayList<String>();
	listEmails.add("a@gmail.com");
	listEmails.add("b@gmail.com");
	listEmails.add("c@gmail.com");
	listEmails.add("d@gmail.com");
	map1.put("email", listEmails);
	System.out.println(map);
	}

}
