package provaPractica9;

import java.util.ArrayList;

public class Library {
	// class attributes
	private ArrayList<Book> library;
	private ArrayList<Book> foundBooks;
	
	// public custom constructor
	public Library() {
		library = new ArrayList<>();
		foundBooks = new ArrayList<>();
	}
	
	// public methods
	public void addBook(Book book) {
		this.library.add(book);
	}
	
	// calls the toString() of every book
	public void printBooks() {
		for (Book book : library) {
			System.out.println(book);
		}
	}
	
	// clears the library of any book
	public void clearLibrary() {
		this.library.clear();
	}
	
	// in the following search methods we'll clear
	// first the results arrayList, if not we may
	// encounter duplicates if we perform various
	// search operations:
	
	/**********************SEARCH METHODS*********************************/
	public ArrayList<Book> searchByTitle(String title) {
		this.foundBooks.clear();
		for (Book book : library) {
			if (StringUtils.included(title, book.getTitle())) {
				this.foundBooks.add(book);
			} else {
				continue;
			}
		}
		return foundBooks;
	}
	
	public ArrayList<Book> searchByPublisher(String publisher) {
		this.foundBooks.clear();
		for (Book book : library) {
			if (StringUtils.included(publisher, book.getPublisher())) {
				this.foundBooks.add(book);
			} else {
				continue;
			}
		}
		return foundBooks;
	}
	
	public ArrayList<Book> searchByYear(int year) {
		this.foundBooks.clear();
		String yearValue = String.valueOf(year);
		for (Book book : library) {
			String bookYearValue = String.valueOf(book.getYear());
			if (StringUtils.included(yearValue, bookYearValue)) {
				this.foundBooks.add(book);
			} else {
				continue;
			}
		}
		return foundBooks;
	}
	/**********************END SEARCH METHODS****************************/

}
