import java.util.*;
import java.util.Stack;
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos los array que iran en cada pila
		int[] cantidad1 = {1,1,1,2,3};
		int[] cantidad2 = {2,3,4};
		int[] cantidad3 = {1,4,1,1};
		//Creamos las pilas
		Stack pila1 = new Stack();
		Stack pila2 = new Stack();
		Stack pila3 = new Stack();
		//Copeamos los valores de los array en las pilas
		DarValores(pila1,cantidad1);
		DarValores(pila2,cantidad2);
		DarValores(pila3,cantidad3);
		equalStacks(pila1,pila2,pila3,suma(cantidad1),suma(cantidad2),suma(cantidad3));

	}
	//Con este metodo daremos los valores de cada array a su respectiva pila 
	public static void DarValores(Stack pila, int[] a) {
		for(int i=0;i<a.length;i++) {
			pila.push(a[i]);
		}
	}
	
	//Con este metodo las pilas tendran los mismos valores
	public static void equalStacks(Stack a, Stack b, Stack c,int d,int e,int f) {
		int vi1=d,vi2=e,vi3=f; //Guardamos los primeros valores para utilizarlos luego
		//Creamos este ciclo while hasta que uno de los valores sea cero o todos sean iguales
		while((0<=d && 0<=e && 0<=f) || (d==e && e==f)) { 
			//en cada condicion es por si uno de los valores mayor que los otros y quitarle su ultimo valor
			//y a la suma de cada pila quitarle ese valor
			if(d>e || d>f) {
	              d = d - (int)a.pop(); 
			}else if(e>d || e>f) {
				  e = e - (int)b.pop(); 
			}else if(f>d || f>e) {
				  f = f - (int)c.pop();
			}else if(d==e && e==f) { //si son iguales acabaremos el bucle con break, y utilizaremos los valores
				System.out.println(vi1 + " - " + (vi1-d) + " = " + d);    //copeados al inicio para la respuesta
				System.out.println(vi2 + " - " + (vi2-e) + " = " + e);
				System.out.println(vi3 + " - " + (vi3-f) + " = " + f);
				System.out.println("Las 3 pilas tienen ahora la altura de: " + d);
				break;
			}
		}
	}
	
	// Con este metodo hallaremos la suma de cada pila y guardamos el dato
	public static int suma(int[] a) {
		int suma=0;
		for(int i=0;i<a.length;i++) {
			suma += a[i];
		}
		return suma;
	}

}
