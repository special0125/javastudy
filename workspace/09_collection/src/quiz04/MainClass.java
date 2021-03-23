package quiz04;

public class MainClass {
	public static void main(String[] args) {
		
		Book book1 = new Book(1000, "어린왕자", "생텍쥐베리");
		Book book2 = new Book(1001, "소나기", "황순원");
		Book book3 = new Book(1002, "홍길동전", "김홍길");
		
		Library library = new Library("신촌도서관");
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		library.booksInfo();
		
		library.removeBook(1002);
		library.booksInfo();

		
		
		
	}
}
