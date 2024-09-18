package tp1.ej1;

public class IteradorAB {
	public static void main(String[] args) {
		IteradorAB iterador = new IteradorAB ();
		iteracionConFor(2,4);
	    iteracionConWhile(1,5);
		recursivo(3,6);

}
	

public static void iteracionConFor (int a, int b) {
	for(int i=a; i<=b; i++) {
		System.out.println(i);
	}
}

public static void iteracionConWhile (int a, int b) {
	while(a<b) {
		System.out.println(a);
		a++;
	}
}

public static void recursivo (int a, int b) {
	if(a<=b) {
		System.out.println(a);
	    recursivo(a+1,b);
	}
}
}
