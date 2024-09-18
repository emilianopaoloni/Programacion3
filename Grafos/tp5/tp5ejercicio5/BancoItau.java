package tp5ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import tp5ejercicio1.Edge;
import tp5ejercicio1.Graph;
import tp5ejercicio1.Vertex;

public class BancoItau {

	
	/* public List<String> bfs(Grafo<Persona> grafo, Persona p, int distancia) {
	     boolean[] marca = new boolean[new boolean[grafo.getSize()]];
	     List<String> listaJubilados = new List<String>();
	     for (int i = 1; i <= marca.length; i++) {
	        if (!marca[i]){
	            this.bfs(i, grafo, marca, distancia, listaJubilados );  //las listas empiezan en la pos 1
	        }
	     }
	     
	     return listaJubilados;
	 }
	 */
	 
	 
	 public ArrayList<Persona> bfsModificado(int i, Graph<Persona> grafo, Persona empleado, int distancia) {
		       boolean[] marca = new boolean[grafo.getSize()];
	           List<Persona> listaJubilados = new ArrayList<Persona>();  	 
	           int dimL=0;
	           int nivel=0; //esto cuenta el "nivel de adyacencias"
	           Vertex<Persona> verticeInicio = grafo.search(empleado);
		 
			   Queue<Vertex<Persona>> q = new Queue<Vertex<Persona>>(); 
			   marca[verticeInicio.getPosition()]=true;
			   q.enqueue(empleado);
			   q.enqueue(null);
			 
			   while (!q.isEmpty()) {
			       Vertex<Persona> w = q.dequeue();
			       if(w.getData().esJubilado())
			    	   listaJubilados.add(w.getData());
			       if (w!=null) {
			       // para todos los vecinos de w:
			       List<Edge<Persona>> adyacentes = grafo.getEdges(w); //lista de adyacencias
			       for (Edge<Persona> e: adyacentes) { //para cada adyacente
			           int j = e.getTarget().getPosition();
			           Vertex<Persona> verticeDestino = e.getTarget();
			           if (!marca[j]) {
			        	   marca[j] = true;
			        	   if((verticeDestino.getData().esJubilado() ) && (nivel<=2))
			        		   q.enqueue(verticeDestino); //SOLO ENCOLO JUBILADOS que estan a un nivel de adyacencia menor o igual a 2
			           }
			        }
			      }
			      else if (!queue.isEmpty) { //significa q desencole un null
			    	   nivel++; //aumento nivel de adyacecias
			    	   queue.enqueue(null);
			       }
			      
	           }
	 return listaJubilados;	   

      }
}
