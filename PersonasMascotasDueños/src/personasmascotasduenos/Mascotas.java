package personasmascotasduenos;
public class Mascotas{
	private String DNI;
	private String mascota;
	private int edad;
	Mascotas(String DNI, String mascota, int edad){
		this.DNI=DNI;
		this.mascota=mascota;
		this.edad=edad;
	}
	Mascotas(){}
	public void setDNI(String DNI) {
		this.DNI=DNI;		
	}
	public String getDNI() {
		return this.DNI;
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
