package hw15;

import java.util.*;

public class BinaryTreeSearch {
	public Node head = new Node();
	public BinaryTreeSearch(int key) {
		head.key = key;
	}
	
	// insert function
	public void insert(int key) {
		boolean search = true;
		Node currentNode = head;
		while (search) {
			if (key < currentNode.key) {
				if (currentNode.left == null) {
					Node temp = new Node();
					temp.key = key;
					currentNode.left = temp;
					search = false;
				}
				else {
					currentNode = currentNode.left;
				}
			}
			else if (key > currentNode.key) {
				if (currentNode.right == null) {
					Node temp = new Node();
					temp.key = key;
					currentNode.right = temp;
					search = false;
				}
				else {
					currentNode = currentNode.right;
				}
			}
		}
	}
	
	// remove function
	public void remove(int key) {
		boolean search = true;
		Node currentNode = head;
		while (search) {
			if (key < currentNode.key) {
				if (currentNode.left != null) {
					if (currentNode.left.key == key) {
						currentNode.left = null;
						search = false;
					}
					else {
						currentNode = currentNode.left;
					}
				}
				else {
					System.out.println("not found");
					search = false;
				}
			}
			else if (key > currentNode.key) {
				if (currentNode.right != null) {
					if (currentNode.right.key == key) {
						currentNode.right = null;
						search = false;
					}
					else {
						currentNode = currentNode.left;
					}
				}
				else {
					System.out.println("not found");
					search = false;
				}
			}
		}
	}
	
	// print out
	public void print() {
		String printKey = "";
		List<Node> currentNodes = new ArrayList<Node>();
		currentNodes.add(head);
		printKey += head.key + "\n";
		
		while (currentNodes.size() > 0) {
			if (currentNodes.get(0).left != null) {
				printKey += currentNodes.get(0).left.key + " ";
				currentNodes.add(currentNodes.get(0).left);
			}
			if (currentNodes.get(0).right != null) {
				printKey += currentNodes.get(0).right.key + " ";
				currentNodes.add(currentNodes.get(0).right);
			}
			printKey += "\n";
			currentNodes.remove(0);
		}
		System.out.print(printKey);
	}

}








