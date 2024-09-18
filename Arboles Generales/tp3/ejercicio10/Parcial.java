package tp3.ejercicio10;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class Parcial {
	
	//public Parcial {} ;
	//INCOMPLETO: FALTA AGREGRAR QUE CALCULO MAX Y CALCULOACTUAL ESTEN EN UN OBJETO, PORQUE SINO
	//CUANDO SALE DE LA RECURSION, CALCULOMAX NO SE GUARDA BIEN, YA QUE ES UN PARAMETRO X VALOR
	
	public static List<Integer> resolver (GeneralTree<Integer> arbol) {
		 
		 LinkedList<Integer> caminoMaximo = new LinkedList<Integer> ();
		 LinkedList<Integer> caminoActual = new LinkedList<Integer> ();
		 int calculoMax=0;
		 int calculoAct=0; //calculo actual
		 mejorCamino(arbol, caminoActual, caminoMaximo, calculoMax, calculoAct, 0 );
		 return caminoMaximo;
		 
	 }
	 
	 private static void mejorCamino (GeneralTree<Integer> a, LinkedList<Integer> actual, LinkedList<Integer> maximo, int cm, int ca, int nivelActual) {
		 if(a.getData()==1) {
		      actual.add(a.getData()); //solo agrega si el nodo tiene 1
		      ca += 1*nivelActual; //DE DONDE SACO EL NIVEL 
		 }
		 
		  if (a.isLeaf()) {//caso base, es una hoja --> comparo caminos
			  if (ca > cm) {
				     cm=ca;
					 maximo.clear(); //elimina todos los elementos de lista maximo
				  //for (int e: maximo) 
						//  maximo.remove(e); //borro TODOS los elem de lista maximo (pq la voy a actualizar       
				  for (int e: actual) 
					  maximo.add(e);  //agrego todos los elementos de actual a maximo
				   
			  }
		// maximo = actual NO PUEDO HACER ESTO PARA ACTUALIZAR PORQUE ESTARIAN APUNTANDO A LO MISMO Y CUANDO BORRE LO DE ACTUAL VOY A TERMINAR BORRANDO LO DE MAXIMO
		  
		  } else {
	    	  for(GeneralTree<Integer> child: a.getChildren()) {
	    		  
	    		  mejorCamino(child, actual, maximo, cm, ca, nivelActual +1 );
	    		  actual.remove(child.getData()); //se elimina nodo que ya se recorrio (si fue camino maximo ya se guardo en maximo)
	    	  
	    	  }
	    	  
	    	  
	      }
	 }

}
