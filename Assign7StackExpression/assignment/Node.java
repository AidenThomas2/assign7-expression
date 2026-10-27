package assignment;

public class Node<T> {
	T value;
	Node<T> prev;
	Node<T> next;
	
	public Node() {}
	
	public Node (T value) {
		this.value=value;
		this.prev=null;
		this.next=null;
	}
}
