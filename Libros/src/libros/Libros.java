package libros;
public class Libros{
	private String isbn;
	private String titulo;
	private String autor;
	private String genero;
	private double precio;
	Libros(){}
	Libros(String isbn, String titulo, String autor, String genero, double precio){
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
		this.genero=genero;
		this.precio=precio;
	}
	void setISBN(String isbn) {
		this.isbn=isbn;
	}
	String getISBN() {
		return this.isbn;
	}
	void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	String getTitulo() {
		return this.titulo;
	}
	void setAutor(String autor) {
		this.autor=autor;
	}
	String getAutor() {
		return this.autor;
	}
	void setGenero(String genero) {
		this.genero=genero;
	}
	String getGenero() {
		return this.genero;
	}
	void setPrecio(double precio) {
		this.precio=precio;
	}
	double getPrecio() {
		return this.precio;
	}
	
}