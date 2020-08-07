package PracticePrograms;

import java.util.Scanner;

public class PosOrNegative {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		if(num>0) {
			System.out.println("number is positive");
		    }else {
		    	System.out.println("number is negative");
		    }
		
		//find the greatest of three numbers
		System.out.println("tnter the numbers:");
	   int num1 = obj.nextInt();
	   int num2 = obj.nextInt();
	   int num3 = obj.nextInt();
	   if(num1>num2  && num1>num3) {
		   System.out.println(+num1+"is the greatest");
	   }
	   else if(num2>num1 && num2>num3){
		   System.out.println(+num2+" num2 is the greatest");
		   
	   }else {
		   System.out.println(+num3+"is the greatest");
	   }
	   
	   
	   

	}

}
