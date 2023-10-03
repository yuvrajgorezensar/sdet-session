package main.java;

import java.util.Scanner;

public class LeapYear {


	public static void main(String args[]) {
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year:");
		year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.format("/n %d is a leap year", year);
		} else if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.format("/n %d is a leap year", year);
		} else {
			System.out.format("/n %d is not a leap year", year);
		}
	}
}
