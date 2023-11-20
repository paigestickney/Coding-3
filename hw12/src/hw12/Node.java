package hw12;

public class Node<T> {
	
	public T value;
	public String Data;
    public Node<T> NextNode;
    public Node<T> PreviousNode;

    public Node(){
        this.Data = null;
        this.NextNode = null;
        this.PreviousNode = null;
    }

    public Node(String input){
        this.Data = input;
        this.NextNode = null;
        this.PreviousNode = null;
    }

}
