package appl;

import book.Book;

public class BookAppl {

	public static void main(String[] args) {
		Book[] library = new Book[3];
		library[0] = new Book("0-449-91249-3", "Heaven Has No Favorites", "Erich Maria Remarque", 1961, 2);
		library[1] = new Book("0-8052-0999-9", "The Trial", "Franz Kafka", 1914, 2);
		library[2] = new Book("0-316-43852-9", "Mythology: Timeless Tales of Gods and Heroes", 2017, 4);
		for (int i = 0; i < library.length; i++) {
			library[i].display();
		}
		
		//Changes==========================
		library[0].addBook(3);
		library[1].removeBook(1);
		System.out.println("After changes================");
		for (int i = 0; i < library.length; i++) {
			library[i].display();
		}
	}
}
