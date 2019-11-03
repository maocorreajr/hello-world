package correa_As4_p1;

public class Application {

	public static void main(String[] args){
		// TODO Auto-generated method stub	
		DuplicateRemover work = new DuplicateRemover();
	      
		work.remove("problem1.txt");
		work.write("unique_words.txt");

	}

}
