package tp3.ejercicio1;

import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;

public class tp3ej1TEST {
	
	public static void main(String[] args){ //FUNCIONA
		
		//---------------creo arbol-----------------------
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(1); 
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(21));
		children2.add(new GeneralTree<Integer>(22));
		children2.add(new GeneralTree<Integer>(23));
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, children2);
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		children3.add(new GeneralTree<Integer>(31));
		children3.add(new GeneralTree<Integer>(32));
		GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);
		List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTree<Integer> a = new GeneralTree<Integer>(0, childen);
		//----------------------------------------------------
		
		RecorridosAG R = new RecorridosAG();
		
		System.out.println("Datos del Arbol postOrder: ");
		a.postOrder();
		System.out.println("---------------------");
		int n=0;
		List<Integer> l = R.numerosImparesMayoresQueInOrden(a,n);
		
		
		
		for(int e : l) //por cada elemento e de la lista l
			System.out.println(e); //imprimo elemento
		
		System.out.println("altura de arbo: "+ a.altura());
		
		System.out.println("nivel de nodo que contiene 3: "+a.nivel(1));
		
		System.out.println("el ANCHO del arbol es: "+a.ancho());

  }
}
