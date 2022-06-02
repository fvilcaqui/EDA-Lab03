import java.util.*;
public class Ejercicio2 {
	public static void main(String[] args) {
		
		//Crearemos nuestra pila"
		Stack pila = new Stack();
		
		//Utilizaremos el metodo "push" para ingresar los datos de nuestra pila"
		pila.push(50);
		pila.push(23);
		pila.push(15);
		pila.push("Franks");
		pila.push("Programacion");
		
		//utilizaremos el metodo "search" para buscar la posicion de un elemento;
		System.out.println("La posicion del elemento 23 es: " + pila.search(23));
		
		//En caso que no exista el elemento colocara -1
		System.out.println("La posicion del elemento 58 es: " + pila.search(58));

		//utilizaremos el metodo "peek" para ver el ultimo valor de nuestra pila
		System.out.println("Usando el metodo peek, el ultimo elemento es: " + pila.peek());
		
		//Utilizaremos el metodo "empty" para ver si la pila esta vacia
		while(pila.empty()==false) {
			//Utilizaremos el metodo "pop" para ver el ultimo elemento en la lista y eliminarla
			System.out.println(pila.pop());
		}


	}

}
