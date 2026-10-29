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
		return node.value;
	}
	
	 public T peek() {
		 Node<T> node = this.head;
		 return node.value;
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
		 while (curNode != null) {
			 size++;
			 curNode = curNode.next;
		 }
		 return size;
	 }
	 
	 public static void main(String[] args) {
			Stack<Integer> stack = new Stack<>();
			stack.push(30);
			stack.push(20);
			stack.push(10);
			System.out.printf("Peek: %h  Size: %d  isEmpty: %b\n", stack.peek(), stack.size(), stack.isEmpty());
			stack.show();
			stack.pop();
			stack.show();
		}
}
