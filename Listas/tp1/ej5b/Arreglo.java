package tp1.ej5b;

public class OperacionesArreglo {
	public int maximo (int[] a) {
		int max=0;
		for(int i=0; i<5; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
	 return max;
	}

	public int minimo (int[] a) {
		int min=999;
		for(int i=0; i<5; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
	 return min;
		
	}

	public double promedio (int[] a) {
		int suma=0;
		double prom;
		for(int i=0; i<5; i++) {
				suma+= a[i];
			}
	  prom= suma/5;
	 return prom;	
	}

}
