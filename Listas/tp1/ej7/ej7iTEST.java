package tp1.ej7;

import java.util.LinkedList;

public class ej7iTEST {
	
	 public static void main(String[] args){
		 ej7i e = new ej7i(); 
    	 LinkedList<Integer> l = new LinkedList<>();
    	l.add(0);
    	l.add(10);
    	l.add(20);
    	l.add(30);
    	l.add(30);
    	l.add(5);
    	l.add(5);
    	System.out.println("la suma de los elementos de la lista es: "+e.sumarLinkedList(l));


     }

}
