package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Quote {

	@Id
	private int id;
	private String tag;
	private String sentence;
	private int numberWords;
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;

	/********************** CONSTRUCTORS ***********************/
	public Quote() {
		super();
	}

	public Quote(int id, String sentence, int numberWords, Book book) {
		super();
		this.id = id;
		this.sentence = sentence;
		this.numberWords = numberWords;
		this.book = book;
	}
	/********************* END CONSTRUCTORS *********************/

	/*********************** GETTERS & SETTERS ***********************/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getNumberWords() {
		return numberWords;
	}

	public void setNumberWords(int numberWords) {
		this.numberWords = numberWords;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	/********************* END GETTERS & SETTERS *********************/

	@Override
	public String toString() {
		return "Quote [id=" + id + ", sentence=" + sentence + ", numberWords=" + numberWords + ", book=" + book + "]";
	}
}
