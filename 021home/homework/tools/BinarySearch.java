package homework.tools;

public class BinarySearch {
	public static int binarySearch(int[] arrayToSearch, int element) {
		int lowIndex = 0;
		int highIndex = arrayToSearch.length - 1;

		// Holds the position in array for given element
		// Initial negative integer set to be returned if no match was found on array
		int elementPos = -1;

		// If lowIndex less than highIndex, there's still elements in the array
		while (lowIndex <= highIndex) {
			int midIndex = (lowIndex + highIndex) / 2;
			if (element == arrayToSearch[midIndex]) {
				elementPos = midIndex;
				break;
			} else if (element < arrayToSearch[midIndex]) {
				highIndex = midIndex - 1;
			} else if (element > arrayToSearch[midIndex]) {
				lowIndex = midIndex + 1;
			}
		}
		return elementPos;
	}
	
	public static int binarySearchTelRan(int[] arr, int value) {
		int l = 0;
		int r = arr.length - 1;
		while( l <= r) {
			int mid = ( l + r) / 2;
			if(value == arr[mid]) {
				return mid;
			}
			if(value < arr[mid]) {
				r = mid - 1;
			}
			if(value > arr[mid]) {
				l = mid + 1;
			}
		}
		return -1;
	}
}

