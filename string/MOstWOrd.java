package string;

import java.util.Arrays;

public class MOstWOrd {
	public static void main(String[] args) {
	    String myStr = "how can I find the most frequent word in an string how can I find how how how string";
	    String[] str2 = myStr.split(" ");
	    Arrays.sort(str2);
	    System.out.println(Arrays.toString(str2));
	    int max = 0;
	    int count= 1;
	    String word = str2[0];
	    String curr = str2[0];
	    for(int i = 1; i<str2.length; i++){
	        if(str2[i].equals(curr)){
	            count++;
	        }
	        else{
	            count =1;
	            curr = str2[i]; 
	        }
	        if(max<count){
	            max = count;
	            word = str2[i];
	        }
	    }
	    System.out.println(max + " times & the word is  " + word);
	}  

}
