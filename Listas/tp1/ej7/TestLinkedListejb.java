package tp1.ej7;
import java.util.LinkedList;
//import java.util; //esto siempre se pone???
//import java.awt.List;
import java.util.Scanner;

public class TestLinkedListejb {
	
		public static void main(String[] args){
		
		LinkedList<Integer> l= crearLista();
		System.out.println("elementos de la lista");
		while(l.size()!=0) {
			System.out.println(l.get(0));
			l.remove(0);
		}
		
			
		}



	public static LinkedList<Integer> crearLista () {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<>();
		
		int n;
		System.out.println("ingrese un numero (-1 para terminar)");
		n= scanner.nextInt();
		
		while(n!=-1) {
			l.add(n);
			System.out.println("ingrese un numero (-1 para terminar)");
			n= scanner.nextInt();
		}
		
		return(l);
	}

	}

