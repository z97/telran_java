package telran.array.controller;

import telran.array.util.Tools;

public class ArrayAppl {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("size of array = " + arr.length);
		arr[4] = 100500;
		System.out.println(arr[4]);
		System.out.println(arr[7]);
		int[] arr1 = { 2, 3, 4, 3, 2, 1, 2, 6, 7 };
		System.out.println(arr1.length);
		System.out.println(arr1[4]);
		Tools.printArray(arr);
		Tools.printArray(arr1);
		Tools.fillArray(arr, 10, 99);
		Tools.printArray(arr);
		int sum = Tools.sumArray(arr);
		System.out.println("sum = " + sum);
		double res = Tools.avg(arr);
		System.out.println("average = " + res);
	}
}
