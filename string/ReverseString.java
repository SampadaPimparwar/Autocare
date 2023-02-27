package string;

public class ReverseString {

	public static void main(String args[]) {

		String str = "Welcome to India";
		String Word[] = str.split("\\s");
		String reverse = "";
		for (int i = 0; i <= Word.length - 1; i++) {
			String Str2 = Word[i];

			for (int j = Str2.length() - 1; j >= 0; j--) {
				reverse = reverse + Str2.charAt(j);

			}
			System.out.println("reversed of given String =" + reverse);
		}

	}

}
