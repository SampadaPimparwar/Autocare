package Array;

public class SecondLargest {

	public static void main(String args[]) {
		int arr[] = { 10, 1, 99, 97, 98 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					max = arr[i];
					arr[i] = arr[j];
					arr[j] = max;

				}
			}
		}
		System.out.println("Second lowest no. is : " + arr[1]);
	}

}
