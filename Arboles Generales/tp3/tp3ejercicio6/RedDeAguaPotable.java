package tp3ejercicio6;


import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class RedDeAguaPotable {
	
	private  GeneralTree<String> arbol  ; //variable de instancia: arbol
	
	public RedDeAguaPotable(GeneralTree<String> a) {
	  this.arbol = a;
     }	  
	
	public double minimoCaudal(double caudal) {
		return  minimoCaudal_private(caudal, this.arbol); //le mando el arbol (variable de la clase)
	}
	
	private double minimoCaudal_private(double caudal, GeneralTree<String> a) { //se envia como parametro el caudal inicial

		 
	  if(a.isLeaf()) //caso base si es una hoja --> retorno caudal 
		 return caudal;
	 
	 double caudalMinimo = 9999999;
	 
	 int cantNodos = a.getChildren().size(); //cantidad de hijos del NODO
	 
	 for(GeneralTree<String> child: a.getChildren()) { //por cada elemento (child) de la lista de hijos
		double  caudalHijo =  minimoCaudal_private(caudal/cantNodos, child); 
		if(caudalHijo<caudalMinimo) //la comparacion se hace entre nodos hermanos
			caudalMinimo = caudalHijo;
	 }
	 
	 return caudalMinimo ;
	 
	}


}
