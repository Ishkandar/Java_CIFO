package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-11-13T12:57:25.550+0100")
@StaticMetamodel(Quote.class)
public class Quote_ {
	public static volatile SingularAttribute<Quote, Integer> id;
	public static volatile SingularAttribute<Quote, String> tag;
	public static volatile SingularAttribute<Quote, String> sentence;
	public static volatile SingularAttribute<Quote, Integer> numberWords;
	public static volatile SingularAttribute<Quote, Book> book;
}
