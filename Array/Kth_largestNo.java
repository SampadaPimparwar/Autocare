package Array;

public class Kth_largestNo {

	public static void main(String args[]) {
		int[] arr = { 3, 4, 8, 25, 15, 12 };
		int k = 4;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if (i == k - 1) {
				System.out.println(k + " thelargest element is " + arr[i]);
				break;
			}
		}
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");

		}
	}
}
