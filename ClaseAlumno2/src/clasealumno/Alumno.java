package clasealumno;
public class Alumno {
	private int numero;
	private String nombre;
	private double nota1;
	private double nota2;
	private double nota3;
	Alumno() {}
	Alumno(int numero,String nombre, double nota1, double nota2, double nota3)
	{
		this.numero=numero;
		this.nombre=nombre;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	boolean apto() {
		boolean apto=true;
		if(nota1<4.5 || nota2<4.5 || nota3<4.5)
			apto=false;
		return apto;
	}
	void setNumero(int numero) {
		this.numero=numero;
	}
	int getNumero(int numero) {
		return this.numero;
	}
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	String getNombre(String nombre) {
		return this.nombre;
	}
	void setNotas1(double nota1) {
		this.nota1=nota1;
	}
	double getNotas1(double nota1) {
		return this.nota1;
	}
	void setNotas2(double nota2) {
		this.nota2=nota2;
	}
	double getNotas2(double nota2) {
		return this.nota2;
	}
	void setNotas3(double nota3) {
		this.nota3=nota3;
	}
	double getNotas3(double nota3) {
		return this.nota3;
	}
	void visualizarAlumno() {
		System.out.println(this.numero+"\t"+this.nombre+"\t"+this.nota1+"\t"+this.nota2+"\t"+this.nota3+"\t");
	}
}
//Pedir: 
//Num alumno
//nombre alumno
//notas 
//hacer media con decimales
//visualizar asi:
//Media alumno1........: media
//numal  nombre media  

