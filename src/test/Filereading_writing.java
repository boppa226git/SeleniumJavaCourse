package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereading_writing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//File file=new File("C:\\Users\\nithy\\git\\seleniumjavacourse\\SeleniumJavaCourse\\screenshot\\test.txt");
		
		File file=new File(System.getProperty("user.dir")+"\\screenshot\\test.txt");
		file.createNewFile();
	//FileWriter fw=new FileWriter("C:\\Users\\nithy\\git\\seleniumjavacourse\\SeleniumJavaCourse\\screenshot\\test.txt");
	FileWriter fw=new FileWriter(System.getProperty("user.dir")+"\\screenshot\\test.txt");
	BufferedWriter filewriter=new BufferedWriter(fw);	
	filewriter.write("please write inside the file");
	filewriter.flush();
	filewriter.newLine();
	filewriter.write("This is my second line");
	filewriter.flush();
	filewriter.newLine();
	filewriter.write("This is my third line");
	filewriter.flush();
	
	//read from a file
	
	FileReader fr = new FileReader(System.getProperty("user.dir")+"\\screenshot\\test.txt");
	BufferedReader filereader = new BufferedReader(fr);
	String i="";
	
//	System.out.println(filereader.readLine());
//	System.out.println(filereader.readLine());
//	System.out.println(filereader.readLine());
//	System.out.println(filereader.readLine());
	
	
	while((i = filereader.readLine())!=null){
		
		System.out.println(i);
	}
	}

}
