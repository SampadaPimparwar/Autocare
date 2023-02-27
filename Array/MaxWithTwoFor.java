package Array;

public class MaxWithTwoFor {

	public static void main(String args[]) {
		int arr[] = {3,16,2,12,16,11};
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] >arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
	}
	}
	}
		System.out.println("the largest number from array = "+arr[arr.length-1]);
	}	
	
}
