

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libros", catalog = "biblioteca")
public class Libro {
	// class attributes
	@Id
	private String isbn;
	private String titulo;
	private String autor;
	private Date fechaPublicacion;
	private int precio;
	
	// public custom constructors
	public Libro() {
		super();
	}
	
	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}
	
	public Libro(String isbn, String titulo, String autor, Date fechaPub, int precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPub;
		this.precio = precio;
	}
	 //***************************************************************//
	//--------------------------public methods-----------------------//
	
	/*~~~~~~~~~~~~~~~~~~~~~ GETTERS & SETTERS ~~~~~~~~~~~~~~~~~~~~~~*/
	
	public String getISBN() {
		return this.isbn;
	}
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}
	
	public void setFechaPublicacion(Date date) {
		this.fechaPublicacion = date;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/*~~~~~~~~~~~~~~~~~~~ END GETTERS & SETTERS ~~~~~~~~~~~~~~~~~~~~~*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Libro posibleLibro = (Libro) obj;
		
		if (isbn == null) {
			if (posibleLibro.isbn != null) {
				return false;
			}
		} else if (!isbn.equals(posibleLibro.isbn)) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Libro [isbn=" + this.isbn + 
				", titulo=" + this.titulo + 
				", autor=" + this.autor + 
				", fecha=" + this.fechaPublicacion + 
				", precio=" + this.precio + 
				"]";
	}
}
