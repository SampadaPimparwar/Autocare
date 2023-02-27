package Array;

import java.util.Arrays;
import java.util.Scanner;

public class D2Array {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 123 456 789
		 */
		int[][] arr = new int[3][3]; // number of columns are not require to specify
//		int [][] arr= {{1,2,3},//0 index
//				       {4,5},   //1 index                       //we can imagine like array of Arrays
//				       {6,7,8,9}};      //2 index       
		// input
		for (int row = 0; row < arr.length; row++) {
			// for each column in every row
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		// output
		for (int row = 0; row < arr.length; row++) {
//			// for each column in every row
//			for (int col = 0; col < arr[row].length; col++) {            //arr[row].length=cloumn length
//				System.out.print(arr[row][col] + " ");
//			}
//			System.out.println();
//
			System.out.println(Arrays.toString(arr[row]));
	}
System.out.println("******************************************************");
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		String []ars = new String[4];
		System.out.println(ars[0]);
//		for(String[] str : ars) {
//		System.out.println(ars);	
//		}

		
		}

	}

