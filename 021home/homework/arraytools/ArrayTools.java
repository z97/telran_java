package homework.arraytools;

public class ArrayTools {
	public static double avg(int[] arr) {
		return 1. * sumArray(arr) / arr.length;
	}
	
	public static int sumArray(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		return res;
	}
	
	public static void fillArray(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random() * (max -  min + 1));
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
