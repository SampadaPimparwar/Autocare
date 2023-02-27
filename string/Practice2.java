package string;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
//	
//	  static void printNos(int n)
//
//	    {
//
//	        if(n > 0)
//
//	        {
//
//	            printNos(n - 1);
//
//	            System.out.print(n + " ");
//
//	        }
//
//	        return;
//
//	    }
//	 
//
//	    // Driver Code
//
//	    public static void main(String[] args) 
//
//	    {
//
//	        printNos(100);
//
//	    }
//	
//	
	public static void main(String[] args) {
	
		List<Integer> l1=new ArrayList<>();
		int i=1;
		while (i<=100) {
			l1.add(i);
			i++;
		}
		System.out.println(l1);
		
	}
	
	
	
	
}
