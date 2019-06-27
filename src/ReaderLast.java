import java.util.*;
import java.io.*;
public class ReaderLast {
	
	private Scanner input;
	public int length = 98391;
	public int randomNum;
	public ArrayList<String> lastNameArray = new ArrayList<String>();
	
	public void openFile() {
		
		try {
		input = new Scanner(new File("last_names.all.txt"));
		} catch (Exception e) {
			System.out.println("No such a file.");
		}
	}
	
	public void readFile() {
		
		while (input.hasNext()) {
			String lastName = input.next();
		}
		
	}
	
	
	public void addArray() {
		for (int i = 0; i < length; i++) {
			String lastName = input.next();
			
			lastNameArray.add(lastName);
				
		}
	}
	
	public void getRandom() {
		Random rand = new Random();
		randomNum = rand.nextInt(length);
	}
	
}
