package assignment;

public class Stack<T> extends LinkedList<T> implements StackInterface<T>{
	
	public void push(T item)
	{
		Node<T> newNode = new Node<T>(item);
		newNode.next = this.head;
		this.head = newNode;
	}
	
	public T pop() {
		Node<T> node = this.head;
		this.head = this.head.next;
		return (T)node;
	}
	
	 public T peek() {
		 return (T)this.tail;
	 }
	 
	 public boolean isEmpty() {
		 boolean isEmpty = false;
		 if (this.head == null) {
			 isEmpty = true;
		 }
		 return isEmpty;
	 }
	 public int size() {
		 Node<T> curNode = this.head;
		 int size = 0;
		 while (curNode.next != null) {
			 size++;
			 curNode = curNode.next;
		 }
		 return size;
	 }
	 
	 public static void main(String[] args) {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(30);
			stack.push(20);
			stack.push(10);
			stack.show();
			stack.pop();
			stack.show();
		}
}
