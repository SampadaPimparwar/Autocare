package string;

public class Largest_common_Prefix {
//*
	public static void main(String args[]) {
		String[] words = new String[] { "flower", "flow", "flower", "flob" };
		String prefix = words[0];

		for (String word : words) {
			while (word.indexOf(prefix) != 0) {            //
				prefix = prefix.substring(0, prefix.length() - 1);

			}
		}
		if (!prefix.equals("")) {
			System.out.println(prefix);
		} else {
			System.out.println("no prefix");
		}

	}
}
