package tp1.ej7;

import java.util.ArrayList;
import java.util.List;

public class ej7jTEST {
	
     public static void main(String[] args){
    	 
    	 ej7j e = new ej7j(); //intanciar la clase
		
		ArrayList<Integer> lista1 = new ArrayList<>();
				lista1.add(1);
		        lista1.add(3);
		        lista1.add(5);
		        lista1.add(7);
        ArrayList<Integer> lista2 = new ArrayList<>();
    	        lista2.add(2);
                lista2.add(4);
                lista2.add(6);
                lista2.add(8);
                
        List<Integer> resultado = e.combinarOrdenado(lista1, lista2);
        
     
        System.out.println("Lista combinada ordenada: ");
        e.imprimirDatos(resultado);
		
	}

}
