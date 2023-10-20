package pack;

public class MergeSort {

	public class MergeSort {
		private static void merge (int[] numbers, int i, int j, int k) {
			int mergedSize = k - i +1;
			int[] mergedNumbers = new int[mergedSize];
			
			int mergePosition = 0;
			int leftPosition = i;
			int rightPosition = j + 1;
			
			while (leftPosition <= j && rightPosition <= k) {
				if (numbers[leftPosition] <= numbers[rightPosition]) {
					mergedNumbers[mergePosition] = numbers[leftPosition];
					leftPosition ++;
				}
				else {
					mergedNumbers[mergePosition] = numbers[rightPosition];
					rightPosition ++;
				}
				mergePosition ++;
			}
			
			while (leftPosition <= j) {
				mergedNumbers[mergePosition] = numbers[leftPosition];
				leftPosition ++;
				mergePosition ++;
			}
			
			while (rightPosition <= k) {
				mergedNumbers[mergePosition] = numbers[rightPosition];
				rightPosition ++;
				mergePosition ++;
			}
			
			for (mergePosition = 0; mergePosition < mergedSize; mergePosition ++) {
				numbers[i + mergePosition] = mergedNumbers[mergePosition];
			}
		}
		
		
		// merge sort function
		private static void mergeSort (int [] numbers, int i, int k) {
			int j = 0;
			
			if (i < k) {
				j = (i + k) / 2;
				
				mergeSort(numbers, i, j);
				mergeSort(numbers, j + 1, k);
				merge(numbers, i, j, k);
			}
		}
		
		// main function
		public static void main (String[] args) {
			int [] numbers = {3, 26, 15, 18, 31, 7, 6, 22};
			
			mergeSort(numbers, 0, numbers.length - 1);
			System.out.println("The sorted list is: " + Arrays.toString(numbers));
		}
	}
}

