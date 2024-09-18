package tp3.ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import tp1.ej8.Queue;


public class RecorridosAG {
	
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a, Integer n) {
	
		List <Integer> l = new ArrayList<Integer>();
		numerosImparesMayoresQuePreOrden_private(a, l, n);
		
		return l;

    }
	
	private void numerosImparesMayoresQuePreOrden_private(GeneralTree <Integer> a, List<Integer> l , Integer n) {
		if ( (a.getData()>n) && !(a.getData() % 2 == 0) ) //que sea impar y mayor a n
			l.add(a.getData());
		List<GeneralTree<Integer>> children = a.getChildren();
		 for (GeneralTree<Integer> child: children) {  //por cada arbol "child" de la lista children itero
		 numerosImparesMayoresQuePreOrden_private(child, l, n);
	   }
	}
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n) {
		
		List <Integer> l = new ArrayList<Integer>();
		numerosImparesMayoresQuePreOrden_private(a, l, n);
		
		return l;

    }
	
	private void numerosImparesMayoresQueInOrden_private(GeneralTree <Integer> a, List<Integer> l , Integer n) { //primero hijo, despues raiz, despues resto de la lista
		List<GeneralTree<Integer>> children = a.getChildren(); //primero obtengo lista de hijos
		
		if(a.hasChildren())
			numerosImparesMayoresQuePreOrden_private(children.get(0), l, n); //le paso el arbol
		

		if ( (a.getData()>n) && (a.getData() % 2 == 0) ) // proceso raiz
			l.add(a.getData());
			
	    for(int i=1; i<=children.size(); i++) { //sigo procesando cada elemento de la lista --> empieza en i=1 pq ya procese el primer elemento
	    	numerosImparesMayoresQueInOrden_private(children.get(i), l, n);
	    }
			  	
	}
	
public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a, Integer n) {
		
		List <Integer> l = new ArrayList<Integer>();
		numerosImparesMayoresQuePreOrden_private(a, l, n);
		
		return l;

    }
	
	private void numerosImparesMayoresQuePostOrden_private(GeneralTree <Integer> a, List<Integer> l , Integer n) { //primero todos los hijos, despues la raiz
	
		if(a.hasChildren()) {//si tiene lista de hijos
			List<GeneralTree<Integer>> children = a.getChildren(); // obtengo lista de hijos
			for(GeneralTree<Integer> child: children) //recorriendo lista hijos
			numerosImparesMayoresQuePreOrden_private(child, l, n);
		}

		if ( (a.getData()>n) && (a.getData() % 2 == 0) ) //proceso nodo actual, vuelta de recursion
			l.add(a.getData());
	    
			  	
	}
	
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a, Integer n) {
		List<Integer> result = new LinkedList<Integer>(); //creo lista
		GeneralTree<Integer> tree_aux; 
		Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
		 queue.enqueue(a);
		 while (!queue.isEmpty()) {
		 tree_aux = queue.dequeue();
		 
		 if ( (tree_aux.getData()>n) && !(tree_aux.getData()%2 ==0) ) //condicion de q sea mayor a n e impar
		   result.add(tree_aux.getData()); //agrego elemento a la lista resultante
		 
		 List<GeneralTree<Integer>> children = tree_aux.getChildren();
		 for (GeneralTree<Integer> child: children) {
		 queue.enqueue(child);
		 }
		 }
		 return result;

	}
	
	
}