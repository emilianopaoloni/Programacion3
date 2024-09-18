package tp2.ejercicio9;

public class NodoDoble {
	
	private int suma;
	private int diferencia;
	
	NodoDoble() {}
	
	NodoDoble(int s, int d){
		this.suma=s;
		this.diferencia=d;
	}
	
	public int getSuma() {
		return suma;
	}

	public int getDiferencia() {
		return diferencia;
	}
	
	public void setSuma(int suma) {
		this.suma = suma;
	}
	
	public void setDiferencia(int diferencia) {
		this.diferencia = diferencia;
	}
}
