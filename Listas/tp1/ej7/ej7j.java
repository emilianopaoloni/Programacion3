package tp1.ej7;

import java.util.List;
import java.util.ArrayList;


public class ej7j {
	

	
	
	
	   public  void imprimirDatos(List<Integer> l) {

    		for(int i=0; i<l.size(); i++) {
    			System.out.println(l.get(i));
    		}
    	}
     
	
	
	
	
	public  ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,
			List<Integer> lista2){
	
		   ArrayList<Integer> resultado = new ArrayList<>();	
	        int indice1 = 0, indice2 = 0;

	        // Recorre ambas listas mientras haya elementos en ambas
	        while (indice1 < lista1.size() && indice2 < lista2.size()) {
	        	
	            if (lista1.get(indice1) < lista2.get(indice2)) {
	                resultado.add(lista1.get(indice1));
	                indice1++;
	            } else {
	                resultado.add(lista2.get(indice2));
	                indice2++;
	            }
	        }

	        // Agrega los elementos restantes de lista1
	        while (indice1 < lista1.size()) {
	            resultado.add(lista1.get(indice1));
	            indice1++;
	        }

	        // Agrega los elementos restantes de lista2
	        while (indice2 < lista2.size()) {
	            resultado.add(lista2.get(indice2));
	            indice2++;
	        }

	        return resultado;
	    }

}
