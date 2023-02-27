package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
	
	public static void main(String agrs[]) {
		Scanner in = new Scanner(System.in);
//		String arr[] = new String[4];
//		
//		for(int i =0;i<arr.length;i++) {
//			arr[i] = in.next();
//		}
		
		String num[] = {"aa","dd","qq","ss"};
		System.out.println(Arrays.toString(num));
		change(num);
		System.out.println(Arrays.toString(num));


	}
	static void change(String[] str) {
		str[3] = "mom";
	}

}
