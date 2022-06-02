
public class Node<T> {
	private T data;
	private Node<T> next;
	//Metodo constructor
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	public Node(T data) {
		this(data, null);
	}
	//Metodos para entregar y recibir datos
	public T getDatos() {
		return this.data;
	}
	public void setDatos(T data) {
		this.data = data;
	}
	//Metodo sobre la referencia de los nodos
	public Node<T> getNext(){
		return this.next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
}
