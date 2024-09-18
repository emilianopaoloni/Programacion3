package tp3ejercicio11;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;
import tp3.ejercicio10.Parcial;
import tp3ejercicio7.Caminos;

public class ej11TEST {
	
public static void main(String[] args){ //FUNCIONA
		
		//---------------creo arbol-----------------------
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(2); 
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(4));
		children2.add(new GeneralTree<Integer>(5));
		children2.add(new GeneralTree<Integer>(6));
		children2.get(2).getChildren().add(new GeneralTree<Integer>(7));
		children2.get(2).getChildren().add(new GeneralTree<Integer>(7));
		children2.get(2).getChildren().add(new GeneralTree<Integer>(7));
		//children2.get(2).getChildren().add(new GeneralTree<Integer>(7));
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(3, children2);
		List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
		childen.add(a1);childen.add(a2);
		GeneralTree<Integer> a = new GeneralTree<Integer>(1, childen);
		//----------------------------------------------------
		
		
		System.out.println("Datos del Arbol preOrder: ");
		a.preOrder();
		
		 if(Parcial11.resolver(a))
			 System.out.println("EL ARBOL ES CRECIENTE ");
		 else
			 System.out.println("EL ARBOL NOOO ES CRECIENTE ");
		
	

 }

}
