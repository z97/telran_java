package book;

import isbn.ISBN;

public class Book {
	private String isbn;
	private String title;
	private String autor;
	private int year;
	private int count;

	// Constructors==============================
	public Book(String isbn, String title, int year, int count) {
		this.isbn = isbn;
		this.title = title;
		this.year = year;
		this.count = count;
	}

	public Book(String isbn, String title, String autor, int year, int count) {
		this.isbn = isbn;
		this.title = title;
		this.autor = autor;
		this.year = year;
		this.count = count;
	}

	// Getters and Setters======================
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// Mithods===============================
	public void display() {
		System.out.println("ISBN: " + (ISBN.validateIsbn10(isbn) == true ? isbn : "ISBN is not valid") 
				+ " Title: " + (title != null ? title : " no  title") 
				+ " Autor: " + (autor != null ? autor : " no autor") 
				+ " Year " + (year > 0 ? year : " year can't be negative")
				+ " Amount of books:" + (count >= 0 ? count : " Amount of books can't be negative"));
	}
	
	public void addBook(int num){
		count += num;
	}
	
	public boolean removeBook(int num) {
		if(num < count) {
			count -= num;
			return true;
		}
		return false;
	}
}
