package tp1.ej3;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//crear instancia de scanner(sino no anda Scanner)
	
	Estudiante [] estudiantes = new Estudiante [2];
	estudiantes[0]= new Estudiante( "Emiliano", "Paoloni","turno tarde", "emiliano@gmailcom", "57 618");
	estudiantes[1]= new Estudiante ("Pedrito", "M", "turno mañana", "pedrito@gmail", "12 1223");
	
	for (int j=0; j<2; j++){ //leer datos de estudiantes
		System.out.println(estudiantes[j].tusDatos());
	}
	
	Profesor [] profesores = new Profesor [3];
	for (int m = 0; m < 3; m++) {
	    profesores[m] = new Profesor();
	    } // Inicializar el profesor antes de usarlo
	
	String nom, ape, cat, mail, fac;
	for(int i=0; i<3; i++) {
		System.out.println("ingrese nombre del profesor "+(i+1)+": ");
		nom= scanner.nextLine();
		profesores[i].setNombre(nom);
		
		System.out.println("ingrese apellido del profesor "+(i+1)+": ");
		ape= scanner.nextLine();
		profesores[i].setApellido(ape);
		
		System.out.println("ingrese catedra del profesor "+(i+1)+": ");
		cat= scanner.nextLine();
		profesores[i].setCatedra(cat);
		
		System.out.println("ingrese mail del profesor "+(i+1)+": ");
		mail= scanner.nextLine();
		profesores[i].setEmail(mail);
		
		System.out.println("ingrese facultad del profesor "+(i+1)+": ");
		fac= scanner.nextLine();
		profesores[i].setFacultad(fac);
	}
	
	for(int i=0; i<3; i++) {  //leer datos de profesores
		System.out.println(profesores[i].tusDatos());
	}
	
	
	
	scanner.close(); // Cierra el scanner al finalizar su uso
	
	}

}
