package tp1.ej2;

import java.util.Scanner; //"Scanner" va con mayuscula

public class Multiplos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un numero para obetener sus multiplos");
		int n= scanner.nextInt();
		int [] multiplos = getMultiplos(n);
		
		System.out.println("multilplos de"+ n+ " : ");
		for(int i=0; i<multiplos.length; i++) {
			System.out.println(multiplos[i] + " ");
		}

	  }



    public static int [] getMultiplos (int n) {
	    int [] multiplos = new int[n]; //creo el arreglo
	    for (int i=1; i<=n; i++) {
		    multiplos[i-1]= n * i;
	    }
	    return multiplos;
    }
}