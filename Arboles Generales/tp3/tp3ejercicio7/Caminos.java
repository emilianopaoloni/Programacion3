package tp3ejercicio7;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class Caminos {
	
	GeneralTree<Integer> arbol; //variable de instancia
	
	public Caminos(GeneralTree<Integer> a) { //constructor
		arbol = a;
	}
	
	//voy a necesitar una lista que represente el "camino actual" y otra que represente el "camino maximo"
	//cuando se llega a una hoja, es el momento de comparar caminos (comparar longitudes de las listas)
	//para renovar el caminoMaximo (lista maxima)
	
	 public List<Integer> caminoAHojaMasLejana () {
		 
		 LinkedList<Integer> caminoMaximo = new LinkedList<Integer> ();
		 LinkedList<Integer> caminoActual = new LinkedList<Integer> ();
		 
		 caminoAHojaMasLejana_private(arbol, caminoActual, caminoMaximo );
		 return caminoMaximo;
		 
	 }
	 
	 private void caminoAHojaMasLejana_private (GeneralTree<Integer> a, LinkedList<Integer> actual, LinkedList<Integer> maximo) {
		 actual.add(a.getData());
		 
		  if (a.isLeaf()) {//caso base, es una hoja --> comparo caminos
			  if (actual.size() > maximo.size()) {
					 maximo.clear(); //elimina todos los elementos de lista maximo
				  //for (int e: maximo) 
						//  maximo.remove(e); //borro TODOS los elem de lista maximo (pq la voy a actualizar       
				  for (int e: actual) 
					  maximo.add(e);  //agrego todos los elementos de actual a maximo
				   
			  }
		// maximo = actual NO PUEDO HACER ESTO PARA ACTUALIZAR PORQUE ESTARIAN APUNTANDO A LO MISMO Y CUANDO BORRE LO DE ACTUAL VOY A TERMINAR BORRANDO LO DE MAXIMO
		  
		  } else {
	    	  for(GeneralTree<Integer> child: a.getChildren()) {
	    		  
	    		  caminoAHojaMasLejana_private(child, actual, maximo);
	    		  actual.remove(child.getData()); //se elimina nodo que ya se recorrio (si fue camino maximo ya se guardo en maximo)
	    	  
	    	  }
	    	  
	    	  
	      }
	 }

}
