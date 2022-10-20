package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultiCatches {
    
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		
			File file=new File("C:\\doc\\pra.txt");
	    	
	    	FileReader fr=new FileReader(file);
	    	int temp=0;
	    	while((temp=fr.read())!=-1) {
	    		System.out.print((char)(temp));

		}}
		catch(Exception e) {
			System.out.println(e+" "+"0 is divided by any val");
			
		}
				}
	
}
