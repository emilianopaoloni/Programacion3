package tp5ejercicio4;

import java.util.ArrayList;
import java.util.List;

import tp5ejercicio1.Edge;
import tp5ejercicio1.Graph;
import tp5ejercicio1.Vertex;

public class VisitaOslo {
	
	public  List<String> paseoEnBici(Graph<String> lugares, String destino, int maxTiempo, List<String> lugaresRestringidos) {
		 
	      List<String> caminoActual= new ArrayList<String>() ; 
	      List<String> caminoDevolver= new ArrayList<String>() ; 
	      
	     // Graph<String> g = lugares; //  **es necesario esto? o puedo usar directamente "luagres"
	      boolean marca [] = new boolean [lugares.getSize()] ;
	      Vertex<String> v = lugares.search("Ayuntamiento");
	    //SE MARCAN LOS VERTICES DE LAS ZONAS RESTRINGUIDAS PARA NO PASAR POR ESAS ZONAS:
	    	for (String lugar : lugaresRestringidos) {
	                Vertex<String> vertex = lugares.search(lugar);
	                    marca[vertex.getPosition()] = true;
	                }
	      
	      dfsModificado(v.getPosition(), lugares, caminoActual, caminoDevolver, marca,  destino, maxTiempo, 0) ;
	    	  
	      
		 
		 return caminoDevolver; 

	}
		 
		 private void dfsModificado(int pos, Graph<String> grafo, List<String> caminoActual,List<String> caminoDevolver, boolean [] marca ,String destino, int maxTiempo, int tiempoRestar) {
		 
			 marca[pos] = true;
			 caminoActual.add(grafo.getVertex(pos).getData()); //agrego ciudad a la lista
				maxTiempo = maxTiempo - tiempoRestar; //se resta el peso de la arista anterior
				
				if(!grafo.getVertex(pos).getData().equals(destino)) {//si no se llego al vertice destino
					
				        Vertex<String> v = grafo.getVertex(pos);
				        List<Edge<String>> adyacentes = grafo.getEdges(v); //lista de aristas del vertice v
				
				        for(Edge<String> e: adyacentes) {//por cada arista (elemento de adyacentes)
				           int j = e.getTarget().getPosition(); //j=posicion del destino de la arista
				           int tiempoProximoDestino = e.getWeight(); //obtengo cantidad de tiempo para ir hasta el vertice adyacente
					       if((!marca[j]) && (maxTiempo > tiempoProximoDestino) ) //chequeo marca Y QUE NO SE TERMINE EL COMBUSTIBLE
						      dfsModificado(j, grafo, caminoActual,caminoDevolver, marca, destino, maxTiempo, tiempoProximoDestino);
				        }
				  caminoActual.remove(caminoActual.size()-1); 
				  maxTiempo = maxTiempo + tiempoRestar;
				  marca[pos] = false; //desmarco vertice para que se puedan ver sus adyacencias????? ***
				}       
				else { //se llego a destino
					caminoDevolver.addAll(caminoActual);
					
				}
	}
		 
		 

}
