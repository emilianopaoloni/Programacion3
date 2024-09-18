package tp3ejercicio6;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;


public class tp3ej6TEST {
	
	public static void main(String[] args){
		
		//---------------creo arbol con chat gpt-----------------------
	    // Crear los nodos para el árbol
		
		GeneralTree<String> a2 = new GeneralTree<String>("B");
		GeneralTree<String> a3 = new GeneralTree<String>("C");
		GeneralTree<String> a4 = new GeneralTree<String>("D");
		GeneralTree<String> a5 = new GeneralTree<String>("E");
		GeneralTree<String> a6 = new GeneralTree<String>("F");
		GeneralTree<String> a7 = new GeneralTree<String>("G");
		GeneralTree<String> a8 = new GeneralTree<String>("H");
		GeneralTree<String> a9 = new GeneralTree<String>("I");
		GeneralTree<String> a10 = new GeneralTree<String>("J");
		GeneralTree<String> a11 = new GeneralTree<String>("K");
		GeneralTree<String> a12 = new GeneralTree<String>("L");
		GeneralTree<String> a13 = new GeneralTree<String>("M");
		GeneralTree<String> a14 = new GeneralTree<String>("N");
        // Crear las listas de hijos para cada nodo
		List<GeneralTree<String>> children4 = new LinkedList<>(); //lista con M y N
		children4.add(a13);
		children4.add(a14);
		
		a10.setChildren(children4);
		
		List<GeneralTree<String>> children3 = new LinkedList<>(); //lista con F y G
        children3.add(a6);
        children3.add(a7);
        
        a3.setChildren(children3);
        
        List<GeneralTree<String>> children2 = new LinkedList<>(); // H I J K
        children2.add(a8);
        children2.add(a9);
        children2.add(a10);
        children2.add(a11);
        
        a4.setChildren(children2);

        List<GeneralTree<String>> children1 = new LinkedList<>(); // B , C, D y E
        children1.add(a2);
        children1.add(a3);
        children1.add(a4);
        children1.add(a5);
        

        // Crear el árbol general con la raíz y sus hijos
        GeneralTree<String> arbol = new GeneralTree<String>("A", children1);
        
        arbol.preOrder(); //se cargo bien
        
        RedDeAguaPotable red = new RedDeAguaPotable(arbol);
        
       System.out.println("el caudal minimo de la red es: "+red.minimoCaudal(1000));
    }
}
