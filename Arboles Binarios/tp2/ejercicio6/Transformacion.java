package tp2.ejercicio6;

import tp2.ejercicio1.BinaryTree;

public class Transformacion {
	
	   BinaryTree<Integer> a ;
	   
	   public Transformacion () {} ;
		
		public Transformacion (BinaryTree<Integer> a) { //constructor
			this.a = a;
		}
		
		
		public BinaryTree<Integer> suma (){
			BinaryTree<Integer> abSuma = new BinaryTree<Integer>(); //creo el arbol que devuelve el metodo
			//abSuma = a;
			private_suma(a, abSuma);
			
			
			return abSuma;
		}
		
		private void private_suma(BinaryTree<Integer> a, BinaryTree<Integer> abSuma) {
			
			abSuma.setData(sumarSubArbol(a) - a.getData()); //se le resta el nodo "padre" porque no se quiere sumar ese valor
			
			if(a.hasLeftChild()) {
				abSuma.addLeftChild( new BinaryTree<Integer>() ); //creo nodo
				private_suma(a.getLeftChild(), abSuma.getLeftChild()); //le mando nodo que cree recien e hijo izq de arb original
							 
			}
			
			if(a.hasRightChild()) {
			  abSuma.addRightChild( new BinaryTree<Integer>() ); //creo nodo
			  private_suma(a.getRightChild(), abSuma.getRightChild());
			}
		}	

		
	   private int sumarSubArbol (BinaryTree<Integer> a) {
		   
		   if (a==null)
			   return 0;
		   
		   else {
			  int sumaIzq = sumarSubArbol(a.getLeftChild());
			  int sumaDer = sumarSubArbol(a.getRightChild());
			  
			  return sumaIzq + sumaDer + a.getData() ;
		   }
					   
	   }	

}
