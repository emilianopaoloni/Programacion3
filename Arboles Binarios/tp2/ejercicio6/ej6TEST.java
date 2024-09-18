package tp2.ejercicio6;

import tp2.ejercicio1.BinaryTree;
public class ej6TEST {
	
	public static void main(String[] args){
		
		
			BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
			BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(25);
			hijoIzq.addLeftChild(new  BinaryTree<Integer>(10));
			hijoIzq.addRightChild(new  BinaryTree<Integer>(32));
			BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(20);
			
			ab.addLeftChild(hijoIzq);
			ab.addRightChild(hijoDer);
			
			Transformacion T = new Transformacion (ab);

			
			BinaryTree<Integer> ab1 = T.suma();
			
			ab1.imprimirPorNiveles();
	}

}
