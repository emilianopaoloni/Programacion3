package tp3.ejercicio10;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;
import tp3ejercicio7.Caminos;

public class ej10TEST {
	
public static void main(String[] args){ //FUNCIONA
		
		//---------------creo arbol-----------------------
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(0); 
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(0));
		children2.add(new GeneralTree<Integer>(0));
		children2.add(new GeneralTree<Integer>(1));
		children2.get(2).getChildren().add(new GeneralTree<Integer>(1));
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(1, children2);
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		children3.add(new GeneralTree<Integer>(0));
		children3.add(new GeneralTree<Integer>(1));
		GeneralTree<Integer> a3 = new GeneralTree<Integer>(1, children3);
		List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTree<Integer> a = new GeneralTree<Integer>(1, childen);
		//----------------------------------------------------
		
		//Caminos C = new Caminos(a);
		
		System.out.println("Datos del Arbol preOrder: ");
		a.preOrder();
		
		System.out.println("camino mas largo desde raiz a una hoja  ");
		List<Integer> caminoMaximo = Parcial.resolver(a);
		
		
		for(int elem: caminoMaximo) {
			System.out.println(elem);
		}

 }
}


