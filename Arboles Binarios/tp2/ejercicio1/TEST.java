package tp2.ejercicio1;

public class TEST {
	public static void main(String[] args){
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(25);
		hijoIzq.addLeftChild(new  BinaryTree<Integer>(10));
		hijoIzq.addRightChild(new  BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(78);
		
		ab.addLeftChild(hijoIzq);
		ab.addRightChild(hijoDer);
		
		
		int n=1;
		int m=2;
		
		//ab.entreNiveles(n,m);
		//System.out.println("-----------");
		//ab.imprimirPorNiveles();
		
		//System.out.println("-----------"); 
		
		int cantHojas;
		cantHojas = ab.contarHojas();
		System.out.println("la cantidad de hojas del arbol es de: "+cantHojas);
		
		
		//____________________________________________ PRUEBO EL ESPEJO:
		BinaryTree<Integer> ab1 = ab.espejo();
		ab.imprimirPorNiveles();
		System.out.println(" ");
		System.out.println("arbol espejo:");
		System.out.println(" ");
		ab1.imprimirPorNiveles();
		
	}
	
	

	
}
