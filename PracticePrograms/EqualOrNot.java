package PracticePrograms;

import java.util.Scanner;

public class EqualOrNot {

	public static void main(String[] args) {
     //declare input variable
    	int a =45;
		int b=34;
		int c=56;
		int d= 23;
		if(a==b || b==c || c==d) {
			System.out.println("numbers are equal");
		}
		else {
			System.out.println("numbers not equal");
		}
		
		//getting input from user
		
		Scanner in = new Scanner(System.in);
		System.out.println("input first number:");
		int num1 = in.nextInt();
		System.out.println("input second number:");
		int num2 = in.nextInt();
		System.out.println("input third number:");
		int num3 = in.nextInt();
		System.out.println("input fourth number:");
		int num4 = in.nextInt();
		
		if(num1==num2 && num2==num3 && num3==num4) {
			System.out.println("number are equal");
		}
		else {
			System.out.println("numbers not equal");
		}
		
		
		//accept double variable from user and check if it is between 0 & 1
		
		//Scanner in = new Scanner(System.in);
	     boolean b1=true;
	     boolean b2=false;
		System.out.println("input first double number:");
		double d1 = in.nextDouble();
		System.out.println("input second double number");
		double d2=in.nextDouble();
		if(d1 >= 0 && d2<=1) {
			System.out.println(b1);
		}
		else {
			System.out.println(b2);
		}


	}

}
