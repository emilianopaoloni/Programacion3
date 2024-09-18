package tp2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

import tp2.ejercicio1.BinaryTree;

public class TEST {
	
	public static void main(String[] args){
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(25);
		hijoIzq.addLeftChild(new  BinaryTree<Integer>(10));
		hijoIzq.addRightChild(new  BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(78);
		
		ab.addLeftChild(hijoIzq);
		ab.addRightChild(hijoDer);
		
		ContadorArbol CA = new ContadorArbol(ab); //creo instancia
		
		
		List<Integer> lista = new ArrayList();
		lista = CA.numerosPares_a();
		
		for (int i=0 ; i<lista.size() ; i++)
			System.out.println(lista.get(i));

}
	
}	
