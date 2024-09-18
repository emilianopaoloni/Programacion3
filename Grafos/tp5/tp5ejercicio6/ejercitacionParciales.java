package tp5ejercicio6;

import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class ejercitacionParciales {
	
	public boolean resolver (GeneralTree<Integer> arbol) {
		List<Integer> sumaCaminos = newLinkedList();
		int caminoActual=0;
		boolean devolver = resolver_recursivo (arbol, sumaCaminos, caminoActual);
		
		return devolver;
	}
	
	private boolean resolver_recursivo (GeneralTree<Integer> a, List<Integer> sumaCaminos, int caminoActual) {
		caminoActual += a.getData();
		
		if(! a.isLeaf()) {
			List<GeneralTree<Integer>> children = a.getChildren();
			
			for(GeneralTree<Integer> c: children) {
				if(resolver_recursivo(c, sumaCaminos, caminoActual))
					  return true;
				else
					return false;
			}
		}
		else {
			if(sumaCaminos.contains(caminoActual))
				return true;
			else
				sumaCaminos.add(caminoActual);
		}
			
	}

	
	
	
}
