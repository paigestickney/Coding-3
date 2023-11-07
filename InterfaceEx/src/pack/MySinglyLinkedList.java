package pack;

public class MySinglyLinkedList {
	MyNode Header;
	int Size;
	
	public MySinglyLinkedList() {
		this.Header = null;
		this.Size = 0;
	}
	
	// implement insert after
	public boolean InsertAfter(int n, int o) {
		MyNode currNode = this.SearchNode(n);
		if (currNode == null) {
			return false;
		}
		else {
			MyNode newNode = new MyNode();
			newNode.Data = o;
			MyNode nextNode = currNode.NextNode;
			
			currNode.NextNode = newNode;
			newNode.NextNode = nextNode;
			this.Size++;
			return true;
		}
	}
	
	// remove after function
	public boolean RemoveAfter(int n) {
		MyNode currNode = this.SearchNode(n);
		if (currNode == null) {
			return false;
		}
		else {
			MyNode nextNode = currNode.NextNode;
			if (nextNode == null) {
				return true;
			}
			MyNode nextNextNode = nextNode.NextNode;
			if (nextNextNode == null) {
				currNode.NextNode = null;
				return true;

			}
			else {
				currNode.NextNode = nextNextNode;
				nextNode.NextNode = null;
				this.Size--;
				return true;
			}
		}
	}
	
	// return the first instance of the node whose payload matches the value that we are looking for
	// return null if we don't find the value
	public boolean Search (int n) {
		MyNode currNode = this.Header;
		while (currNode != null) {
			if (currNode.Data == n) {
				return currNode;
			}
			else {
				currNode = currNode.NextNode;
			}
		}
	}

}
