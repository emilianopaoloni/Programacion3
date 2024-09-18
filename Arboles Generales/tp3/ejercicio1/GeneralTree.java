package tp3.ejercicio1;

import java.util.List;


import tp1.ej8.Queue;

import java.util.LinkedList;

public class GeneralTree<T> {
	
		private T data;
		private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>();

		public GeneralTree(T data) {
			this.data = data;
		}

		public GeneralTree(T data, List<GeneralTree<T>> children) {
			this(data);
			this.children = children;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public void setChildren(List<GeneralTree<T>> children) {
			if (children != null)
				this.children = children;
		}

		public List<GeneralTree<T>> getChildren() { //si NO tiene hijos, devuelve una lista VACIA  (no null)
			return this.children;
		}

		public void addChild(GeneralTree<T> child) {
			this.getChildren().add(child);
		}

		public boolean isLeaf() {
			return !this.hasChildren();
		}

		public boolean hasChildren() {
			return children != null && !children.isEmpty();
		}

		public boolean isEmpty() {
			return this.data == null && !hasChildren();
		}

		public void removeChild(GeneralTree<T> child) {
			if (this.hasChildren()) {
				List<GeneralTree<T>> children = this.getChildren();
				if (children.contains(child))
					children.remove(child);
			}
		}
		
		 public void preOrder() {
			 System.out.println(getData());
			 List<GeneralTree<T>> children = this.getChildren();
			 for (GeneralTree<T> child: children) {
			 child.preOrder();
			 }
			 }
		 
		 public void inOrder() { //primero hijo, despues raiz, despues resto de la lista
				List<GeneralTree<T>> children = this.getChildren(); //primero obtengo lista de hijos
				
				if(this.hasChildren())
					children.get(0).inOrder(); //proceso solo el primero de la lista de hijos
				
				System.out.println(this.getData());
			
			//ACA no hace falta preguntar si children es null, ya que si un nodo NO tiene hijos, children esta VACIA y el bucle q viene no se ejecuta directamente porque i<0 nunca pasa
			    for(int i=1; i<children.size(); i++) { //sigo procesando cada elemento de la lista --> empieza en i=1 pq ya procese el primer elemento
			    	children.get(i).inOrder();
			    }
					  	
			}
		 
		 public void postOrder() { //primero todos los hijos, despues nodo padre
			 List<GeneralTree<T>> children = this.getChildren();
			 for (GeneralTree<T> child: children) { //postOrder con todos los hijos
			 child.postOrder();
			 }
			 System.out.println(getData());
			 }
		 

		 
		
		 
		 public int  altura() { //funciona
			 
			 if(this.isLeaf()) //caso base si es una hoja --> la altura de una hoja es CERO
				 return 0;
			 
			 int alturaMaxima = 0;
			 
			 for(GeneralTree<T> child: this.getChildren()) { //por cada elemento (child) de la lista de hijos
				int  alturaHijo = 1 + child.altura();
				if(alturaHijo>alturaMaxima) //la comparacion se hace entre nodos hermanos
					alturaMaxima = alturaHijo;
				    
			 }
			 
			 return alturaMaxima ;
			 
		 }
		 
		 
			 
		 
		 public int nivel(T dato) {
			 
			 int nivelActual=0; // nivel en q se encuentra
			 int nodosEnNivelSiguiente=0; // nodos proximos a procesar, esta variable se incrementa cada ves que se ENCOLA un hijo del nodo actual
			 int nodosRestantes= 1; //nodos proximos a procesar del NIVEL ACTUAL
			
			 GeneralTree<T> tree_aux; 
			 Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>(); //creo queue de generalTree
			  queue.enqueue(this); //encolo el arbol entero
			  boolean encontro=false;
			  while ((!queue.isEmpty()) && (encontro==false)) {
			    tree_aux = queue.dequeue();
			    nodosRestantes--;
			    if(this.data.equals(dato))
				    encontro=true;
			    List<GeneralTree<T>> children = tree_aux.getChildren();
			    for (GeneralTree<T> child: children) {
			      queue.enqueue(child);
			      nodosEnNivelSiguiente++;
			     }
			    
			    if (nodosRestantes==0) {
			    	nivelActual++; //quiere decir q el proximo nodo a encolar es del nivel siguiente, aumento nivel
			    	nodosRestantes= nodosEnNivelSiguiente;
			    	nodosEnNivelSiguiente = 0;
			    }
			    
			  }
			 return nivelActual;
			  }
		 
		 
public int ancho() {
	         int nodosMax=0;
			 int nodosEnNivelSiguiente=0; // nodos proximos a procesar, esta variable se incrementa cada ves que se ENCOLA un hijo del nodo actual
			 int nodosRestantes= 1; //nodos proximos a procesar del NIVEL ACTUAL
			
			 GeneralTree<T> tree_aux; 
			 Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>(); //creo queue de generalTree
			  queue.enqueue(this); //encolo el arbol entero
			 
			  while ((!queue.isEmpty())) {
			    tree_aux = queue.dequeue();
			    nodosRestantes--;
			    List<GeneralTree<T>> children = tree_aux.getChildren();
			    for (GeneralTree<T> child: children) {
			      queue.enqueue(child);
			      nodosEnNivelSiguiente++; //voy sumando nodos q voy a procesar en el siguiente nivel
			     }
			    
			    if (nodosRestantes==0) { //significa q cambio de nivel
			    	if(nodosEnNivelSiguiente > nodosMax)
			    		nodosMax= nodosEnNivelSiguiente; //actualizo nodosMax
			    	nodosRestantes= nodosEnNivelSiguiente;
			    	nodosEnNivelSiguiente = 0;
			    }
			    
			  }
			 return nodosMax;
			  }
		 

          public boolean esAncestro(T a, T b) { //primero encuentro sub arbol con dato a, luego mando ese subarbol a un private y veo si existe camino de a a b
        	  GeneralTree<T> nodoA = encontrarNodo(this, a); //encuentra nodo q contiene a
        	  if (nodoA == null)
        		  return false;
        	  return existeCamino(nodoA, b);
        	    	  
          }
          
          private boolean existeCamino(GeneralTree<T> arb, T b) {
        	  
        	  if (arb.getData().equals(b)) { //se encuentra nodo b
                  return true;
              }
        	  
        	  for (GeneralTree<T> child : arb.getChildren()) { //for each
                  boolean encontro = existeCamino(child, b);
                  if (encontro == true) { //se encontro el nodo
                      return encontro;
                  }
        	  }
        	  
        	  return false; //sale del for each y no encontro a nodo b
        	  
          }
          
          
          
          private GeneralTree<T> encontrarNodo(GeneralTree<T> arb, T a) {
        	  if (arb == null) {
                  return null;
              }
              if (arb.getData().equals(a)) {
                  return arb;
              }

              for (GeneralTree<T> child : arb.getChildren()) { //for each
                  GeneralTree<T> found = encontrarNodo(child, a);
                  if (found != null) { //se encontro el nodo
                      return found;
                  }
              }
           return null; //no se encontro el nodo q contiene a
          }
				


}
