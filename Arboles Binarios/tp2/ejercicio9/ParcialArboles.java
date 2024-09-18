package tp2.ejercicio9;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {
	

	public ParcialArboles() {
		// TODO Auto-generated constructor stub
	}

	public BinaryTree<NodoDoble> sumAndDif(BinaryTree<Integer> ab1){
	
	
	BinaryTree<NodoDoble> ab2 = new BinaryTree<NodoDoble>(); //creo arbol q voy a retornar
	
	agregarNodos(ab1, ab2, 0, 0);
	
	return ab2;

}
	
	private void agregarNodos(BinaryTree<Integer> ab1, BinaryTree<NodoDoble> ab2, int nodoPadre, int suma) {
		int suma1 = suma + ab1.getData(); //suma1 se usa como auxiliar
		
		NodoDoble n = new NodoDoble() ; //creo un nuevo  objeto nodoDoble
		ab2.setData(n); //le asigno el objeto al nodo de ab2
		ab2.getData().setSuma(suma1) ; 
		ab2.getData().setDiferencia(ab1.getData() - nodoPadre);  
		
		if(ab1.hasRightChild()) {
			
		    ab2.addRightChild( new BinaryTree<NodoDoble>() ); //creo nodo en HIJO DERECHO en ab2
			agregarNodos(ab1.getRightChild(), ab2.getRightChild(), ab1.getData(), suma1 );
		}
		if(ab1.hasLeftChild()) {
			ab2.addLeftChild( new BinaryTree<NodoDoble>() ); //creo nodo en HIJO IZQ en ab2
			agregarNodos(ab1.getLeftChild(), ab2.getLeftChild(), ab1.getData(), suma1 );
		}	
	}	
		
	}
