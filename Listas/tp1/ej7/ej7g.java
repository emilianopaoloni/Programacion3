package tp1.ej7;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ej7g {
	
	
	
	public  void imprimirLista(List l) {

		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	
	public  List<Integer> calcularSucesion (int n) {
		
		if(n==1) { //caso base
		List <Integer> listaSucesion  = new LinkedList <Integer>(); //se crea la lista (1 sola vez)
		listaSucesion.add(n);
		return (listaSucesion); 
		}
			
			
		
		else if(n % 2 == 0) { //n es par
			List <Integer> listaSucesion = calcularSucesion(n/2);
			listaSucesion.add(0, n);
			return (listaSucesion);
		}
		
		else { //n es impar
			List <Integer> listaSucesion = calcularSucesion((3*n)+1);
			listaSucesion.add(0,n);
			return(listaSucesion);
		}

		
      }
	
}
