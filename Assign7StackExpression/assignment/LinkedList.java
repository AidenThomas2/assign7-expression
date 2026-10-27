package assignment;

public class LinkedList<T> {
	protected Node<T> head;
	protected Node<T> tail;
		
	public LinkedList() {
		head=null;
		tail=null;
	}
	
	public void appendNoTail(T value) {
		//**********************************************************
		//** Append Node to End of List O(n)                      **
		//**********************************************************
		Node<T> newNode = new Node<>(value);
		Node<T> curNode = this.head;
		
		if(this.head==null) {
			this.head=newNode;
		}else {
			while(curNode.next!=null) {
				curNode = curNode.next;
			}
			curNode.next = newNode;
			newNode.prev = curNode;
		}
	}
	
	
	public void append(T value) {
		//**********************************************************
		//** Append Node to End of List of with TAIL Pointer O(1) **
		//**********************************************************
		Node<T> newNode = new Node<>(value);
		if(this.head==null) {
			this.head=newNode;
			this.tail=newNode;
		}else {
			this.tail.next = newNode;
			this.tail.next.prev = this.tail;
			this.tail = newNode;
		}	
	}
	
	public Node<T> search(T value) {
		//**********************************************************
		//**  Search(Traversal) for value  O(n)                   **
		//**********************************************************
		Node<T> result=null;
		Node<T> curNode = this.head;
		while(curNode!=null) {
			if(curNode.value == value) {
				result = curNode;
				break;
			}
			curNode=curNode.next;
		}
		return result;
	}
	
	
	public Node<T> delete(T value) {
		//**********************************************************
		//**  Delete for value  O(n)                              **
		//**********************************************************		
		Node<T> result=null;
		Node<T> curNode = this.head;
		if(this.head.value == value) {
			result = this.head;
			this.head = this.head.next;
			this.head.prev = null;
		}else {
			while(curNode!=null) {
				if(curNode.value == value) {
					result = curNode;
					curNode.prev.next = curNode.next;
					if(curNode.next == null) {
						this.tail = curNode.prev;
					}else {
						curNode.next.prev = curNode.prev;
					}
					break;
				}
				curNode=curNode.next;
			}
		}
		return result;
	}

	public void show() {
		//**********************************************************
		//**  Show List  O(n)                                     **
		//**********************************************************	
		Node<T> curNode = this.head;
		System.out.printf("=================\n");
		while(curNode!=null) {
			System.out.printf("---------------\n");
			System.out.printf("%s\n", curNode.toString());
			System.out.printf("Value: %d  Next: %h  Prev: %h  Head: %h  Tail: %h\n", curNode.value,curNode.next,curNode.prev, this.head, this.tail);
			curNode = curNode.next;
		}
	}
	
	public static void main(String[] args) {
		
			LinkedList<Integer> list = new LinkedList<>();
			list.append(5);
			list.append(10);
			list.append(15);
			list.append(25);
			list.show();
			list.delete(15);
			list.append(40);
			list.show();
		
	}
}
