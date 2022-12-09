package arrayobjetos;
public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	Persona() {}
	Persona(String nombre,int edad,char sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	void setEdad(int edad) {
		this.edad=edad;
	}
	void setSexo(char sexo) {
		this.sexo=sexo;
	}
	String getNombre() {
		return this.nombre;
	}
	int getEdad() {
		return this.edad;
	}
	char getSexo() {
		return this.sexo;
	}
}