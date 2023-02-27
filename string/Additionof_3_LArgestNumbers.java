package string;

public class Additionof_3_LArgestNumbers {
	public static void main(String args[]) {
		int arr[] = { 100, 34, 87, 69, 55 };
		int n = arr.length;
		sumofThreenumbers(arr, n);
	}

	static void sumofThreenumbers(int arr[], int n) {
		int i, first, second, third;

		if (n < 3) {
			System.out.println("Invalid numbers");
			return;
		}
		first = second = third = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else 
				if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else
				if (arr[i] > third) {
				third = arr[i];
			}
		}
		System.out.println("first largest = " + first+" \nsecond largest = " + second + " \nthird largest = " + third);
		int sum = first + second + third;
		System.out.println("the sum of largest 3 numbers is :" + sum);
	}

}
