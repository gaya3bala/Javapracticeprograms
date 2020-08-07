package PracticePrograms;

import java.util.Scanner;

public class BMIConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the weight in pound:");
		double wt = in.nextDouble();
		System.out.println("enter the height in inch:");
		double ht = in.nextDouble();
		
		double bmi = wt/(ht*ht);
		System.out.println("bmi is:" +bmi);
		

	}

}
