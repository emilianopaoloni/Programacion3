package tp3.ejercicio4;

import java.util.List;

import tp1.ej8.Queue;
import tp3.ejercicio1.GeneralTree;

public class AnalizadorArbol {
	
	

	public AnalizadorArbol() {
		// TODO Auto-generated constructor stub
	}

	public int devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol) {
		     int sumaTiempo=0;
		     int promMax=0;
	         //int nodosMax=0;
			 int nodosEnNivelSiguiente=0; // nodos proximos a procesar, esta variable se incrementa cada ves que se ENCOLA un hijo del nodo actual
			 int nodosDelNivel = 1 ; //se inicializa en 1 pq el nivel 0 solo tiene la raiz
			 int nodosRestantes= 1; //nodos proximos a procesar del NIVEL ACTUAL
			
			 GeneralTree<AreaEmpresa> tree_aux; 
			 Queue<GeneralTree<AreaEmpresa>> queue = new Queue<GeneralTree<AreaEmpresa>>(); //creo queue de generalTree
			  queue.enqueue(arbol); //encolo el arbol entero
			  
			  while ((!queue.isEmpty())) {
			    tree_aux = queue.dequeue(); //voy sumando los tiempos de cada nivel
			    nodosRestantes--;
			    sumaTiempo+= tree_aux.getData().tardanza; 
			    List<GeneralTree<AreaEmpresa>> children = tree_aux.getChildren();
			    
			    for (GeneralTree<AreaEmpresa> child: children) {
			      queue.enqueue(child);
			      nodosEnNivelSiguiente+=1; //voy sumando nodos q voy a procesar en el siguiente nivel
		
			     }
			   // CARTEL System.out.println("nodos restantes "+nodosRestantes);//
			    // CARTEL System.out.println("nodos sig niv: "+nodosEnNivelSiguiente); //
			    
			    if (nodosRestantes==0) { //significa q cambio de nivel
			    	int promedio = sumaTiempo / nodosDelNivel ; //calculo promedio de nivel actual
			    	System.out.println("promedio nivel n "+promedio); //
			    	if(promedio > promMax)
			    		promMax=promedio;
			    	sumaTiempo=0; //reinicio suma tiempo   
			    	nodosDelNivel= nodosEnNivelSiguiente; //asigno nodos 
			    	nodosRestantes= nodosEnNivelSiguiente;
			    	nodosEnNivelSiguiente = 0;
			    	
			    }
			    
			  }
			 return promMax;
			  }
	}
	

