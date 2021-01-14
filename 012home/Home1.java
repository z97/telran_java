public class Home1 {

	public static void main(String[] args) {
		// Exercise 1===================
		int res = sumOfDigits(5467872);
		System.out.println("Sum of digits is: " + res);
		System.out.print("\n");
		// Exercise 2===================
		res = countDigits(4346543);
		System.out.println("Number of digits is: " + res);
		System.out.print("\n");
		// Exercise 3===================
		System.out.println("Test Lucky Ticket:");
		printLuckyTicket(385829);
		printLuckyTicket(385143);
		System.out.print("\n");
		// Exercise 4===================
		System.out.println("Test Lucky Number:");
		luckyNumber(123321);
		luckyNumber(1231232);
		luckyNumber(123188);
		luckyNumber(1238321);
	}

	public static void luckyNumber(int num) {
		int count = countDigits(num);
		int count2 = count / 2;
		int indexOfCentraNumber = count2 + 1;
		int sumAll = sumOfDigits(num);
		int sumRightPart = sumOfDigitsCount(num, count2);
		int centralNumber = returnNumberByIndex(num, indexOfCentraNumber);
		int sumLeftPartPlusCentralNumber = sumAll - sumRightPart;
		if (count % 2 == 0) {
			if (sumLeftPartPlusCentralNumber == sumRightPart) {
				System.out.println("It is a Lucky Number");
			} else {
				System.out.println("It is not a Lucky Number");
			}
		} else {
			if ((sumLeftPartPlusCentralNumber - centralNumber) == sumRightPart) {
				System.out.println("It is a Lucky Number");
			} else {
				System.out.println("It is not a Lucky Number");
			}
		}
	}

	public static void printLuckyTicket(int num) {
		if (luckyTicket(num) == 0) {
			System.out.println("It is a Lucky Ticket");
		} else {
			System.out.println("It is not a Lucky Ticket");
		}
	}

	public static int luckyTicket(int num) {
		int sum = 0;
		int neg_sum = 0;
		int rem1 = 0;
		int rem2 = 0;
		do {
			int x1 = 10;
			int x2 = 100;
			rem1 = num % x1;
			rem2 = num % x2;
			rem2 /= 10;
			neg_sum = rem1 - rem2;
			sum += neg_sum;
			x1 *= 100;
			x2 *= 100;
			num /= 100;
		} while (num != 0);
		return sum;
	}

	public static int countDigits(int num) {
		int count = 0;
		do {
			count++;
			num /= 10;
		} while (num != 0);
		return count;
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		int rem = 0;
		do {
			rem = num % 10;
			sum += rem;
			num /= 10;
		} while (num != 0);
		return sum;
	}

	//Tools==================
	//Counts the sum of numbers including the index. From left to right.
	public static int sumOfDigitsCount(int num, int count) {
		int sum = 0;
		int rem = 0;
		do {
			rem = num % 10;
			sum += rem;
			num /= 10;
			count--;
		} while (count != 0);
		return sum;
	}

	public static int returnNumberByIndex(int num, int index) {
		double num2 = 10;
		double index2 = index;
		int pow = (int) java.lang.Math.pow(num2, index2);
		int rem = num % pow;
		rem /= pow / 10;
		return rem;
	}
}
