package pack;

public class Salesman {
	// properties or fields
	public String name;
	public float total;
	
	// Constructor: generate new instance of a class
	// Salesman man = new Salesman();
	public Salesman(String name, float total) {
		this.name = name;
		this.total = total;
	}
	
	// getters
	public String getName() {
		return this.name;
	}
	public float getTotal() {
		return this.total;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String display() {
		return this.name + " : " + this.total;
	}
	
	// sort list function
	public static Salesman[] SortList(Salesman[] list) {
		Salesman[] newList = new Salesman[list.length];
				for (int i = 0; i < list.length; i++) {
					newList[i] = list[i];
				}
				for (int a = 0; a < list.length - 1; a++) {
					for (int b = 0; b < list.length - b - 1; b++) {
						if (newList[b+1].total < newList[b].total) {
							Salesman temp = null;
							temp = newList[b+1];
							newList[b+1] = newList[b];
							newList[b] = temp;
						}
					}
				}
				return newList;
	}
	
	// display function
	public static void displayAllSalesman(Salesman[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].display);
		}
	}
	
	public Salesman[] getTopFive(Salesman[] sorted) {
		Salesman[] returnValue = new Salesman[5];
		for (int i = sorted.length; i < 5; i++) {
			returnValue[i] = sorted[sorted.length - 1];
		}
		return returnValue;
	}
	
}
