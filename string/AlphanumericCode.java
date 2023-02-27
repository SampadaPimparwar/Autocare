package string;

public class AlphanumericCode {
	public static void main(String args[]) {
		String str = "my name is sampada";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			count++;
		}
		String s = str.charAt(0) + "" + count + "" + str.charAt(str.length() - 1);
		System.out.println(s);
	}

}
