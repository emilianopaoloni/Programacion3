package tp1.ej7;

import java.util.ArrayList;
import java.util.List;

public class ej7h {
   
     public  void imprimirDatos(List<Integer> l) {

 		for(int i=0; i<l.size(); i++) {
 			System.out.println(l.get(i));
 		}
 	}
     
	public  void invertirArrayList(ArrayList<Integer> lista) {
		if(lista.size()<=1)//caso base: lista vacia o con un solo elemento
			return;
		int primer_elemento= lista.remove(0); //elimina el primer elemento y lo guarda en variable
		invertirArrayList(lista); //recursion
		
		//una vez llegado al caso base, el return retorna a esta linea:
		lista.add(primer_elemento); //comienza a llenarse la lista empezando por el "ultimo" elemento
		//ahora el ultimo elemento va a ser el primero
	}  
			
  }
	

