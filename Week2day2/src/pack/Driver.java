package pack;

public class Driver {

	public static void main(String[] args) {
		Salesman[] sales = new Salesman[8];
		sales [0] = newSalesman("Blade", 0);
		sales [1] = newSalesman("Jaydin", 500);
		sales [2] = newSalesman("Abby", 200);
		sales [3] = newSalesman("Emma", 600);
		sales [4] = newSalesman("Josh", 700);
		sales [5] = newSalesman("Jordyn", 1000);
		sales [6] = newSalesman("Oliver", 300);
		sales [7] = newSalesman("Lauren", 400);
		
		// Displaying
		Salesman.displayAllSalesman(sales);
		System.out.println("Sort: ");
		Salesman[] sorted = Salesman.SortList(sales);
		Salesman.displayAllSalesman(sorted);
		Salesman[] topFive = new Salesman.getTopFive(sorted);
		System.out.println("Top 5 salesman list: ");
		Salesman.displayAllSalesman(topFive);

	}

}
