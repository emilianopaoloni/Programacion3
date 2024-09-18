package tp1.ej3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String catedra;
	private String email;
	private String facultad;
	
	public Profesor () {}
	
	public Profesor (String n, String a, String c, String e, String f) {
		this.nombre= n;
		this.apellido= a;
		this.catedra=c;
		this.email=e;
		this.facultad=d;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

   public String tusDatos() {
	   return "nombre: "+ getNombre() +" apellido: "+ getApellido() +" email: "+ getEmail() + " catedra: "+ getCatedra() +" facultad: "+ getFacultad();   }

}
