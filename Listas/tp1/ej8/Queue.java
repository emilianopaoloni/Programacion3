package tp1.ej8;

import java.util.ArrayList;
import java.util.List;

public class Queue <T> extends Sequence{
	
	List <T> l ;
	
	public   Queue () {
		
		 this.l = new ArrayList<T> ();    //por q ERROR????
		
	}
	
	public void enqueue (T dato) { //inserta elemento al final de la cola
		
		    l.add(l.size(), dato);
		
	}
	
	//frente de la cola--> primer elemento
	
	public T dequeue() { //elimina y retorna
		
		    T elemento = l.remove(0);
		    return elemento;
		
	}
	
	public T head() {  //solo retorna
		
			return(l.get(0));
		
	}
	
	
	
	public String toString() {
		String s = " ";
		
		for (T elemento: l) {
		  s += elemento + " " ;
		}		  
		
		return s ;
	}

	@Override  //metodo abstracto (esta en Sequence pero se implementa aca)
	public boolean isEmpty() {
		
		if(l.size()==0) //cola vacia
			return (true);
		
		else
			return(false);
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	
	public int size() {
	    return(l.size());
		
	}
	

}
