package Array;

public class SecondLowestNo {

	public static void main(String args[]) {
		int arr[] = {5,7,9,20,6,21,2,0};
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
		for(int j= i+1; j<arr.length; j++) {
			if(arr[i]>arr[j]) {
			temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			}
		}
		}
		System.out.println("Second lowest no. is : "+arr[1]);
	}
}
