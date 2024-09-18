package tp1.ej5a;

public class claseArreglo {
	private int maximo;
	private int minimo;
	private double promedio;



public claseArreglo () {}

public claseArreglo (int ma, int mi, double p) {
	this.maximo= ma;
	this.minimo= mi;
	this.promedio=p;

}

public int getMaximo() {
	return maximo;
}

public void setMaximo(int maximo) {
	this.maximo = maximo;
}

public int getMinimo() {
	return minimo;
}

public void setMinimo(int minimo) {
	this.minimo = minimo;
}

public double getPromedio() {
	return promedio;
}

public void setPromedio(double promedio) {
	this.promedio = promedio;
}
}