package clases;
public class Persona {
	//Atributos
	// private es la visibilidad
	private String nombre;
	private int edad;
	
	//Constructores(se llaman igual que la clase y pueden estar vacíos o no)
	Persona() {}
	Persona(String nombre,int edad){
		//Se pone "this" para que el programa sepa que son atributos
		this.nombre=nombre;
		this.edad=edad;
	}
	
	//Métodos
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	void setEdad(int edad) {
		this.edad=edad;
	}
	String getNombre() {
		return this.nombre;
	}
	int getEdad() {
		return this.edad;
	}
	 
	void VisualizarObjeto() {
		System.out.println("Nombre-----> "+this.nombre+" Edad-----> "+this.edad);
	}
}

