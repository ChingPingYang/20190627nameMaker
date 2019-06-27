
public class Main {

	public static void main(String[] args) {
		ReaderLast readerLast = new ReaderLast();
		ReaderFirst readerFirst= new ReaderFirst();
		String nameOne;
		String nameTwo;
	
		readerLast.openFile();
		readerLast.addArray();
		readerLast.getRandom();
		
		readerFirst.openFile();
		readerFirst.addArray();
		readerFirst.getRandom();
		
		nameOne = readerLast.lastNameArray.get(readerLast.randomNum) + " " + readerFirst.firstNameArray.get(readerFirst.randomNum);
		
		readerLast.openFile();
		readerLast.addArray();
		readerLast.getRandom();
		
		readerFirst.openFile();
		readerFirst.addArray();
		readerFirst.getRandom();
		
		nameTwo = readerLast.lastNameArray.get(readerLast.randomNum) + " " + readerFirst.firstNameArray.get(readerFirst.randomNum);
		
		System.out.println(nameOne);
		System.out.println(nameTwo);
		
		
	}

}
