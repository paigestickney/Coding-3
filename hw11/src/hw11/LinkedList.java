package hw11;

public class LinkedList<T> {
	public Node<T> Head;
	public Node<T> Tail;
	public int Size;
	
	public LinkedList() {
		this.Head = null;
		this.Tail = null;
		this.Size = 0;
	}
	
	// tasks here
	/// insert after here
	public void InsertAfter(Node<T> currentNode, Node<T> newNode) {
		if (Head == null) {
			Head = newNode;
			Tail = newNode;
		}
		else if (currentNode == Tail) {
			Tail.NextNode = newNode;
			Tail = newNode;
		}
		else {
			newNode.NextNode = currentNode.NextNode;
			currentNode.NextNode = newNode;
		}
		this.Size++;
	}
	
	// remove after here
	public void removeAfter(Node<T> currentNode) {
		if (currentNode == null && Head!= null) {
			Node<T> succeedingNode = Head.NextNode;
			Head = succeedingNode;
			
			if (succeedingNode == null) {
				Tail = null;
			}
			
			
		}
		else if (currentNode.NextNode != null) {
			Node<T> succeedingNode = currentNode.NextNode.NextNode;
			currentNode.NextNode = succeedingNode;
			
			if (succeedingNode == null) {
				Tail = currentNode;
			}
		}
	}
	
	// Search here
	public void Node<T> Search(T tar) {
		Node<T> current = this.Head;
		while (current != null) {
			if (current.Data.equals(T tar)) {
				return current;
			}
			return null;
		}
		
		// append to list
		public void Append(Node<T> newNode) {
			if (Head == null) {
				Head = newNode;
				Tail = newNode;
			}
			else {
				Tail.NextNode = newNode;
				Tail = newNode;
			}
		}
		
		// remove here
		public void Remove(Node<T> currentNode) {
			if (currentNode == null && Head != null) {
				Node succeedingNode = Head.NextNode;
				Head = succeedingNode;
				if (succeedingNode == null) {
					Tail = null;
				}
			}
			else if (currentNode.NextNode != null) {
				Node succeedingNode = currentNode.NextNode.NextNode;
				currentNode.NextNode = succeedingNode;
				if (succeedingNode == null) {
					Tail = currentNode;
				}
			}
		}
		
		
		
	
	public void printReverse(Node<T> Head) {
		if (Head == null) {
			return;
		}
		printReverse(Head.NextNode);
		System.out.println(Head + " ");
	}
}









