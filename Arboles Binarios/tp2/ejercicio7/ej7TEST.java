package tp2.ejercicio7;

import tp2.ejercicio1.BinaryTree;

public class ej7TEST {
	
	public static void main(String[] args){
		
		
		BinaryTree<Integer> ab = new BinaryTree<Integer>(2);
		
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(7); //subArbol IZQ
		hijoIzq.addLeftChild(new  BinaryTree<Integer>(23));
		hijoIzq.addRightChild(new  BinaryTree<Integer>(6));
		hijoIzq.getLeftChild().addLeftChild(new  BinaryTree<Integer> (-3));
		hijoIzq.getRightChild().addLeftChild(new  BinaryTree<Integer> (55));
		hijoIzq.getRightChild().addRightChild(new  BinaryTree<Integer> (11));
		
		
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(-5); //subArbol DER
		hijoDer.addLeftChild(new  BinaryTree<Integer>(19));
		hijoDer.getLeftChild().addRightChild(new  BinaryTree<Integer> (4));
		hijoDer.getLeftChild().getRightChild().addLeftChild(new  BinaryTree<Integer> (18));
		
		ab.addLeftChild(hijoIzq);
		ab.addRightChild(hijoDer);
		
		ab.imprimirPorNiveles(); //chequeo que es el arbol del ejemplo
		System.out.println(" ");
		
		parcialArboles P = new parcialArboles (ab);
		int num=-5 ;
		
		if(P.isLeftTree(num))
			System.out.println("arbol cuya raiz es "+num+" es un arbol izquierdo");
		else
			System.out.println("arbol cuya raiz es "+num+" NO es un arbol izquierdo");
			

		
}

}
