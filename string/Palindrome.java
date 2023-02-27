package string;

public class Palindrome {

	public static void main(String[] args) {
      
		String str = "Radar",reversestr = "";
		//int str2 = str.length();
		for(int i=str.length()-1; i>=0; i--) {
			reversestr = reversestr + str.charAt(i);
		}
			if (str.toLowerCase().equals(reversestr.toLowerCase())) {
				System.out.println("the string is palindrome .");
			}
			else {
				System.out.println("the string is not palindrome");
			}
		}
}
