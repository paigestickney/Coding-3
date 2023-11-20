package hw12;

public class Queue<T> extends MyDoublyLinkedList {
	public void enqueue(T data) {
		this.append(new Node<T>(data, null, null));
	}
	
	public Node<T> dequeue() {
		Node<T> temp = this.Head;
		this.remove(this.Head.value);
		return temp.value;
	}
	
	public Node<T> peek() {
		return this.Head.value;
	}

}
