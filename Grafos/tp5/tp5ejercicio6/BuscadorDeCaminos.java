package tp5ejercicio6;

import java.util.ArrayList;
import java.util.List;

import tp5ejercicio1.Edge;
import tp5ejercicio1.Graph;
import tp5ejercicio1.Vertex;

public class BuscadorDeCaminos {
	
	Graph<String> bosque;

	public List < List <String>> recorridosMasSeguro() {
		
		Vertex<String> inicio = bosque.search("casa Caperucita");
		boolean [] marca = new boolean [bosque.getSize()];
		List < List<String> > caminos = new ArrayList <> (); // HAY QUE INICIALIZARLO CON NEW, SINO SE INICIALIZA EN NULL
		
		List<String> caminoActual = new ArrayList<String>(); //lista que voy llenando
		
		dfsCaminos(inicio.getPosition() , caminos, marca, caminoActual );
		
	return 	caminos;
	
	}
	
	private void dfsCaminos (int pos, List<List<String>> caminos, boolean[] marca, List<String> caminoActual ) {
           
		   caminoActual.add(bosque.getVertex(pos).getData());
		   marca[pos] = true;
			
			if(!bosque.getVertex(pos).getData().equals("casa abuelita")) {//si no se llego al vertice destino
				
			        Vertex<String> v = bosque.getVertex(pos);
			        List<Edge<Integer>> adyacentes = bosque.getEdges(v); //lista de aristas del vertice v
			
			        for(Edge<Integer> e: adyacentes) {//por cada arista (elemento de adyacentes)
			           int j = e.getTarget().getPosition(); //j=posicion del destino de la arista
			           int frutasDelCamino = e.getWeight(); //obtengo peso para ir hasta el vertice adyacente
				       if((!marca[j]) && (frutasDelCamino <= 5) ) //chequeo marca Y QUE peso no sea mayor a 5
					      dfsCaminos(j, caminos, marca, caminoActual);
			        }
			  
			}
			
			else { //se encontro un camino hasta casa abuelita
				
		        List<String> l = new ArrayList<String>();
		        l.addAll(caminoActual);
				caminos.add(l); //agrego camino actual a la lista de caminos posibles
				
               //NO HACER caminos.adAll(caminoActual) --> pporque se estaria copiando LA REFERENCIA, ESTA MAL
			}
			caminoActual.remove(caminoActual.size()-1); //se van eliminando los vertices en el backtracking
			marca[pos] = false; //desmarco vertice por si se vuyelve a armar un camino deesde ese vertice
		
		
	}
	
	
	
	
}
