package string;

public class Addition3largeNUM {

	public static void main(String args[]) {
		int sum = Integer.MIN_VALUE;
		int arr[] = { 11, 32, 58, 2, 65, 42, 200 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (sum < arr[i] + arr[j] + arr[k]) {
						sum = arr[i] + arr[j] + arr[k];
					}
				}
			}
		}
		System.out.println(sum);

	}
}
