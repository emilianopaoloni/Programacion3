package tp5ejercicio3;

import java.util.ArrayList;

import tp5ejercicio1.Vertex;

public class ObjCaminos {
	
	private ArrayList<String> caminoMin = new ArrayList<String> ();
	private int pesoMin;
	
    //private ArrayList<Vertex<String>> caminoActual;
	//el camino actual y el peso alctual los dejo como parametros 
    
   // public objCaminos() {} //constructor -> no hace falta ponerlo, el compilador lo hace solo

    
    public ArrayList<String> getCaminoMin () {
    	return caminoMin;
    }
    
    public void setCaminoMin (ArrayList<String> l ) {
    	this.caminoMin = l;
    }
    
    public void setPesoMin (int p) {
    	this.pesoMin=p;
    }
    
    public int getPesoMin () {
    	return pesoMin;
    }

}
    	
    	
    
    
    /*public ArrayList<String>> getCaminoActual() {
    	return caminoActual;
    }
    
   
    
    public void setCaminoActual (ArrayList<Vertex<String>> l) {
   	 this.caminoActual = l;
   	
   } */

