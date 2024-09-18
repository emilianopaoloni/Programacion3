package tp3.ejercicio4;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class TESTej4 {
	
	public static void main(String[] args){
	
	//---------------creo arbol-----------------------
		    AreaEmpresa ae1= new AreaEmpresa("J",13);
			GeneralTree<AreaEmpresa> a1 = new GeneralTree<AreaEmpresa>(ae1); 
			List<GeneralTree<AreaEmpresa>> children1 = new LinkedList<GeneralTree<AreaEmpresa>>();
			children1.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("A",4)));
			children1.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("B",7)));
			children1.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("C",5)));
			
			AreaEmpresa ae2= new AreaEmpresa("K",25);
			GeneralTree<AreaEmpresa> a2 = new GeneralTree<AreaEmpresa>(ae2); 
			List<GeneralTree<AreaEmpresa>> children2 = new LinkedList<GeneralTree<AreaEmpresa>>();
			children2.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("D",6)));
			children2.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("E",10)));
			children2.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("F",18)));
			
			AreaEmpresa ae3= new AreaEmpresa("L",10);
			GeneralTree<AreaEmpresa> a3 = new GeneralTree<AreaEmpresa>(ae3); 
			List<GeneralTree<AreaEmpresa>> children3 = new LinkedList<GeneralTree<AreaEmpresa>>();
			children3.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("G",9)));
			children3.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("H",12)));
			children3.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("I",19)));
			
			List<GeneralTree<AreaEmpresa>> childen = new LinkedList<GeneralTree<AreaEmpresa>>();
			childen.add(a1);childen.add(a2);childen.add(a3);
			GeneralTree<AreaEmpresa> a = new GeneralTree<AreaEmpresa>(new AreaEmpresa("M",14), childen);
		
			//----------------------------------------------------
		
		AnalizadorArbol AA = new AnalizadorArbol();
		System.out.println("mayor promedio entre todos los valores promedios de los niveles es: " +AA.devolverMaximoPromedio(a) ) ;
			
			

}
}