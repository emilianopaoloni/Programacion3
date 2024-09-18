package tp5ejercicio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import tp5ejercicio1.Edge;
import tp5ejercicio1.Graph;
import tp5ejercicio1.Vertex;

public class mapaCiudades {
	
	private Graph<String> grafo;
	
	
	
	/* devolverCamino (String ciudad1, String ciudad2): List<String> 
	Retorna la lista de ciudades que se deben atravesar para ir de ciudad1 a ciudad2 en caso
	 de que se pueda llegar, si no retorna la lista vacía. (Sin tener en cuenta el combustible). */
	
	//voy a urilizar DFS = recorrido en profundidad
	// ** TENGO EN CUENTA QUE SOLO EXISTE 1 CAMINO ENTRE CIUDAD1 Y CIUDAD2 NO?
	
	

	mapaCiudades(Graph<String> ciudades) {
		this.grafo = ciudades;
		
	}

	

	public List<String> devolverCamino (String ciudad1, String ciudad2) { //FUNCIONA
		ArrayList<String> caminoActual = new ArrayList<String>();
		ArrayList<String> caminoDevolver = new ArrayList<String>();
		
		boolean marca [] = new boolean [grafo.getSize()] ;
		
		Vertex<String> inicio = grafo.search(ciudad1);

			 
	    dfs1(inicio.getPosition(), marca, ciudad2, caminoActual, caminoDevolver) ; //empiezo recorrido desde ciudad2
	        
	    
	    	
	    return caminoDevolver; 
	    		
		
	}
	
	

	private void dfs1(int i, boolean[] marca, String ciudad2, ArrayList<String> caminoActual, ArrayList<String> caminoDevolver) {
		marca[i] = true;
		caminoActual.add(grafo.getVertex(i).getData()); //agrego ciudad a la lista
		
		if(!grafo.getVertex(i).getData().equals(ciudad2)) {//si no se llego al vertice "ciudad2"	
		        Vertex<String> v = grafo.getVertex(i);
		        List<Edge<String>> adyacentes = grafo.getEdges(v); //lista de aristas del vertice v
		
		        for(Edge<String> e: adyacentes) {//por cada arista (elemento de adyacentes)
			       int j = e.getTarget().getPosition(); //j=posicion del destino de la arista
			       if(!marca[j])
				      dfs1(j, marca, ciudad2, caminoActual, caminoDevolver); //recursion
			       if(!caminoDevolver.isEmpty()) //ESTO ASEGURA QUE UNA VEZ ENCONTRADO EL PRIMERO CAMINO, NO SE SIGA RECORRIENDO EL GRAFO
						 return;
		        }
		 caminoActual.remove(caminoActual.size()-1); //elimina ultimo elemento de la lista
		 
		}
		
		else {
			caminoDevolver.addAll(caminoActual);
		}
	}

    
	
	//----------------------------------------------------------------------------------------------
	/*  devolverCaminoExceptuando (String ciudad1, String ciudad2, List<String> ciudades): List<String>
    Retorna la lista de ciudades que forman un camino desde ciudad1 a ciudad2, sin pasar por
    las ciudades que están contenidas en la lista ciudades pasada por parámetro, si no existe
    camino retorna la lista vacía. (Sin tener en cuenta el combustible). */
	
	public List<String> devolverCaminoExceptuando (String ciudad1, String ciudad2, List<String> ciudades) { //FUNCIONA
		
		ArrayList<String> caminoActual = new ArrayList<String>();
		ArrayList<String> caminoDevolver = new ArrayList<String>();
		boolean marca [] = new boolean [grafo.getSize()] ;
		
		//SE MARCAN LOS VERTICES DE LAS CIUDADES QUE PERTENCEN A LA LISTA "CIUDADES" PARA QUE NO SE PASE POR ESAS CIUDADES
		for (String ciudad : ciudades) {
            Vertex<String> vertex = grafo.search(ciudad);
                marca[vertex.getPosition()] = true;
            }
        
		
		Vertex<String> inicio = grafo.search(ciudad1);
			 
	    dfs2(inicio.getPosition(), marca, caminoActual, ciudad2, caminoDevolver) ; 
	    
	    return caminoDevolver;
	    	
	}
	
	private void dfs2(int i, boolean[] marca, ArrayList<String> caminoActual, String ciudad2, ArrayList<String> caminoDevolver) { //en marca ya paso los vertices por donde no hay q pasar
		marca[i] = true;
		caminoActual.add(grafo.getVertex(i).getData()); //agrego ciudad a la lista
		
		if(!grafo.getVertex(i).getData().equals(ciudad2)) {//si no se llego al vertice "ciudad2"
			
		        Vertex<String> v = grafo.getVertex(i);
		        List<Edge<String>> adyacentes = grafo.getEdges(v); //lista de aristas del vertice v
		
		        for(Edge<String> e: adyacentes) {//por cada arista (elemento de adyacentes)
			       int j = e.getTarget().getPosition(); //j=posicion del destino de la arista
			       if(!marca[j])
				      dfs2(j, marca, caminoActual, ciudad2, caminoDevolver);
			       if(!caminoDevolver.isEmpty())
						 return;
		        }
		        caminoActual.remove(caminoActual.size()-1); //elimina ultimo elemento de la lista
		
		}
		else {
			caminoDevolver.addAll(caminoActual);
		}
		
	}
	

	//me quedaria el dfs2 igual al dfs1 ya que el metodo se maneja con el vector marca para ver que vertices procesa 
	
	
	 
	 
	//----------------------------------------------------------------------------------------------
	/* caminoMasCorto(String ciudad1, String ciudad2): List<String>
	 Retorna la lista de ciudades que forman el camino más corto para llegar de ciudad1 a
	 ciudad2, si no existe camino retorna la lista vacía. (Las rutas poseen la distancia). */
	
	//FUNCIONA
	
	public List<String> caminoMasCorto(String ciudad1, String ciudad2)  { //FUNCIONA
		
        //implemento un objeto con  caminoMin  "peso total" de la lista itero sobre la lista sumando los pesos
		// despues, caminoActual y pesoActual son parametros el metodo recursivo
		
		ObjCaminos o = new ObjCaminos();
		o.setPesoMin(999); //inicializo pesoMin
		ArrayList<String> caminoActual= new ArrayList<String>();
		
        
		boolean marca [] = new boolean [grafo.getSize()] ;
			
		Vertex<String> inicio= grafo.search(ciudad1); //busco vertice que contiene a ciudad1 (para empezar desde ese vertice) [PUEDO USAR DIRECTAMENTE EL SEARCH]
		
			 
	    dfs3(inicio.getPosition(), marca, ciudad2, o, caminoActual, 0) ; //pesoActual empieza siendo 0
	    
	    return o.getCaminoMin();
	    	
	}
	/**
	 * 
	 * @param i
	 * @param marca
	 * @param ciudad2
	 * @param obj
	 * @param caminoActual
	 * @param pesoActual
	 */
	private void dfs3(int i, boolean[] marca, String ciudad2, ObjCaminos obj, ArrayList<String> caminoActual, int pesoActual ) { //en marca ya paso los vertices por donde no hay q pasar
		marca[i] = true;
		caminoActual.add(grafo.getVertex(i).getData()); //agrego ciudad a la lista
		
		if(!grafo.getVertex(i).getData().equals(ciudad2)) {//si no se llego al vertice "ciudad2"
			
		        Vertex<String> v = grafo.getVertex(i);
		        List<Edge<String>> adyacentes = grafo.getEdges(v); //lista de aristas del vertice v
		
		        for(Edge<String> e: adyacentes) {//por cada arista (elemento de adyacentes)
		           pesoActual += e.getWeight(); //obtengo peso de arista  
			       int j = e.getTarget().getPosition(); //j=posicion del destino de la arista
			       if(!marca[j])
				      dfs3(j, marca, ciudad2, obj, caminoActual, pesoActual);
		        }
		      }       
		        
		  else { //significa que se llego a ciudad2 --> entonces comparo el camino actual con el minimo
			  if(pesoActual< obj.getPesoMin()) {
				  obj.setPesoMin(pesoActual); //actualizo peso min
				  ArrayList<String> l = new ArrayList<String>();
				  l.addAll(caminoActual);
				  obj.setCaminoMin(l); //actualizo listaMin --> se crea losta nueva pq si paso directamente caminoActual, le estoy pasando la referencia
			  }  
		  }
		
		 caminoActual.remove(caminoActual.size()-1); //se borran elementos en el backtracking
		 marca[i] = false; 
		 //esto se pone despues del if y del else para asegurar que pase tanto para las sentencias que entran al if
		 //como para las que entran al else
		}
	
		

	
	
	//----------------------------------------------------------------------------------------------
	/*  caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto): List<String>
    Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2. El
    auto no debe quedarse sin combustible y no puede cargar. Si no existe camino retorna la
    lista vacía. */
	public List<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto) {
		//tanque auto contiene la capacidad de combusible
        ArrayList<String> caminoActual = new ArrayList<String>();
        ArrayList<String> caminoDevolver = new ArrayList<String>();
		
		boolean marca [] = new boolean [grafo.getSize()] ;
			
		Vertex<String> inicio= grafo.search(ciudad2); //busco vertice que contiene a ciudad1 (para empezar desde ese vertice) [PUEDO USAR DIRECTAMENTE EL SEARCH]
		 
	    dfs4(inicio.getPosition(), marca, ciudad2, tanqueAuto , caminoActual, caminoDevolver, 0) ; //pesoActual empieza siendo 0
	    
	    return caminoDevolver;
		
	}
	
	private void dfs4(int i, boolean[] marca, String ciudad2, int combustibleRestante, ArrayList<String> caminoActual, ArrayList<String> caminoDevolver, int combustibleRestar ) { 
		marca[i] = true;
		 caminoActual.add(grafo.getVertex(i).getData()); //agrego ciudad a la lista
		combustibleRestante = combustibleRestante - combustibleRestar; //se resta el peso de la arista que te llevo a la ciudad
		
		if(!grafo.getVertex(i).getData().equals(ciudad2)) {//si no se llego al vertice "ciudad2"
			
		        Vertex<String> v = grafo.getVertex(i);
		        List<Edge<String>> adyacentes = grafo.getEdges(v); //lista de aristas del vertice v
		
		        for(Edge<String> e: adyacentes) {//por cada arista (elemento de adyacentes)
		           int j = e.getTarget().getPosition(); //j=posicion del destino de la arista
		           int pesoProximaCiudad = e.getWeight(); //obtengo cantidad de combustible para viajar de ciudad actual a ciudad destino
			       if((!marca[j]) && (combustibleRestante > pesoProximaCiudad) ) //chequeo marca Y QUE NO SE TERMINE EL COMBUSTIBLE
				      dfs4(j, marca, ciudad2, combustibleRestante, caminoActual, caminoDevolver, pesoProximaCiudad);
		        }
		  caminoActual.remove(caminoActual.size()-1); //ESTA BIEN ESTO ACA? ***
		  marca[i] = false; //desmarco vertice para que se puedan ver sus adyacencias????? ***
		}
		else {
			
			caminoDevolver.addAll(caminoActual);
			
		}
		       
	}
		 
		
	//----------------------------------------------------------------------------------------------
	/* caminoConMenorCargaDeCombustible (String ciudad1, String ciudad2, int tanqueAuto): List<String>
	  Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2
	  teniendo en cuenta que el auto debe cargar la menor cantidad de veces. El auto no se
	  debe quedar sin combustible en medio de una ruta, además puede completar su tanque al
	  llegar a cualquier ciudad. Si no existe camino retorna la lista vacía. */
	
	 //public List<String> caminoConMenorCargaDeCombustible (String ciudad1, String ciudad2, int tanqueAuto) {}
	
	
	
}	