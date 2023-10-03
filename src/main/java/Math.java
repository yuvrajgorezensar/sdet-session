package main.java;

public class Math {

	//private int result;
	
	public static void main(String args[]) {
		
		Math m = new Math();
		System.out.println("Addition: " + m.add(4, 2) );
		System.out.println("Substraction: " + m.substraction(4, 2));
		System.out.println("Multiplication: "+ m. multiplcation (4, 2));
		System.out.println("Division: " + m.division(4, 2));
	}

	private int division(int i, int j) {
		/*
		 * result = 0; result = i / j; return result;
		 */
		return i / j;
	}

	private int multiplcation(int i, int j) {
		/*
		 * result = 0; result = i * j; return result;
		 */
		return i * j;
	}

	private int substraction(int i, int j) {
		/*
		 * result = 0; result = i - j; return result;
		 */
		return  i - j;
	}

	private int add(int i, int j) {
		/*
		 * result = 0; result = i + j; return result;
		 */
		return i + j;
	}
}
