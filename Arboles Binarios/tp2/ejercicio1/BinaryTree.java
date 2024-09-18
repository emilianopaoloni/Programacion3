package tp2.ejercicio1;

import java.awt.List;

import tp1.ej8.Queue; //lo importo para poder hacer imprimir por niveles

public class BinaryTree <T> {
	
    private T data;
    private BinaryTree<T> leftChild;   
    private BinaryTree<T> rightChild;
    
    public BinaryTree() {  //constructor
   	 super();
    }
    public BinaryTree(T data) { //constructor:  inicializa un árbol con el dato pasado como parámetro y ambos hijos nulos.
   	 this.data = data;
    }

    public T getData() {
   	 return data;
    }

    public void setData(T data) {
   	 this.data = data;
    }
   
    public BinaryTree<T> getLeftChild() {  //PREGUNTAR ANTES DE INVOCAR SI hasLeftChild()
   	 return leftChild;                      //Si no tiene el hijo tira error
    }
    public BinaryTree<T> getRightChild() { //PREGUNTAR ANTES DE INVOCAR SI hasRightChild()
   	 return rightChild;
    }

    public void addLeftChild(BinaryTree<T> child){
   	 this.leftChild = child;
    }
    
    public void addRightChild(BinaryTree<T> child) {
      	 this.rightChild = child;
       }

       public void removeLeftChild() {
      	 this.leftChild = null;
       }
       public void removeRightChild() {
      	 this.rightChild = null;
       }

       public boolean isEmpty(){
      	 return (this.isLeaf() && this.getData() == null);
       }

       public boolean isLeaf() {     //indica si no tiene hijos (es una HOJA)

      	return (!this.hasLeftChild() && !this.hasRightChild());
       }
       public boolean hasLeftChild() {
      	 return this.leftChild!=null;
       }

       public boolean hasRightChild() {
      	 return this.rightChild!=null;
       }
       @Override
       public String toString() {
      	 return this.getData().toString();
       }
       
       public int contarHojas() { //funciona
    	   
    	   if(this==null) //arbol vacio
    		   return 0;
    	  
    	   
    	   if(!this.hasRightChild() && !this.hasLeftChild()) //es una HOJA
    		   return 1;
    	   
    	   int hojasIzq= 0;
    	   int hojasDer= 0;
    		
    	  if(this.hasRightChild())
    		  hojasDer = this.getRightChild().contarHojas();
    				   
    	  if(this.hasLeftChild())
   		     hojasIzq = this.getLeftChild().contarHojas();
    				 
    		   
    	return(hojasDer + hojasIzq);
       }

      
       public BinaryTree<T> espejo () { //funciona
    	   
    	   BinaryTree<T> Mirror= new BinaryTree<T>(this.getData());
       	if(this.hasLeftChild())
       		Mirror.addRightChild(this.getLeftChild().espejo()); //agrega el nodo hijo izq al nodo hijo derecho pero HECHO ESPEJO
       	if(this.hasRightChild())
   			Mirror.addLeftChild(this.getRightChild().espejo()); //agrega el nodo hijo der. al nodo hijo izq pero hecho espejo
       	
       	return Mirror;
    	   
       }
       
       
       
       
       public void entreNiveles (int n, int m) { //funciona
    	         int altura=1;
    	      	 BinaryTree<T> ab = null;
    	      	 Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
    	      	 cola.enqueue(this);
    	         cola.enqueue(null);
    	      	 while (!cola.isEmpty()) {
    	      		 ab = cola.dequeue();
    	      		 if (ab != null) {
    	      			 if(altura>=n && altura<=m) //solo imprime si el nivel es entre n y m
    	      			         System.out.print(ab.getData());
    	      			 if (ab.hasLeftChild()) {
    	      				 cola.enqueue(ab.getLeftChild());
    	      			 }
    	      			 if (ab.hasRightChild()) {
    	      				 cola.enqueue(ab.getRightChild());
    	      			 }
    	      		 } 
    	      		 else if (!cola.isEmpty()) {
    	      			 System.out.println();
    	      			 cola.enqueue(null);
    	      			 altura++;
    	      		 }
    	      	 }
    	       }
       
       
       public void imprimirPorNiveles() {
    	   	 BinaryTree<T> ab = null;
    	   	 Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
    	   	 cola.enqueue(this);
    	      cola.enqueue(null);
    	   	 while (!cola.isEmpty()) {
    	   		 ab = cola.dequeue();
    	   		 if (ab != null) {
    	   			 System.out.print(ab.getData());
    	   			 if (ab.hasLeftChild()) {
    	   				 cola.enqueue(ab.getLeftChild());
    	   			 }
    	   			 if (ab.hasRightChild()) {
    	   				 cola.enqueue(ab.getRightChild());
    	   			 }
    	   		 } else if (!cola.isEmpty()) {
    	   			 System.out.println();
    	   			 cola.enqueue(null);
    	   		 }
    	   	 }
    	    }
       
    


       public void printInorden() {
    	   
    	  	 if (this.hasLeftChild()) {
    	  		 this.getLeftChild().printInorden();
    	  	 }
    	  	 
    	  	System.out.println(this.getData());
    	  	 
    	  	 if (this.hasRightChild()) {
    	  		 this.getRightChild().printInorden();
    	  	 }
    	 }
       
       
       
       }


