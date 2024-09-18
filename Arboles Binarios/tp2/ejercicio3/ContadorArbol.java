package tp2.ejercicio3;

import tp2.ejercicio1.BinaryTree;
import java.util.ArrayList;
import java.util.List;


public class ContadorArbol {

	 private BinaryTree<Integer> ab;
	 
	 public  ContadorArbol (BinaryTree<Integer> a) { //constructor
			this.ab = a;
		}
	 
	 public List<Integer>  numerosPares_a() {
		 
		 ArrayList <Integer> l = new ArrayList<>();
		 numerosParesIORecursivo(ab, l);
		 
		 return l;
		 
	 }
	 
	 
     public ArrayList<Integer>  numerosPares_b() {
		 
		 ArrayList <Integer> l = new ArrayList<>();
		 numerosParesPORecursivo(ab, l);
		 
		 return l;
	 }
	 
	 public void numerosParesIORecursivo( BinaryTree<Integer> ab, ArrayList<Integer> l) { //con  recorrido InOrder
		 
		 if (ab.hasLeftChild()) {
			 numerosParesIORecursivo(ab.getLeftChild(), l);
	  	 }
	  	 
	  	if(ab.getData() % 2 ==0) 
	  		l.add(ab.getData()); //si es par se agrega a la lista
	  	 
	  	 if (ab.hasRightChild()) {
	  		numerosParesIORecursivo(ab.getRightChild(), l);
	  	 }
	 }
	 
     public void numerosParesPORecursivo(BinaryTree<Integer> ab, ArrayList<Integer> l) { //con recorrido PostOrden
		 
    	 if (ab.hasLeftChild()) {
    		 numerosParesPORecursivo(ab.getLeftChild(), l);
      	 }
      	
      	 
      	 if (ab.hasRightChild()) {
      		numerosParesPORecursivo(ab.getRightChild(), l);
      	 }
      	 
     	if(ab.getData() % 2 ==0) //si es par se agrega a la lista
	  		l.add(ab.getData()); 
      	
	 }
     
}




