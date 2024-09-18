package tp1.ej7;

public class Estudiante {
	private String nombre;
	private String apellido;
	
	
	public Estudiante () {}
	
public Estudiante (String n, String a) {
	this.nombre= n;
	this.apellido= a;
	
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
	
	public String tusDatos() {
		   return "nombre: "+ getNombre() +" apellido: "+ getApellido() ;}
	
	public boolean equals(Object o) { //compara contenido con otro objeto del mismo tipo
		boolean result=false;
		if( (o!=null) && (o instanceof Estudiante) ) {
			Estudiante e = (Estudiante)o;
			if (e.getNombre().equals(this.getNombre()) && e.getApellido().equals(this.getApellido()))
				result=true;
		}
		return result;
	}

}
