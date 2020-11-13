package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-11-13T12:57:25.480+0100")
@StaticMetamodel(Book.class)
public class Book_ {
	public static volatile SingularAttribute<Book, Integer> id;
	public static volatile SingularAttribute<Book, String> isbn;
	public static volatile SingularAttribute<Book, String> author;
	public static volatile SingularAttribute<Book, Integer> year;
	public static volatile SingularAttribute<Book, Integer> pages;
	public static volatile SingularAttribute<Book, String> title;
	public static volatile ListAttribute<Book, Quote> quotes;
}
