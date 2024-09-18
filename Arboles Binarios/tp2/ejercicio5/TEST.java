package tp2.ejercicio5;

import tp2.ejercicio1.BinaryTree;

public class TEST {
	
public static void main(String[] args){
		
	
	
	
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(25);
		hijoIzq.addLeftChild(new  BinaryTree<Integer>(10));
		hijoIzq.addRightChild(new  BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(20);
		
		ab.addLeftChild(hijoIzq);
		ab.addRightChild(hijoDer);

		ProfundidadDeArbolbinario P = new ProfundidadDeArbolbinario (ab);
		
		
		int profundidad = 0;
		
		System.out.println("la suma de nodos que se encuentra a profundidad "+profundidad+" es de "+P.sumaElementosProfundidad(profundidad));

		//FUNCIONA
}

}
