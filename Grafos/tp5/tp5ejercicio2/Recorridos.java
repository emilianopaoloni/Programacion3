package tp5ejercicio2;

public class Recorridos {
	
	//dfs(Graph<T> grafo): List<T>
	
	//DFS: empieza en un vertice y continua con un adyacente del vertice, y despues con el adyacente del adyacente, etc.
	 public List<T> dfs(Graph<T> grafo) {
		List<T> lista; 
	    boolean[] marca = new boolean[grafo.getSize()];
	    for (int i = 0; i < grafo.getSize(); i++) {
	  if (!marca[i]) {
	    System.out.println("largo con: "+grafo.getVertex(i).getData());
	    dfs(i, grafo, marca, lista);
	  }
	 }
	 return lista;
 }
	   private  void dfs(int i, Graph<T> grafo, boolean[] marca, List<T> lista) {
	 marca[i] = true;
	 lista.add(grafo.getVertex(i)); // i es la posicion del vertice
	 Vertex<T> v = grafo.getVertex(i);
	 System.out.println(v);
	 List<Edge<T>> adyacentes = grafo.getEdges(v);  //lista de adyacentes
	 for (Edge<T> e: adyacentes){
	   int j = e.getTarget().getPosition();
	   if (!marca[j]) {
	       dfs(j, grafo, marca, lista);
	   }
	 }
	 lista.remove(lista.size()-1); //elimino ultimo elemento
	 marca[i] = false;
	} 
	
	
	//bfs(Graph<T> grafo): List<T> 
	
	//BFS: empieza en un vertice y despues recorre TODOS los adyacentes de ese vertice antes de pasar a analizar otro vertice
	
	 public List<T> bfs(Grafo<T> grafo) {
		 List<T> lista;
	     boolean[] marca = new boolean[new boolean[grafo.getSize()];
	     for (int i = 1; i <= marca.length; i++) {
	        if (!marca[i]){
	            this.bfs(i, grafo, marca, lista);  //las listas empiezan en la pos 1
	        }
	     }
	     return lista;
	 }
	
	private void bfs(int i, Graph<T> grafo, boolean[] marca, List<T> lista) {
		   Queue<Vertex<T>> q = new Queue<Vertex<T>>();
		   q.enqueue(grafo.getVertex(i));
		   marca[i] = true;
		   while (!q.isEmpty()) {
		       Vertex<T> w = q.dequeue();  // w es un vertice
		       lista.add(w.getData());     //*
		       System.out.println(w);
		       // para todos los vecinos (adyacentes) de w:
		       List<Edge<T>> adyacentes = grafo.getEdges(w);
		       for (Edge<T> e: adyacentes) {
		           int j = e.getTarget().getPosition();
		           if (!marca[j]) {
		               marca[j] = true;
		               //Vertex<T> v = e.getTarget();
		               q.enqueue(e.getTarget());
		           }
		       }
		   }
		 }


}
