package PracticePrograms;

import java.util.Scanner;

public class NoOfCharInString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enther the string:");
		String s =in.next();
		NoOfCharInString obj = new NoOfCharInString();
		int charcount = obj.char_count(s);
		System.out.println("no of characters in string is:" +charcount);
		
	}
		
    public int char_count(String str) {
    	int count = 1;
    	{for (int i=0; i<str.length()-1; i++)
    		{if (str.charAt(i)== ' ' && (str.charAt(i+1) != ' '))
    			count++;
    		}	
    	 count = count+1;
    	
    	return count;
    	}

	}
}


