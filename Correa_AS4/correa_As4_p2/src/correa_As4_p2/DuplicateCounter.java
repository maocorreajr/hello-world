package correa_As4_p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//personal note: this problem uses hashmaps of strings
public class DuplicateCounter {
	private Integer wordCounter;
	private Map<String, Integer> hashmap;
	
	public DuplicateCounter(){
		this.wordCounter = 0;
		this.hashmap = new HashMap<>();
	}
	
	public void count(String dataFile) {
		try {
			Scanner file = new Scanner(new File(dataFile));
			while(file.hasNextLine()){//this method from scanner continues to be true/loops until the next line is essetnially null
				//it helps to continuly count the words in the txt file until they are no more words to count
				String line = file.nextLine().trim(); //another geeksforgeeks implementation
				String[] data = line.split("[\\W]+"); //another geeksforgeeks implementation
				for(String word : data){
					this.wordCounter = hashmap.get(word);
					this.wordCounter = (this.wordCounter == null)?1:++this.wordCounter;
					hashmap.put(word, this.wordCounter);
				}
			}
			file.close();
		}catch(FileNotFoundException ex) { //throw exceptions
			System.out.println("The file " + dataFile + " cannot be found! Please find another file");
			System.exit(1);
		}
	}
	
	public void write(String outputFile) {
		try {
			FileWriter writer = new FileWriter(new File(outputFile));
			PrintWriter print = new PrintWriter(writer);
			for(Map.Entry<String, Integer> entry : hashmap.entrySet()){
				writer.write(entry.getKey() + " occurs " + entry.getValue() + " times" + System.lineSeparator());
			}
			System.out.println("Map data has been written to the new file: " + outputFile);
			print.flush();
			writer.close();
			print.close();
			} catch (IOException ex) {
				System.out.println("Error in writing to " + outputFile + ": " + ex.getMessage());
				System.exit(1);
		}
	}
}
