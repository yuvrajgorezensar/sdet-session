package main.java;

import java.util.Scanner;

public class ArithmaticOperationWithSwitch {
	
	

	public static void main(String[] args) {  
		ArithmaticOperationWithSwitch op = new ArithmaticOperationWithSwitch();
		int a = 10;
		int b = 20;
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter operation name:");
	    String operation = sc.nextLine();
	    switch(operation){  
	    case "addition": op.add(a, b, operation);
	    break;  
	    case "substraction": op.substraction(a, b, operation);  
	    break;  
	    case "multiplication": op.multiplcation(a, b, operation);    
	    break;  
	    case "division": op.division(a, b, operation);       
	    break;  
	    default:System.out.println("Invalid value for operation : " + operation);  
	    }  
	}

	private void division(int i, int j, String operation) {
		int result = i / j;
		System.out.println(operation + " result is: " + result );
	}

	private void multiplcation(int i, int j, String operation) {
		int result = i * j;
		System.out.println(operation + " result is: " + result);
	}

	private void substraction(int i, int j, String operation) {
		int result = i - j;
		System.out.println(operation + " result is: " + result );
	}

	private void add(int i, int j, String operation) {
		int result = i + j;
		System.out.println(operation + " result is: " + result );
	}
}
