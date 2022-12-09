package hombresmujeres;
public class HombreMujer{
	private String nombre;
	private int edad;
	private char sexo;
	HombreMujer(String nombre, int edad, char sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	HombreMujer (){}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}

	public void setGama(char sexo) {
		this.sexo = sexo;
	}
	public char getSexo() {
		return sexo;
	}

}

