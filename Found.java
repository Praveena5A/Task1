package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Found {
    public static void main(String[] args) throws IOException {
    	try{
    		File file=new File("C:\\doc\\pra.txt");
    	
    	FileReader fr=new FileReader(file);
    	int temp=0;
    	while((temp=fr.read())!=-1) {
    		System.out.print((char)(temp));
    	}}
    	catch(FileNotFoundException a) {
    	System.out.println(a+" "+"file name does not exist");
    	a.printStackTrace();
   // System.out.println("hello");
    }
}
}
