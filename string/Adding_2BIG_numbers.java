package string;

public class Adding_2BIG_numbers {

	static String findSum(String str1, String str2)
	{
		if (str1.length() > str2.length()){//compare length
			String t = str1;
			str1 = str2;
			str2 = t;
		}
		String str = "";

		// Calculate length of both String
		int n1 = str1.length(), n2 = str2.length();
		int diff = n2-n1;
		int carry = 0;

		// Traverse from end of both Strings
		for (int i = n1 - 1; i>=0; i--)
		{
			int sum = ((int)(str1.charAt(i)-'0') +
				(int)(str2.charAt(i+diff)-'0') + carry);
			str += (char)(sum % 10 + '0');
 			carry = sum / 10;
		}

		// Add remaining digits of str2[]
		for (int i = n2 - n1 - 1; i >= 0; i--)
		{
			int sum = ((int)(str2.charAt(i) - '0') + carry);
			str += (char)(sum % 10 + '0');
			carry = sum / 10;
		}

		// Add remaining carry
		if (carry > 0)
			str += (char)(carry + '0');

		// reverse resultant String
		return new StringBuilder(str).reverse().toString();
	}

	// Driver code
	public static void main(String[] args)
	{
		String str1 = "656666666666666666666666664444";
		String str2 = "1554444444444444444444";
		System.out.println(findSum(str1, str2));
	}
	}
