package PracticePrograms;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter the temperature in fah:");
	  double f = obj.nextDouble();
	  double c = (f-32)*5/9;
	  System.out.println("f to c is:"+c);
	  
	  
	}

}
