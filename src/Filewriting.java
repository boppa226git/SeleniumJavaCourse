import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriting {

	public static void main(String[] args) throws IOException {
		//File f=new File("D:\\ace-testing\\Filewriting\\myTestfile.txt");
	    File f=new File("D:\\ace-testing\\Filewriting\\myTestfile.csv");
        FileWriter fw=new FileWriter(f);
        BufferedWriter writer=new BufferedWriter(fw);
        //BufferedWriter writer=new BufferedWriter(fw,true); //content should be appended
        writer.write("First Line");
        writer.newLine();
        writer.write("Second Line");
        
        System.out.println("file has been created");
        for(int i=0;i<5;i++)
        {	for(int j=0;j<5;j++)
        	{
        		writer.write(j+"\t"); //.txt file   
        		writer.write(j+","); //.csv file  
        		
        		}
        writer.newLine();
        }
        	
	writer.close();}
}
