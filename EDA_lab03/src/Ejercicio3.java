import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos la cola
		LinkedList cola = new LinkedList();
		
		//Ingresamos los valores de la cola
		for(int i=1; i<8; i++) {
			
			//Este metodo inserta un elemento a la cola con el metodo "offer"
			cola.offer(i);
		}
		//utilizaremos el metodo "remove" que tambien recupera y elimina un valor
		  cola.remove();
		  
		  //El metodo "element" recupera pero no elimina el valor de la cola
		  System.out.println("El elemento recuperado con element es: " + cola.element());
		  
		/*Utilzaremos el metodo "peek" que recupera el encabezado de la cola
		 y si no hay un valor te dara null por lo que lo utilizaremos para imprimir
		 los valores de esta cola */
		while(cola.peek() != null) {
	
			//Con el metodo "poll" recuperamos el encabezado y lo eliminamos de la cola
			System.out.println(cola.poll());
			//La diferencia entre el metodo "remove" y "poll" es que cuando esta vacio el metodo poll da null
		}
	
	
	}
	

}
