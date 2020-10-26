package provaPracticaFinal;

import java.util.Scanner;
import java.util.ArrayList;


public class MainTest {

	private static Author author1;
	private static Author author2;
	private static Author author3;
	
	private static ArrayList<Author> authors = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// menu d'inici
		while (true) {
			System.out.println("Commands disponibles:\n"
					+ "Start: Iniciar la base de dades d'un autor per defecte.\n"
					+ "Create: Crear llibres i asignació per defecte a un autor.\n"
					+ "Assign: Assignació d'un llibre a un autor.\n"
					+ "Print: Imprimeix tots els llibres per autor.\n"
					+ "Exit: finalitza l'execució del programa.\n");
			
			String userInput = reader.nextLine().trim().toLowerCase();
			
			if (userInput.equals("exit")) {
				break;
			}
			
			switch (userInput) {
				case "start":
					start();
					break;
				
				case "create":
					while (true) {
						System.out.println("Introduir les dades del proper llibre ('exit' per finalitzar)\n");
						
						if (reader.nextLine().equals("exit")) {
							break;
						}
						// assignació 
						author2.add(createBook());
					}
					break;
				
				case "assign":
					assign();
					break;
					
				case "print":
					print();
					break;
					
				case "exit":
					System.exit(0);
					break;
					
				default:
					break;
			}
		}
		reader.close();
	}	

	public static void start(){
		Book book1 = new Book("El problema de los tres cuerpos", "Cixin Liu", 2005, "Nova", 23.99);
		Book book2 = new Book("El bosque oscuro", "Cixin Liu", 2006, "Nova", 24.99);
		Book book3 = new Book("El fin de la muerte", "Cixin Liu", 1935, "Nova", 24.99);
		
		author1 = new Author("Cixin Liu", "cl@autoreschinos.com", 'm');
		author2 = new Author("Marion Zimmer Bradley", "mzb@avalon.org", 'f');
		author3 = new Author("Steven Pressfield", "spree@war.org", 'm');
		
		authors.add(author1);
		authors.add(author2);
		authors.add(author3);
		
		author1.add(book1);
		author1.add(book2);
		author1.add(book3);
}

	public static Book createBook(){
		Scanner scan = new Scanner(System.in);
		
		// parametres per crear un book:
		String title = new String();
		String writer = new String();
		int year = 0;
		String publisher = new String();
		double price = 0.0;		
			
		System.out.print("TÃ­tol: ");
		title = scan.nextLine();
		System.out.print("Autor/a: ");
		writer = scan.nextLine();
		System.out.print("Any de publicaciÃ³: ");
		year = Integer.valueOf(scan.nextLine());
		System.out.print("Editorial: ");
		publisher = scan.nextLine();
		System.out.print("Preu: ");
		price = Double.valueOf(scan.nextLine());
			
		scan.close();
		
		return new Book(title, writer, year, publisher, price);
	}
	
	public static void print() {
		for (Author author : authors) {
			author.printBook();
		}
	}

	public static void assign(){
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Seleccioni autor i introdueixi el llibre:\n"
					+ "1. Cixin Liu\n"
					+ "2. Marion Zimmer Bradley\n"
					+ "3. Steven Pressfield");
			
			String caseAuthor = scan.nextLine();
			
			if (scan.nextLine().equals("exit")) {
				break;
			}
			
			switch (caseAuthor) {
			
				case ("1"):
					author1.add(createBook());
					break;
					
				case ("2"):
					author2.add(createBook());
					break;
					
				case("3"):
					author3.add(createBook());
					break;
					
				default:
					break;
			}
		}
		scan.close();
	}
}
