package CollectionInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
	
	public class Practice2 {
		//public static void main(String args[]) {
		//List<String> numbers = Arrays.asList("10","20","30","60");
		//Iterator<String> itr = numbers.iterator();
	//	while(itr.hasNext()) {
	//List<Integer> listOfInteger = convertStringListToIntList(listOfString,Integer::parseInt);
	//	List<Integer> sample2 = numbers.stream()
	//			.filter(str -> str.codePoints().allMatch(Character::isDigit)).map(Integer::parseInt).collect(Collectors.toList());
    //System.out.println(sample2);
	//}
	//String[] string = itr.replaceAll
//		}}


//Java program to Sort square of the numbers
//of the array


 // Function to sort an square array

 public static void sortSquares(int arr[]){

     int n = arr.length;


     // First convert each array elements

     // into its square

     for (int i = 0; i < n; i++)

         arr[i] = arr[i] * arr[i];


     // Sort an array using "inbuild sort function"

     // in Arrays class.

     Arrays.sort(arr);

 }


 // Driver program to test above function

 public static void main(String[] args)

 {

     int arr[] = { -6, -3, -1, 2, 4, 5 };

     int n = arr.length;


     System.out.println("Before sort ");

     for (int i = 0; i < n; i++)

         System.out.print(arr[i] + " ");


     sortSquares(arr);

     System.out.println("");

     System.out.println("After Sort ");

     for (int i = 0; i < n; i++)

         System.out.print(arr[i] + " ");

 }
}