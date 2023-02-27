

package string;

public class PalindromeInt {

	public static void main(String[] args) {
		

		int num = 313,reversed = 0,reminder;
		int Orgnum = num;
		while( num>0) {
			reminder = num%10;
			reversed = reversed*10 + reminder;
;			num /= 10;
		}
		if(Orgnum == reversed){
			System.out.println("the value is palindrome");
		}else {
			System.out.println("the value is not palindrome");
			
		}
		
	}

}
