package hw6;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		int[] array1 = RandomArray(200,5,800);
		int[] array2 = new int[array1.length];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		
		long w = System.nanoTime();
		BubbleSort(array1);
		long x = System.nanoTime();
		long y = System.nanoTime();
		SelectionSort(array2);
		long z = System.nanoTime();
		System.out.println(x-w);
		System.out.println(z-y);
		
	}
	
	public static int[] RandomArray(int size, int start, int end) {
		int[] array = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = r.nextInt(end - start + 1) + start;
		}
		return array;
	}
	
	public static void SelectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int smallIndex = i;
			for(int a = 1; a < array.length; a ++) {
				if (array[a] < array[i]) {
					smallIndex = a;
				}
			}
			if(smallIndex != i) {
				int temp = array[i];
				array[i] = array[smallIndex];
				array[smallIndex] = temp;
			}
		}
	}
	
	public static void BubbleSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int a = 0; a < array.length - 2 - i; a++) {
				if(array[a+1] < array[a]) {
					int temp = array[a];
					array[a] = array[a+1];
					array[a+1] = temp;
				}
			}
		}
	}

}
