package hw4;

public class Driver {

	public static int[] matrixSearch(int[][] matrix, int key) {
		int rows = matrix.length;
		if (rows ==0) {
			return new int[] {-1, -1};
		}
		
		int columns = matrix[0].length;
		int row = 0;
		int col = columns - 1;
		
		while (row < rows && col >= 0) {
			int current = matrix[row][col];
			if(current == key) {
				return new int[] {row, col};
			}
			else if (current > key) {
				col --;
			}
			else {
				row ++;
			}
		}
		
		return new int[] {-1, -1};

	}
	
	public static void main (String[] args) {
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int key;
		int[] end = matrixSearch(arr, key);
		
		if (end[0] == -1 && end[1] == -1) {
			System.out.println(end);
		}
		
	}

}
