package hw11;

public class Driver {

	public static void main(String[] args) {
		LinkedList<String> DList = new LinkedList<String>();
		
		// store names here
		DList.Append("Peter");
		DList.Append("James");
		DList.Append("John");
		DList.Append("Andrew");
		DList.Append("Philip");
		DList.Append("Judas");
		DList.Append("Matthew");
		DList.Append("Thomas");
		DList.Append("James");
		DList.Append("Bartholomew");
		DList.Append("Thaddeus");
		DList.Append("Simon");
		
		// remove who betrayed Jesus
		DList.Remove(12);
		
		// sort names here
		DList.Search();
		
		// print in reverse
		DList.printReverse(this.Head);
		
	}

}
