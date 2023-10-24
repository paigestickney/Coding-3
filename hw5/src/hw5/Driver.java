package hw5;

public class Driver {

	private static int fibCalls = 0;
	
	public static long fibonacci(int n) {
		fibCalls++;
		if (n <= 1) {
			return n;
		}
		else {
			return fibonacci(n - 1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		fibCalls = 0;
		long end = fibonacci(n);
		
		System.out.println(fibonacci(n));
		System.out.println("The function was called " + fibCalls + " times");
		

	}

}
