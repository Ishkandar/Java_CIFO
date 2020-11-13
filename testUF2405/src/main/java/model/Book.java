package model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@NamedQueries({ @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b") })

public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String isbn;
	private String author;
	private int year;
	private int pages;
	private String title;
	@OneToMany(mappedBy="book")
    private ArrayList<Quote> quotes;

	/********************** CONSTRUCTORS ***********************/
	public Book() {
		this.quotes = new ArrayList<Quote>();
	}

	public Book(Integer id, String name, String isbn, int year, int pages) {
		this.id = id;
		this.title = name;
		this.isbn = isbn;
		this.year = year;
		this.pages = pages;
		this.quotes = new ArrayList<Quote>();
	}

	public Book(String name) {
		this.title = name;
		this.quotes = new ArrayList<Quote>();
	}
	/********************* END CONSTRUCTORS *********************/

	/*********************** GETTERS & SETTERS ***********************/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Quote> getQuotes() {
		return quotes;
	}

	public void setQuotes(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}
	
	/********************* END GETTERS & SETTERS *********************/

	@Override
	public String toString() {
		return "Book{" + "id=" + id + ", name='" + title + "}";
	}
}
