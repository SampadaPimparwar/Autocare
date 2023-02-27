package string;
import java.util.Arrays;  

public class Anagram {
/**public static void main(String args[]){
	
	String str1 = "XYZX";
	String str2 = "ZY X";
	int count =0;
	
	if(str1.length()==str2.length()) {
		for(int i=str1.length()-1; i>=0; i--) {
			Character c = str1.charAt(i);
			if(!str2.contains(c.toString())) {
				count++;
				break;
			}
		}
		if(count == 0)
			System.out.println("Anagram");
		else
			System.out.println("not Anagram");
	}else {
		System.out.println("String is not Anagram.");
	}
 }
}
	**/
	
	//import java.util.Arrays;  
	   
	//public class AnagramString {  
	    static void isAnagram(String str1, String str2) {  
	        String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	    }  
	   
	    public static void main(String[] args) {  
	        isAnagram("Keep","Pe k");  
	        isAnagram("Mother In Law", "Hitler Woman");  
	    }  
	}
	
	
	
	
	
	
	
	
