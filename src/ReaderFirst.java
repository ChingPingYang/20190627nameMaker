import java.util.*;
import java.io.*;
public class ReaderFirst {
	
	private Scanner input;
	public int length = 164433;
	public int randomNum;
	public ArrayList<String> firstNameArray = new ArrayList<String>();
	
	public void openFile() {
		
		try {
		input = new Scanner(new File("first_names.all.txt"));
		} catch (Exception e) {
			System.out.println("No such a file.");
		}
	}
	
	public void readFile() {
		
		while (input.hasNext()) {
			String firstName = input.next();
		
		}
		
	}
	
	
	public void addArray() {
		for (int i = 0; i < length; i++) {
			String firstName = input.next();
			
			firstNameArray.add(firstName);
				
		}
	}
	
	public void getRandom() {
		Random rand = new Random();
		randomNum = rand.nextInt(length);
	}
	
}
