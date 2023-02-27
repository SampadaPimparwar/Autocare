package string;

import java.util.Scanner;

public class Stringex2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		String fullname = sc.next();
		
		String complete = name +" "+ fullname;
		
		System.out.println(complete.substring(5,7));
		
	}
	
	
}
