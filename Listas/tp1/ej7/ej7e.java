package tp1.ej7;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ej7e {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		List<Estudiante> l = new LinkedList<>();
		String nom, ape;
		
		for(int i=0; i<3; i++) { //agrego 3 estudintes a la lista
			System.out.println("ingrese nombre de estudiante nro "+(i+1));
			nom= scanner.next();
			System.out.println("ingrese apellido de estudiante nro "+(i+1));
			ape= scanner.next();
			Estudiante e= new Estudiante();
			e.setNombre(nom);
			e.setApellido(ape);
			l.add(e);
		}
		    System.out.println("datos lista original: ");
			imprimirDatos(l);
			
			Estudiante eNuevo= new Estudiante(); //creo cuarto estudiante
			eNuevo.setNombre("Alejandro");
			eNuevo.setApellido("Chavez");
			
			if(yaEstaEnLaLista(l,eNuevo)==false) { //si el estudiante no esta en la lista, lo agrego
				l.add(eNuevo);
				System.out.println("se agrega cuarto estudiante a la lista ");
			}
			
			 System.out.println("datos lista nueva: ");
				imprimirDatos(l);
			
			
			
	}
	
	public static void imprimirDatos(List l) {

		for(int i=0; i<l.size(); i++) {
			Estudiante estudiante_actual = (Estudiante) l.get(i); //obtengo estudiante actual (casting)
			System.out.println(estudiante_actual.tusDatos());
		}
	}
	
	public static boolean yaEstaEnLaLista(List l, Estudiante e) {
		boolean yaExiste=false;
		for (int i=0; i<l.size(); i++) {
			Estudiante estudiante_actual = (Estudiante) l.get(i);
			if(estudiante_actual.equals(e)==true) //compara contenidos entre objeto de la lista 
				yaExiste=true;
		}
		return yaExiste;
	}
	
	

}
