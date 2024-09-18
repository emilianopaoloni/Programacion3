package tp1.ej5b;
//creo un arreglo donde almaceno los tres valores: maximo, minimo y promedio, ese arreglo
//lo envio como parametro al metodo que calcula todo y 

import tp1.ej5b.OperacionesArreglo;

/////////NO SE QUE IMPLEMENTAR SI NO SE PUEDE USAR ARREGLO

public class Test {
	public static void main(String[] args){
		int [] arregloDeInt = new int [6];
		arregloDeInt[0]=6;
		arregloDeInt[1]=3;
		arregloDeInt[2]=2;
		arregloDeInt[3]=1;
		arregloDeInt[4]=9;
		arregloDeInt[5]=12;
		int min=999; int max=0; double prom;
		
		OperacionesArreglo a= new OperacionesArreglo();
		System.out.println("el valor maximo del arreglo es "+ a.maximo(arregloDeInt));
		System.out.println("el valor minimo del arreglo es "+ a.minimo(arregloDeInt));
		System.out.println("el promedio de los valores es "+ a.promedio(arregloDeInt));
	}
	
	public int maximo (int[] a) {
		int max=0;
		for(int i=0; i<5; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
	 return max;
	}

}
