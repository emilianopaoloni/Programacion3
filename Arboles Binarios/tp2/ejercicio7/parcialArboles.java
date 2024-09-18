package tp2.ejercicio7;

import tp2.ejercicio1.BinaryTree;

public class parcialArboles {
	
BinaryTree<Integer> a ;
	
	public parcialArboles (BinaryTree<Integer> a) { //constructor
		this.a = a;
	}

	
	public boolean isLeftTree (int num) {
		
		BinaryTree<Integer> abNum = new BinaryTree<Integer> (); //creo arbol vacio
		
		abNum = buscarNodoNum(this.a, num);     //busco en el arbol el nodo correspondiente a num
		
		if (abNum == null) { // * NO se encuentra num en el arbol, el metodo  devuelve FALSE
			return false; }
		
		else {
			
			 System.out.println("---------------");
			abNum.imprimirPorNiveles(); //chequeo que arbol se recibe
			System.out.println("---------------");
			
		  int cantDerecha=-1;
		  int cantIzquierda=-1; //si no tiene hijo izq o derecho, cant queda en -1
		
		  if(abNum.hasRightChild())
		    cantDerecha = contar_private(abNum.getRightChild());
		
		  if(abNum.hasLeftChild())
		     cantIzquierda = contar_private(abNum.getLeftChild());
		  
		  
		  System.out.println("cartel --> cant derecha:"+cantDerecha);
		  System.out.println("cartel --> cant izquierda:"+cantIzquierda);
		
	  	  if(cantIzquierda > cantDerecha)
			  return true;
		  else
			  return false;

		}
		
	 }
	
	private BinaryTree<Integer> buscarNodoNum(BinaryTree<Integer> abOriginal, int num ) { //recorrido PreOrden hasta encontrar nodo num y devuelve NODO NUM
		
		if(abOriginal== null) //arbol vacio
			return null;
		
	  	if(abOriginal.getData()== num) {
	  	    return abOriginal; //asigno a abNum el nodo que tiene num
	  	    
	  	}
	  	
	  	BinaryTree<Integer> encontradoIzquierda = buscarNodoNum(abOriginal.getLeftChild(), num); // Busca en el subárbol izquierdo
	    if (encontradoIzquierda != null) { // Si se encuentra en el subárbol izquierdo, retorna el resultado
	        return encontradoIzquierda;
	    }

	    BinaryTree<Integer> encontradoDerecha = buscarNodoNum(abOriginal.getRightChild(), num); // Busca en el subárbol derecho
	    if (encontradoDerecha != null) { // Si se encuentra en el subárbol derecho, retorna el resultado
	        return encontradoDerecha;
	    }
	  	
	  	
	  
	  	 return null; //no se encuentra, retorna null
		
	}
	
	private int contar_private (BinaryTree<Integer> ab) { //deuelve cantidad de nodos con un unico hijo (toma como raiz ab)
		
		
		if(ab.hasLeftChild() &&  ab.hasRightChild()){ //tiene dos hijos
			return contar_private(ab.getLeftChild()) + contar_private(ab.getRightChild());
			
		}
		else if(ab.hasLeftChild() && ! ab.hasRightChild()){ //tiene hijo izq pero no der
			 return 1 + contar_private(ab.getLeftChild());
		}
		
		else if(ab.hasRightChild() && ! ab.hasLeftChild()){ //tiene hijo der pero no izq
			return 1+ contar_private(ab.getRightChild());
			
		}
		
		else //no tiene hijos
			return 0;
		
	}
}

