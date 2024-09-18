package tp3ejercicio9;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class ej9TEST {

	
public static void main(String[] args){ //FUNCIONA
		
		//---------------creo arbol-----------------------
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(1); //nodo a1 SIN HIJOS
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(21));
		children2.add(new GeneralTree<Integer>(22));
		children2.add(new GeneralTree<Integer>(23));
		//children2.get(2).getChildren().add(new GeneralTree<Integer>(100));
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(21, children2);
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		children3.add(new GeneralTree<Integer>(3));
		children3.add(new GeneralTree<Integer>(4));
		GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);
		List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTree<Integer> a = new GeneralTree<Integer>(1, childen);
		//----------------------------------------------------
		
		Parcial P = new Parcial();
		
		System.out.println("Datos del Arbol preOrder: ");
		a.preOrder();
		
		if (P.esDeSeleccion(a))
		    System.out.println("el arbol es de seleccion  ");
		else
			System.out.println("el arbol NO ES de seleccion  ");
		
}
}
