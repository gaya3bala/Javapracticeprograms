package PracticePrograms;

import java.util.Scanner;

public class SumofAllNum {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number b/w 0 to 1000:");
		int a = obj.nextInt();
		int b,sum=0;
		while (a>0) {
		     b = a % 10;
		    sum = sum + b;
		    a=a/10;
		}
		 System.out.println("the sum of all digits is:" +sum);

	}

}
