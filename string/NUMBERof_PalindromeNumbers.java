package string;
import java.util.*;

public class NUMBERof_PalindromeNumbers {

	    public static void main(String args[]){
	        int[] a = {2002,1010,2002,3333,4025};
	        int[] b = new int[a.length];
	        int r,temp, j= 0;
	        int n=0;
	        //It is the number variable to be checked for palindrome

	        for(int i = 0; i < a.length; i++){
	            n = a[i];
	            temp = n;
	          int  sum = 0;
	            while(n>0){
	                r=n%10;  //getting remainder
	                sum=(sum*10)+r;
	                n=n/10;
	            }
	            if(temp==sum){
	                b[j] = a[i];
	                j++;
	            }
	        }

	        int k = 0; 
	        for(int i : b){
	            if(i == 0){
	                continue; //this will ignore the value of b[i] == 0
	            }
	            k = k+1;
	            System.out.print(i+" ");
	        }
	        if(k == 0){
	            System.out.println("there has no palindrome values");
	        }
	         System.out.println("\nthe total palindrome values are: "+k);
	    }
	}


