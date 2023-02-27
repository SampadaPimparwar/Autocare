package patterns;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String args[]) {
		System.out.println("Enter the decimal number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int index = 0;
		int arr[] = new int[10];

		while (num > 0) {
			arr[index] = num % 2;
			index++;
			num = num / 2;
		}
		System.out.println("the binary number of the decimal number is ");
		for (int i = index - 1; i >= 0; i--)
			System.out.print(arr[i]);

	}
}