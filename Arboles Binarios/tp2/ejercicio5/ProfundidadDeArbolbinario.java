package tp2.ejercicio5;

import tp1.ej8.Queue;
import tp2.ejercicio1.BinaryTree; //importo binaryTree

public class ProfundidadDeArbolbinario {
	
	BinaryTree<Integer> a ;
	
	
	public   ProfundidadDeArbolbinario (BinaryTree<Integer> a) { //constructor
		this.a = a;
	}
	
	public int sumaElementosProfundidad (int p) { //p es un valor de profundidad y el metodo devuelve la suma de elementos q estan a profundidad p
		                                          // si p=0, devuelve solo el nodo RAIZ
		                                 //uso el recorrer por niveles
		
		int profundidad=0;
		int suma=0;
     	 BinaryTree<Integer> ab = null;
     	 Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
     	 cola.enqueue(this.a);
        cola.enqueue(null);
     	 while (!cola.isEmpty() && p>=profundidad) {
     		 ab = cola.dequeue();
     		 if (ab != null) {
     			 
     			 if(profundidad== p) //solo suma nodo si se encuentra en una profundidad p o menor
     			         suma += ab.getData();
     			 
     			 if (ab.hasLeftChild()) {
     				 cola.enqueue(ab.getLeftChild());
     			 }
     			 if (ab.hasRightChild()) {
     				 cola.enqueue(ab.getRightChild());
     			 }
     		 } 
     		 else if (!cola.isEmpty()) {
     			 cola.enqueue(null);
     			 profundidad++;
     		 }
     	 }
		
     return suma;
	}

	
	

}
