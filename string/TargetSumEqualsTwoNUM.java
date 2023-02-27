package string;

public class TargetSumEqualsTwoNUM {

	public static void main(String args[]) {
		int arr[] = { 21, 554, 44, 45, 32 };
		int a = 53;
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (a == arr[i] + arr[j]) {
					a = arr[i] + arr[j];
					System.out.println("the target num : " + a
							+ " the two numbers of arrays which have sum as like target num is : " + arr[i]
							+ " at index : " + i + " and " + arr[j] + " at index : " + j);
		}
		
	}

}
