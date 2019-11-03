package correa_As4_p1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//personal note: this problem uses sets and hashsets of strings
public class DuplicateRemover {
	private Set<String> uniqueWords;//sets string for uniquewords
	
	public void remove(String dataFile) {
		try {
	           Scanner scanr = new Scanner(new File(dataFile));

	           while (scanr.hasNext()) {
	               uniqueWords.add(scanr.next());
	           }
	           scanr.close();
	       }catch (FileNotFoundException ex) {
	           System.out.println(ex);
	       }
	}
	
	public void write(String outputFile) {
	       try {
	           PrintWriter file = new PrintWriter(new File(outputFile));
//note we are going to write the results into a new file so that is why we use printwriter
	           
	           for (String string : uniqueWords) {
	        	   file.println(string);
	           }
	           file.flush();
	           file.close();
	       } catch (FileNotFoundException e) {
	           System.out.println(e);
	       }
	   }
	
	public DuplicateRemover() {
	       uniqueWords = new HashSet<>();
	   }
}
