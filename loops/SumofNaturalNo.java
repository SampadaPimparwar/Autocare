package loops;

import java.util.Scanner;

public class SumofNaturalNo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int sum = 0;

		for (int i = 0; i <= no; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
	}
}