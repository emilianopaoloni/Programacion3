package tp1.ej7;

import java.util.LinkedList;
import java.util.List;

public class ej7i {
    
     
     public  int sumarLinkedList (LinkedList<Integer> lista) {
    	 if(lista.size()== 0) { //caso base
    		 return 0; //suma 0
    	 }
    	 int elem= lista.remove(0); //guarda y borra
    	 return (elem + sumarLinkedList(lista));

     }
     
}  