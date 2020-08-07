package PracticePrograms;

import java.util.Scanner;

public class DisplayTheWeekDay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input =in.nextInt();
		if(input == 1)
		{
			System.out.println("Sunday");
		}
		else if(input == 2) {
			System.out.println("Monday");
		}
		else if(input == 3) {
			System.out.println("Tuesday");
		}
		else if(input == 4){
			System.out.println("Wednesdy");
		}
		else if(input == 5) {
			System.out.println("Thursday");
		}else if(input ==6) {
			System.out.println("Friday");
		}
		//else if(input == 6) {
			//System.out.println("Saturday");
		//}
		else {System.out.println("Saturday");

	}

}
}