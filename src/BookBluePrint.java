


public class BookBluePrint {
	private int book_id;
	private int book_quantity;
	private String book_author;
	private String book_title;
	private String book_publisher;
	public BookBluePrint(int book_id, int book_quantity, String book_author, String book_title, String book_publisher) {
		
		this.book_id = book_id;
		this.book_quantity = book_quantity;
		this.book_author = book_author;
		this.book_title = book_title;
		this.book_publisher = book_publisher;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getBook_quantity() {
		return book_quantity;
	}
	public void setBook_quantity(int book_quantity) {
		this.book_quantity = book_quantity;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	@Override
	public String toString() {
		return "BookBluePrint [book_id=" + book_id + ", book_quantity=" + book_quantity + ", book_author=" + book_author
				+ ", book_title=" + book_title + ", book_publisher=" + book_publisher + "]";
	}
	
	
	
	

}

