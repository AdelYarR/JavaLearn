import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
		int[] array = {7,2,1,5,6,9,3};
		
		int[] result1 = bubbleSort(array);
		int[] result2 =	selectSort(array);
		printArr(result1);
		printArr(result2);
	}

	static void printArr(int[] array) {
		for (int item : array) {
			System.out.print(item + " ");
		}
		System.out.print("\n");
	}
	
	// Сортировка пузырьком
	static int[] bubbleSort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length-i-1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
	
	// Сортировка выбором
	static int[] selectSort(int[] array) {
		int length = array.length;
		int min;
		for (int i = 0; i < length; i++) {
			min = i;
			for (int j = i+1; j < length; j++) {
				
				if (array[j] < array[min]) {
					min = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
		return array;
	}
}