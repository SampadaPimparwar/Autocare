package patterns;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if(no==0) {
			System.out.println(0);
			System.exit(0);
			}
		long fact = 1;
		
		for(int i =1; i<=no; i++) {
			fact = fact * i;
		}
		System.out.println("the factorial of given number is :"+fact);
		
	}

}
