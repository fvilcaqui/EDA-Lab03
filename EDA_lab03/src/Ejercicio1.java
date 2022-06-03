import java.util.*;
import java.util.Stack;
public class Ejercicio1 {

	public static void main(String[] args) {
		int[] cantidad1 = {1,1,1,2,3};
		int[] cantidad2 = {2,3,4};
		int[] cantidad3 = {1,4,1,1};
		Stack pila1 = new Stack();
		Stack pila2 = new Stack();
		Stack pila3 = new Stack();
		DarValores(pila1,cantidad1);
		DarValores(pila2,cantidad2);
		DarValores(pila3,cantidad3);
		equalStacks(pila1,pila2,pila3,suma(cantidad1),suma(cantidad2),suma(cantidad3));

	}
	//Con este metodo daremos los valores a cada pila
	public static void DarValores(Stack pila, int[] a) {
		for(int i=0;i<a.length;i++) {
			pila.push(a[i]);
		}
	}
	
	//Con este metodo las pilas tendran los mismos valores
	public static void equalStacks(Stack a, Stack b, Stack c,int d,int e,int f) {
		int vi1=d,vi2=e,vi3=f;
		for(;(0<d && 0<e && 0 <f) || (d==e && e==f);) {
			if(d>e || d>f) {
	              d = d - (int)a.pop(); 
			}else if(e>d || e>f) {
				  e = e - (int)b.pop(); 
			}else if(f>d || f>e) {
				  f = f - (int)c.pop();
			}else if(d==e && e==f) {
				System.out.println(vi1 + " - " + (vi1-d) + " = " + d);
				System.out.println(vi2 + " - " + (vi2-e) + " = " + e);
				System.out.println(vi3 + " - " + (vi3-f) + " = " + f);
				System.out.println("Las 3 pilas tienen ahora la altura de: " + d);
				break;
			}
		}
	}
	
	// Con este metodo hallaremos la suma de cada pila
	public static int suma(int[] a) {
		int suma=0;
		for(int i=0;i<a.length;i++) {
			suma += a[i];
		}
		return suma;
	}

}
