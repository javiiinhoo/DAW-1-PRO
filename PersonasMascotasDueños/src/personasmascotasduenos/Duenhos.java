package personasmascotasduenos;
public class Duenhos{
	private String DNI;
	private String nombre;
	private String mascota;
	private int edad;
	Duenhos(String DNI, String nombre, String mascota, int edad){
		this.DNI=DNI;
		this.nombre=nombre;
		this.mascota=mascota;
		this.edad=edad;
	}
	Duenhos(){}
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
	public void setMascota(String mascota) {
		this.mascota=mascota;		
	}
	public String getMascota() {
		return this.mascota;
	}
	public void setEdad(int edad) {
		this.edad=edad;		
	}
	public int getEdad() {
		return this.edad;
	}
}