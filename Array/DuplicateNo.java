package Array;

public class DuplicateNo {

	public static void main(String args[]) {
		int arr[] = {11,15,33,22,33,50,50};
		
		for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) 
                 System.out.println("is duplicate number  :"+arr[i]);
			
		}
		}
	}
}
