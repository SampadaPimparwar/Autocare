package Array;

public class MinNo {
	
	public static void main(String args[]) {
		int arr[] = {10,20,88,2,4,2,8};
		int temp = 0;
		for(int i= 0; i<arr.length; i++){
		for(int j= i+1; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				temp = arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
				
			}
		}
		}
		System.out.println("the smallest number from arry is :"+arr[arr.length-1]);
		}

}
