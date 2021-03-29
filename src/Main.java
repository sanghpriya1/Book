
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		HashMap<Integer, BookBluePrint> BookEntry = new HashMap<Integer, BookBluePrint>();
		BookBluePrint b1 = new BookBluePrint(101, 8, "Let us C","Yashwant Kanetkar","BPB");
		BookBluePrint b2 = new BookBluePrint(102, 4,"Data Communications & Networking","Forouzan","Mc Graw Hill");
		BookBluePrint b3 = new BookBluePrint(103, 6, "Operating System","Galvin","Wiley"); 
		BookEntry.put(1, b1);  
		BookEntry.put(2, b2);  
		BookEntry.put(3,b3); 
		for(HashMap.Entry<Integer, BookBluePrint> entry: BookEntry.entrySet()) {
			int key = entry.getKey();
			BookBluePrint b = entry.getValue();
			System.out.println(key +" "+ b);
			
		}
	}

}
