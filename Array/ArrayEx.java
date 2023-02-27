package Array;

public class ArrayEx {

	public static void main(String args[]) {
		int[] arr = { 3, 4, 8, 9, 1 };
		int x = 5;
		boolean ispresent = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == x) {
				ispresent = true;
			}
		}
		if (ispresent) {
			System.out.println(" found ");
		} else {
			System.out.println("is not found");
		}
	}
}
