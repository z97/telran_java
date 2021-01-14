package homework.sorttools;

public class SortTools {
	public static void bubleSortMaxToEnd(int[] arr) {
		boolean res_maxToEnd = false;
		do {
			res_maxToEnd = maxToEnd(arr);
		}while(res_maxToEnd);
	}
	
	private static boolean maxToEnd(int[] ar) { 
		boolean flag = false;
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] > ar[i + 1]) {
				int temp = ar[i];
				ar[i] = ar[i + 1];
				ar[i + 1] = temp;
				flag = true;
			}
		}
		return flag;
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int minNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = minNumber;
		}
	}
}
