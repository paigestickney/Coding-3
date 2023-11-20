package hw12;

public class Stack<T> extends MyDoublyLinkedList {
	
	public void push(T data) {
		this.prepend(new Node<T>(data, null, null));
	}
	
	public Node<T> Pop(){
		Node<T> temp = this.Head;
		this.remove(this.Head.value);
		return temp.value;
	}
	
	public Node<T> Peek() {
		return this.Head.value;
	}
	
	

}
