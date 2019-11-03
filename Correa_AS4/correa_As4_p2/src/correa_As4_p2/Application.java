package correa_As4_p2;

public class Application {
	private static final String datafile = "problem2.txt";
	private static final String outputFile = "unique_word_counts.txt";
	//geeksforgeeks helped me understand how to use private static final String for this assignment
	//similar to the other application to duplicate remover
	public static void main(String[] args) {
		// TODO Auto-generated 
		DuplicateCounter work = new DuplicateCounter();
		work.count(datafile);
		work.write(outputFile);
	}
}
