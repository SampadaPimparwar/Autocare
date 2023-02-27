package string;

public class Climbing_Stairs {
	static int countWays(int n) {
		int prev = 1;
		int prev2 = 1;
		for (int i = 2; i <= n; i++) {
			int curr = prev + prev2;
			prev2 = prev;
			prev = curr;
		}
		return prev;
	}

	public static void main(String ar̥gs[]) {
		int n = 5;
		System.out.println("the number of ways is : " + countWays(n));
	}

}
