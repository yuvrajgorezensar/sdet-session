package main.java;

public class Sum {
	
	int result;
	
	int add(int a, int b) {
		result = a + b;
		return result;
	}
	
	public static void main(String args[]) {
		
		Sum s = new Sum();
		System.out.println("Result: " + s.add(4, 9));
		
	}

}
