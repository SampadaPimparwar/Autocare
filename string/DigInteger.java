 package string;
import java.math.BigInteger;
public class DigInteger {
	
	public static void main(String args[]) {
	
		BigInteger sum;
		String s1 = "12345678998765432123";
		String s2 = "87654323456765434567";
		
		BigInteger s3 = new BigInteger(s1);
		BigInteger s4 = new BigInteger(s2);
		
		sum = s3.add(s4);
		System.out.println("the addition of big integers is\n"+sum);
	}

}
