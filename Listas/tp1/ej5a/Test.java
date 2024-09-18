package tp1.ej5a;

//IMPLEMENTA UN OBJETO CLASE ARREGLO, LO MANDA COMO PARAMETRO Y EL METODO DEVUELVE
//ESE OBJETO. LAS OPERACIONES SON METODOS DE CLASE ARREGLO.

public class Test {
	public static void main(String[] args){
		int [] arregloDeInt = new int [6];
		arregloDeInt[0]=6;
		arregloDeInt[1]=3;
		arregloDeInt[2]=2;
		arregloDeInt[3]=1;
		arregloDeInt[4]=9;
		arregloDeInt[5]=12;
		
		claseArreglo a = operacionesArreglo(arregloDeInt);
		System.out.println("el valor maximo del arreglo es "+ a.getMaximo());
		System.out.println("el valor minimo del arreglo es "+ a.getMinimo());
		System.out.println("el promedio de los valores es "+ a.getPromedio());
	}




 public static claseArreglo  operacionesArreglo (int [] v) { //devuelve objeto claseArreglo
	 int max=0, min=999, tot=0, prom;
	 
	 claseArreglo a= new claseArreglo(); //crea el objeto 
	 
		for(int i=0; i<5; i++) {
			if(v[i]>max) {
				max=v[i];
			}
			if(v[i]<min) {
				min=v[i];
			}
			tot= tot+ v[i];
		}
		prom= tot/6;
		a.setMaximo(max);
		a.setMinimo(min);
		a.setPromedio(prom);
		
	 return (a);
	 
	 
 }
 
}

