package main.java;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {  
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter a Day:");
	    String day = sc.nextLine();
	    switch(day){  
	    case "Monday": System.out.println("Today is: "+ day);  
	    break;  
	    case "Tuesday": System.out.println("Today is: "+ day);  
	    break;  
	    case "Wednesday": System.out.println("Today is: "+ day);    
	    break;  
	    case "Thursday": System.out.println("Today is: "+ day);    
	    break;  
	    case "Friday": System.out.println("Today is: "+ day);   
	    break;  
	    case "Saturday": System.out.println("Today is: "+ day);    
	    break;  
	    case "Sunday": System.out.println("Today is: "+ day);    
	    break;  
	    default:System.out.println("Invalid value for a day : " + day);  
	    }  
	}  
}
