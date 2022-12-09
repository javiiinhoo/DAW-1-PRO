package personasmascotasduenos;
public class Personas{
	private String DNI;
	private String nombre;
	Personas(String DNI, String nombre){
		this.DNI=DNI;
		this.nombre=nombre;
	}
	Personas(){}
	public void setDNI(String DNI) {
		this.DNI=DNI;		
	}
	public String getDNI() {
		return this.DNI;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;		
	}
	public String getNombre() {
		return this.nombre;
	}
}
