package tp2.ejercicio9;

import tp2.ejercicio1.BinaryTree;
import tp2.ejercicio9.ParcialArboles;

public class ej9TEST {
	
	public static void main(String[] args){ //FUNCIONA
	
	BinaryTree<Integer> ab1 = new BinaryTree<Integer>(20);
	
	BinaryTree<Integer> hijoIzq1 = new BinaryTree<Integer>(5); //subArbol IZQ
	hijoIzq1.addRightChild(new  BinaryTree<Integer>(10));
	
	BinaryTree<Integer> hijoDer1 = new BinaryTree<Integer>(30); //subArbol DER
	hijoDer1.addRightChild(new  BinaryTree<Integer>(-9));

	ab1.addLeftChild(hijoIzq1);
	ab1.addRightChild(hijoDer1);
	
	System.out.println(" imprimo arbol1 por niveles--------- ");
	ab1.imprimirPorNiveles(); //chequeo que es el arbol1 del ejemplo
	System.out.println(" ");
	System.out.println(" in order:--------- ");
	ab1.printInorden();
	System.out.println(" ");
	System.out.println(" --------------------------------- ");

	ParcialArboles P = new ParcialArboles (); 
	BinaryTree<NodoDoble> ab2 = P.sumAndDif(ab1);
	
	System.out.println(" imprimo PRIMEROS NODOS DEL ARBOL DE  NODO DOBLE  ");
	System.out.println("SUMA NODO RAIZ: "+ ab2.getData().getSuma());
	System.out.println("DIF NODO Raiz: "+ ab2.getData().getDiferencia());
	System.out.println("--------- ");
	System.out.println("SUMA NODO HI: "+ ab2.getLeftChild().getData().getSuma());
	System.out.println("DIF NODO HI: "+ ab2.getLeftChild().getData().getDiferencia());
	System.out.println("--------- ");
	System.out.println("SUMA NODO HD: "+ ab2.getRightChild().getData().getSuma());
	System.out.println("DIF NODO HD: "+ ab2.getRightChild().getData().getDiferencia());
	System.out.println("--------- ");
	System.out.println("SUMA NODO HI del HI: "+ ab2.getLeftChild().getRightChild().getData().getSuma());
	System.out.println("DIF NODO HI del HI: "+ ab2.getLeftChild().getRightChild().getData().getDiferencia());
	System.out.println("--------- ");
	System.out.println("SUMA NODO HD del HD: "+ ab2.getRightChild().getRightChild().getData().getSuma());
	System.out.println("DIF NODO HD del HD: "+ ab2.getRightChild().getRightChild().getData().getDiferencia());
	System.out.println("--------- ");
	
   }
}	
	
	
