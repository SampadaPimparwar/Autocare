package string;

import java.util.Arrays;

public class Ex {

	public static void main(String args[]) {
		String s1 = "keep";
		String s2 = "pe k";
		boolean status = true;
		 
		if(s1.length() != s2.length()) {
			status = false;
		}
		else {
			char[] Array1 = s1.toLowerCase().toCharArray();
			char[] Array2 = s2.toLowerCase().toCharArray();
			 Arrays.sort(Array1);
			 Arrays.sort(Array2);
			 status = Arrays.equals(Array1, Array2);
			
		}
		if(status) {
			System.out.println("they are anagram");
		}else {
			System.out.println("they are not anagram");
		}
	}
}
