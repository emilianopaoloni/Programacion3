package tp5ejercicio3;

import java.util.ArrayList;
import java.util.List;

import tp5ejercicio1.AdjListGraph;
import tp5ejercicio1.Graph;
import tp5ejercicio1.Vertex;

public class ej3TEST {


		public static void main(String[] args) {
		  Graph<String> ciudades = new AdjListGraph<>();
		  Vertex<String> v1 = ciudades.createVertex("Buenos Aires");
		  Vertex<String> v2 = ciudades.createVertex("Santiago");
		  Vertex<String> v3 = ciudades.createVertex("Asunción");
		  Vertex<String> v4 = ciudades.createVertex("Caracas");
		  Vertex<String> v5 = ciudades.createVertex("Madrid");
		  //. . .
		  ciudades.connect(v1, v2, 3);  //"Buenos Aires", "Santiago"
		  ciudades.connect(v1, v3, 7);  //"Buenos Aires", "Asunción"
		  ciudades.connect(v2, v4, 3);  //"Santiago", "caracas"
		  ciudades.connect(v4, v5, 1);
		  ciudades.connect(v3, v5, 1);
		  
		  //. . .
		  
		  mapaCiudades mc ; 
		  mc = new mapaCiudades(ciudades);
		 
		  /* pruebo caminoMasCorto:
		  ArrayList<String> l = (ArrayList<String>) mc.caminoMasCorto("Buenos Aires", "Madrid");
		  for (String e: l){
		     System.out.println(e);
		  }  */	
		  
		  /* //pruebo devolverCamino:
		  ArrayList<String> l = (ArrayList<String>) mc.devolverCamino("Buenos Aires", "Madrid");
		  for (String e: l){
		     System.out.println(e);
		 } */
		  
		  //pruebo devolverCaminoExceptuando:
		  ArrayList<String> exceptuar = new ArrayList<String>();
		  exceptuar.add("Caracas");
		  ArrayList<String> l = (ArrayList<String>) mc.devolverCaminoExceptuando("Buenos Aires", "Madrid", exceptuar);
		  for (String e: l){
		     System.out.println(e);
		  } 
		  
		  
		  
		  
 }
}


