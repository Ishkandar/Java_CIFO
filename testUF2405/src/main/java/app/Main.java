package app;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

import model.*;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testUF2405");
		EntityManager em = emf.createEntityManager();
		Book book = new Book("Anna Karenina");
		try {
			em.getTransaction().begin();
			em.persist(book);
			em.getTransaction().commit();
		} catch (Exception ex) {
			System.out.println("Ocurrió un error, mira más abajo:");
			ex.printStackTrace();
		}
	}
}
