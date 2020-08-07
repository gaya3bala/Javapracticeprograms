package PracticePrograms;

import java.util.Scanner;

public class MinIntoYrs {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the minutes:");
	    long min =obj.nextLong();
	    long yr = min/(24*60*365);
	    //long days = min/24/60/365;
	    long days = (min/24/60) % 365;
	    System.out.println(+min+ " has aproximately " +yr+ " in it");
	    System.out.println(+days);
	    
		

	}

}
