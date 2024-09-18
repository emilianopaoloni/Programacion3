package tp1.ej7;

import java.util.ArrayList;
import java.util.List;

public class ej7fTEST {
	public static void main(String[] args){
		ej7f e = new ej7f();  //creo instancia de la clase
		ArrayList<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(100);
		l.add(2);
		l.add(1);
		l.add(0);
		
		if( e.esCapicua(l) )
			System.out.println("la lista es capicua");
		else
			System.out.println("la lista NO es capicua ");


	}
}	
