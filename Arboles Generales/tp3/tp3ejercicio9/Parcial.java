package tp3ejercicio9;

import tp3.ejercicio1.GeneralTree;

public class Parcial { //el arbol se debe recorrer si o si UNA SOLA VEZ
	
	Parcial(){}
	
	public  boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		
		int menorHijo=arbol.getData(); //inicializo con el primer nodo
		boolean cumple= true;
		for (GeneralTree<Integer> child: arbol.getChildren()) { //for each - calculo el hijo menor
		 if (child.getData() < menorHijo)
			 menorHijo = child.getData() ;
		 
		 cumple =  cumple &&  esDeSeleccion(child); // ANIDAS CONDICIONES --> CON AND
		}
		
		if(arbol.getData() != menorHijo)
			cumple = false;
		
	 return cumple	;
		
	}

}
