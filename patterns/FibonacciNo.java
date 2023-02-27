package patterns;

import java.util.Scanner;

public class FibonacciNo {
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int firstterm = 0,no =sc.nextInt(),secondterm = 1;
		System.out.println("Fibonacci series upto  "+no);
		
		while(firstterm <= no) {
            
			System.out.print(firstterm+" , ");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
            
		}
	}
	
}
