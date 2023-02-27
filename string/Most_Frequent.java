package string;

import java.util.Arrays;
import java.util.Scanner;

public class Most_Frequent
 {
	public static void main(String args[]) 
	{
		System.out.println("Enter the String that you like");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String[] ch = s1.split("\\s");
		String s2 = "";

		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i].length() > 0) 
			{
				s2 += ch[i];
				System.out.println(ch[i]);
			}
		}
	//	System.out.println(Arrays.toString(ch));

		String s3 = "";

		for (int i = 0; i < s2.length(); i++)
		{
			int count = 0;
			for (int j = i + 1; j < s2.length(); j++)
			{
				if (s2.charAt(i) == s2.charAt(j))
				{
					count++;
				}
			}
			if (count == 0) {
				s3= s3+ s2.charAt(i);
			}

		}
		System.out.println("without duplicate character   :" + s2);
		int max = Integer.MIN_VALUE;
		char c = ' ';

		for (int i = 0; i < s3.length(); i++) 
		{
			int count = 0;
			for (int j = 0; j < s2.length(); j++) 
			{
				if (s3.charAt(i) == s2.charAt(j)) 
				{ 
					count++;
				}
				if (count > max)
				{
					max = count;
					c = s3.charAt(i);
				}
			}
		}
		System.out.println(c + " " + max);

	}
}
