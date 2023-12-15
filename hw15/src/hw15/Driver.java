package hw15;

public class Driver {
	public static void main(String[] args) {
		BinaryTreeSearch tree = new BinaryTreeSearch();
		
		tree.insert(2);
		tree.insert(7);
		tree.insert(9);
		tree.insert(8);
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		tree.insert(6);
		tree.insert(0);
		tree.insert(5);
		
		tree.print();
		
		tree.remove(3);
		tree.remove(7);
		tree.remove(0);
		
		tree.print();
		
		System.out.println(tree.search(4));
		System.out.println(tree.search(2));
		System.out.println(tree.search(7));
	}

}
