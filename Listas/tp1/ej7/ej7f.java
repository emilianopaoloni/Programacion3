package tp1.ej7;

import java.util.ArrayList;
import java.util.List;

public class ej7f {

public  boolean esCapicua(ArrayList<Integer> lista) {
	boolean capicua=true;
	int n= lista.size();
	int inf, sup;
	inf=0; 
	sup= n-1; //porque listas en java empiezan con posicion 0
	while ( (inf<sup) && (capicua==true) ) { //termina
		if(lista.get(inf)!=lista.get(sup)) 
			capicua= false;
		inf++;
		sup--;
	}
	
	return (capicua);
	
	}
}