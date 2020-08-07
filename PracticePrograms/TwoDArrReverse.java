package PracticePrograms;

public class TwoDArrReverse {

	public static void main(String[] args) {
		int twodm[][] = {{10,20,30},
				     {40,50,60}};
		
		System.out.println("original array:");
		//print_array(twodm);
		//System.out.println("after reversing");
		//System.out.println(twodm.length);
		//System.out.println(twodm[0].length);
		
    //public void print_array(int twodm[][]) {
    	for (int i=0; i<twodm.length; i++) {
    		for(int j=0;j<twodm[0].length;j++)
    		{System.out.print(twodm[i][j]+" ");
    		}
    		System.out.println();
    		
    		}
    	}
    		
    
		

	}


