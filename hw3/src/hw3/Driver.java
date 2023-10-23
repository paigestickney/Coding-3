package hw3;

public class Driver {
	
	public static void main(String[] args) {
		// call function here
		IsAllUnique("matcha");
	}
	
	
	public static boolean IsAllUnique(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int a = i + 1; a < str.length(); a++) {
				if(str.charAt(a) == str.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
