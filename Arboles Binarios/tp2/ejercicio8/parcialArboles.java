package tp2.ejercicio8;

import tp2.ejercicio1.BinaryTree;

public class parcialArboles {
	
   BinaryTree<Integer> a ;
	
	public parcialArboles (BinaryTree<Integer> a) { //constructor
		this.a = a;
	}
	
	
	
	public parcialArboles() {
		// TODO Auto-generated constructor stub
	}

	public boolean esPrefijo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) { //ir recorriendo ARBOL1 y a la par arbol 2 y comparando mismos nodos, donde no coincidan ya es falso, sino es V
		
		if (a1==null)
			return true; //significa q se recorrio al arbol x completo
		
		if (a2==null || (a1.getData() != a2.getData() ) ) 
			return false;
		
		//analizo HI y HD:
		return esPrefijo(a1.getRightChild(), a2.getRightChild()) && esPrefijo(a1.getLeftChild(), a2.getLeftChild()); //significa q ya se recorrio todo el arbol1 (y a la par el arbol2) y siempre coincidieron los nodos
		}
		
	


}
