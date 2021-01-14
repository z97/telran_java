package homework;

import homework.sorttools.SortTools;
import homework.tools.BinarySearch;
import homework.arraytools.ArrayTools;

public class Homework {

	public static void main(String[] args) {
		//Buble Sort
		System.out.println("Buble Sort:");
		int[] arr = { 6, 8, 9, 5, 7, 8, 7, 3, 5, 7, 4, 2 };
		SortTools.bubleSortMaxToEnd(arr);
		ArrayTools.printArray(arr);
		
		//Selection sort
		System.out.println("Selection Sort:");
		int[] arr2 = { 6, 8, 4, 5, 7, 6, 1, 3, 12, 4, 4, 2 };
		SortTools.selectionSort(arr2);
		ArrayTools.printArray(arr2);
		
		//Binary Sort
		System.out.println("Binary Sort:");
		int[] arr3 = {1,2,4,6,7,8,9,10,11,13,14,15};
		int result = BinarySearch.binarySearch(arr3, 11);
		System.out.println("Psition of the element in Bynary Array is: " + result);
		
		//Salary
		salaryCalculator(40000, 2.25);
	}

	public static void salaryCalculator(double salary, double points) {
		double tax = taxOfSalary(salary);
		double netTax = tax - points * 219;
		double netSalary = salary - netTax;
		System.out.println("Your net salary is: " + netSalary + " nis");
	}

	public static double taxOfSalary(double bSalary) {
		double tax = 0;
		double rem = 0;
		double[] wall = { 0, 6330, 9080, 14580, 20260, 42160 };
		double[] taxPercent = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47 };
		int indexMax = indexOfSalary(wall, bSalary);
		for (int i = indexMax; i > 0; i--) {
			rem = bSalary - wall[i - 1];
			bSalary = wall[i - 1];
			tax = tax + rem * taxPercent[i - 1];
		}
		return tax;
	}

	public static int indexOfSalary(double[] wall, double bSalary) {
		for (int i = 0; i < wall.length; i++) {
			if (bSalary < wall[i]) {
				return i;
			}
		}
		return 0;
	}

}
