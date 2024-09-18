package tp2.ejercicio8;

import tp2.ejercicio1.BinaryTree;

public class ej8TEST {
	
public static void main(String[] args){
		
		
		BinaryTree<Integer> ab1 = new BinaryTree<Integer>(65);
		
		BinaryTree<Integer> hijoIzq1 = new BinaryTree<Integer>(37); //subArbol IZQ
		hijoIzq1.addRightChild(new  BinaryTree<Integer>(47));
		
		BinaryTree<Integer> hijoDer1 = new BinaryTree<Integer>(81); //subArbol DER
		hijoDer1.addRightChild(new  BinaryTree<Integer>(93));

		ab1.addLeftChild(hijoIzq1);
		ab1.addRightChild(hijoDer1);
		
		//------------------------------------------------------------------
		
		BinaryTree<Integer> ab2 = new BinaryTree<Integer>(65);
		BinaryTree<Integer> hijoIzq2 = new BinaryTree<Integer>(37); //subArbol IZQ
		hijoIzq2.addLeftChild(new  BinaryTree<Integer>(22));
		hijoIzq2.addRightChild(new  BinaryTree<Integer>(47));
		hijoIzq2.getLeftChild().addLeftChild(new  BinaryTree<Integer> (11));
		hijoIzq2.getLeftChild().addRightChild(new  BinaryTree<Integer> (29));
		
		
		BinaryTree<Integer> hijoDer2 = new BinaryTree<Integer>(81); //subArbol DER
		hijoDer2.addRightChild(new  BinaryTree<Integer>(93));
		hijoDer2.addLeftChild(new  BinaryTree<Integer>(76));
		hijoDer2.getRightChild().addRightChild(new  BinaryTree<Integer> (94));
		hijoDer2.getRightChild().addLeftChild(new  BinaryTree<Integer> (85));
	
		
		ab2.addLeftChild(hijoIzq2);
		ab2.addRightChild(hijoDer2);
		//------------------------------------------------------------------
		
		System.out.println(" imprimo arbol1 por niveles--------- ");
		ab1.imprimirPorNiveles(); //chequeo que es el arbol1 del ejemplo
		System.out.println(" ");
		System.out.println(" in order:--------- ");
		ab1.printInorden();
		System.out.println(" ");
		System.out.println(" --------------------------------- ");
		System.out.println(" ");
		System.out.println(" imprimo arbol2 por niveles--------- ");
		ab2.imprimirPorNiveles();
		System.out.println(" ");
		System.out.println(" in order--------- ");
		ab2.printInorden();
		System.out.println(" ");
		System.out.println("-------------------------------- ");
		
		parcialArboles P = new parcialArboles ();
		
		if(P.esPrefijo(ab1,ab2))
			System.out.println("arbol 1 es prefijo de arbol2");
		else
			System.out.println("arbol 1 NO es prefijo de arbol2");

   }
}
