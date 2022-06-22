package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testcase1 {

	public static void main(String[] args) throws IOException {
		
Properties prop=new Properties();
//FileInputStream fis =new FileInputStream("D:\\ace-testing\\SeleniumJavaCourse\\src\\config\\object.properties");
FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");	
prop.load(fis);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("course"));
	}

}
