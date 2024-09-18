//CONCLUSIONES: si se hace una copia de una lista, la lista referencia al
//objeto. Esto significa que si se modifica un objeto en la lista original, la copia 
//tambien reflejara esos cambios, ya q ambas listas estan apuntando al mismo objeto en]
//memoria.
//  PREGUNTARRRR ¿Cuántas formas de copiar una lista existen? ¿Qué diferencias existen entre
ellas?

package tp1.ej7;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ej7d {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		List<Estudiante> l1 = new LinkedList<>();
		String nom, ape;
		for(int i=0; i<3; i++) {
			System.out.println("ingrese nombre de estudiante nro "+(i+1));
			nom= scanner.next();
			System.out.println("ingrese apellido de estudiante nro "+(i+1));
			ape= scanner.next();
			Estudiante e= new Estudiante();
			e.setNombre(nom);
			e.setApellido(ape);
			l1.add(e);
		}
		    System.out.println("datos lista original: ");
			imprimirDatos(l1);
			
			List<Estudiante> l2 = new LinkedList<>();
			l2= l1;
			System.out.println("datos lista copia: ");
			imprimirDatos(l2);
		
			System.out.println("------------------");
			
			System.out.println("AHORA MODIFICO DATOS EN ESTUDIANTE 1 ");
			Estudiante est = (Estudiante) l1.get(0);
			est.setApellido("vacio");
			est.setNombre("vacio");
			
			System.out.println("datos lista original: ");
			imprimirDatos(l1);
			System.out.println("   ");
			System.out.println("datos lista copia: ");
			imprimirDatos(l2);
		
		
			
	}
	
	public static void imprimirDatos(List l) {

		for(int i=0; i<l.size(); i++) {
			Estudiante estudiante_actual = (Estudiante) l.get(i); //obtengo estudiante actual (casting)
			System.out.println(estudiante_actual.tusDatos());
		}
	}
	
	

}
