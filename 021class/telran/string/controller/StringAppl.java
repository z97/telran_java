package telran.string.controller;

public class StringAppl {

	public static void main(String[] args) {
		String str = "hello";
		String sign = " ! ";
		String res = str + sign;
		System.out.println(res);
		res = "5" + 6;
		System.out.println(res);
		double result = calculator(3.5, 5.5, "/");
		System.out.println("result = " + result);
	}
	
	private static double calculator(double operand1, double operand2, String operation) {
		switch (operation) {
		case "+":
			return operand1 + operand2;
		case "-":
			return operand1 - operand2;
		case "*":
			return operand1 * operand2;
		case "/":
			return operand1 / operand2;
		default:
			System.out.println("wrong");
			return 0;
		}
	}

	public static void greeting(String name) {
		String str = name + "wellcome";
		System.out.println(str);
	}
	
	
}
