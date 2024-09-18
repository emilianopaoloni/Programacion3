package tp1.ej7;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ej7gTEST {
	
	public static void main(String[] args){
		
		ej7g e = new ej7g (); //creo instancia de la clase ej7g (para poder usar sus metodos)
		
		Scanner scanner = new Scanner(System.in);
		Integer n;
		
	System.out.println("ingrese un numero entero:");
	n= scanner.nextInt();
	
	List l = new LinkedList();
	l= e.calcularSucesion(n);

	e.imprimirLista(l);
	
	}

}
