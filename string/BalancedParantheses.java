package string;

public class BalancedParantheses {

	public static void balancedBracec(char[] c) {
		int count = 0;
		int j = c.length - 1, i = 0;

		while (i <= j) {
			int c1 = (int) (c[i]);
			int c2 = (int) (c[j]);
			if ((c1 == 123 && c2 == 125) || (c1 == 91 && c2 == 93) || (c1 == 40 && c2 == 41)) {
				count++;
			}
			i++;
			j--;
		}
		if (count == c.length / 2)
			System.out.println("Symmetrical parantheses");
		else
			System.out.println("Asymmetrical parantheses");

	}

	public static void main(String args[]) {
		char[] c = { '{', '[', '(', ')', ']', '}' };
		balancedBracec(c);
	}
}
