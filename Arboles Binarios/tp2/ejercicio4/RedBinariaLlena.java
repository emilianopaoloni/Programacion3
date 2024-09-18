package tp2.ejercicio4;

import tp2.ejercicio1.BinaryTree;

public class RedBinariaLlena {
	
	public int retardoReenvio(BinaryTree<Integer> ab){ //funciona
	   
		int suma=0;
		
		if(ab== null)
			return 0;
		
		suma= ab.getData(); //sumo valor de raiz
					
	    while (!ab.isLeaf()){ //mientras no sea una hoja
	    	
	    	if (ab.getLeftChild().getData() > ab.getRightChild().getData()) {
	    		suma += ab.getLeftChild().getData();
	    		ab = ab.getLeftChild();
	    	}
	    	else {
	    		suma += ab.getRightChild().getData();
	    	    		ab = ab.getRightChild();
	    	}
	    	
	    }	
	    
	    return suma;
	    		
	    		
	    		
	}

}
