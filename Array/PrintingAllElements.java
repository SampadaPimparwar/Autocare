package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingAllElements {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		arr[0] = 99;
		arr[1] = 6;
		arr[2] = 92;
		arr[3] = 34;
		arr[4] = 9;
//		System.out.println(arr[1]);

		//inserting elements
		for(int i= 0; i<arr.length;i++) {
			System.out.print(arr[i]+" -> ");
	}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		
//		//for printing arr[index]
//		for(int i = 0;i<arr.length; i++) {
//			int d = sc.nextInt();
//			System.out.println(arr[i]+" ");
//		}
		
//		for(int num :arr) {
//			System.out.print(num+" -> ");
//		}
		
		
	}

}
