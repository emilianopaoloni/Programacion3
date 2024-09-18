package tp3ejercicio11;

import java.util.List;

import tp1.ej8.Queue;
import tp3.ejercicio1.GeneralTree;

public class Parcial11 { //funciona
	
	public static boolean resolver(GeneralTree<Integer> arbol) {
		
		int nodosNivActual=1; //lo inicializo en 1 pq en el nivel 0 hay 1 solo nodo --> RAIZ
		int nodosNivAnterior=0; //LO INICIALIZO EN 0 PARA QUE NO ENTRE AL IF LA PRIMERA VEZ EN LA LINEA (*)
		 int nodosEnNivelSiguiente=0; // nodos proximos a procesar, esta variable se incrementa cada ves que se ENCOLA un hijo del nodo actual
		 int nodosRestantes= 1; //nodos proximos a procesar del NIVEL ACTUAL, se usa para saber cuando CAMBIA DE NIVEL
		
		 GeneralTree<Integer> tree_aux; //arbol q se usa como auxiliar
		 Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>(); //creo queue de generalTree
		  queue.enqueue(arbol); //encolo el arbol entero
		  boolean cumple=true;
		  
		  while ((!queue.isEmpty()) && (cumple==true)) {
		    tree_aux = queue.dequeue();
		    nodosRestantes--;
		    List<GeneralTree<Integer>> children = tree_aux.getChildren();
		    for (GeneralTree<Integer> child: children) {
		      queue.enqueue(child);
		      nodosEnNivelSiguiente++;
		     }
		    
		    if (nodosRestantes==0) { //significa q ya se proceso todo el nivel
		    	 if (nodosNivActual != nodosNivAnterior+1) //(*) la primera vez no entra porque nodosNivAnterior se inicializo en 0
		    		 cumple = false;
		    	nodosNivAnterior = nodosNivActual;
		    	nodosRestantes= nodosEnNivelSiguiente;
		    	nodosNivActual= nodosEnNivelSiguiente;
		    	nodosEnNivelSiguiente = 0;
		    }
		    
		  }
		 return cumple;
		  }

}
