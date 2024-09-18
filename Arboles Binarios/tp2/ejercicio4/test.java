package tp2.ejercicio4;

import tp2.ejercicio1.BinaryTree;

public class test {
	public static void main(String[] args){
		
		RedBinariaLlena RB = new RedBinariaLlena ();
		
	
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(25);
		hijoIzq.addLeftChild(new  BinaryTree<Integer>(10));
		hijoIzq.addRightChild(new  BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(20);
		
		ab.addLeftChild(hijoIzq);
		ab.addRightChild(hijoDer);
		
		
		int retardo = RB.retardoReenvio(ab);
		
		System.out.println("el maximo retardo del arbol es: "+retardo+" segundos");

}
	
}	
	
