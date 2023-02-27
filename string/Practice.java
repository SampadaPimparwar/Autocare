package string;
import java.util.*;

public class Practice {
		// Function to return the reverse of n
		static int reverse(int n)
		{
			int rev = 0;
			while (n > 0) {
				int d = n % 10;
				rev = rev * 10 + d;
				n = n / 10;
			}
			return rev;
		}
		
		
		// Function that returns true
		// if n is a palindrome
		static void isPalin(int n)
		{
			int b= 0;
			int d;
			
			if(n==reverse(n)) {
				b++;
			}
			
		}

		// Function to return the
		// count of digits of n
		static int countDigits(int n)
		{
			int c = 0;
			while (n > 0) {
				n = n / 10;
				c++;
			}
			return c;
		}

		// Function to return the count of digits
		// in all the palindromic numbers of arr[]
//		static int countPalinDigits(int[] arr, int n)
//		{
//			int s = 0;
//			for (int i = 0; i < n; i++) {
//
//				// If arr[i] is a one digit number
//				// or it is a palindrome
//				if (arr[i] < 10 || isPalin(arr[i])) {
//					s += countDigits(arr[i]);
//				}
//			}
//			return s;
//		}

		// Driver code
		public static void main(String[] args)
		{
			int[] arr = { 121, 56, 434 };
			int n = arr.length;
			//System.out.println(countPalinDigits(arr, n));
		}
	}

