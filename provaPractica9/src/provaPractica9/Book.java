package provaPractica9;

public class Book {
	// class variables
	private String title;
	private String publisher;
	private int year;
	
	// public custom constructor
	public Book(String title, String publisher, int year) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	
	// public methods
	
	/***************** GETTERS & SETTERS ******************/
	// TITLE
	public String getTitle() { return this.title; }
	public void setTitle(String title) { return; }
	
	// PUBLISHER
	public String getPublisher() { return this.publisher; }
	public void setPublisher(String publisher) { return; }
	
	// YEAR
	public int getYear() { return this.year; }
	public void setYear() { return; }
	/******************************************************/
	
	public String toString() {
		return this.title + ", " + this.publisher + ", " + this.year;
	}
}
