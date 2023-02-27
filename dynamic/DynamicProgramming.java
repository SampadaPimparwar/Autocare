package dynamic;

import java.util.Arrays;

public class DynamicProgramming {
	public static void main(String[] args) {

		int n = 18;
		int a[] = { 7, 5, 1 };
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);              //-1 for not getting any ans
		dp[0] = 0;
		
		int ans = minCoins(n, a,dp);
		System.out.println(ans);
		for(int x:dp) {
			System.out.print(x+" ");
		}

	}

	static int minCoins(int n, int a[],int dp[]) {                    //5*2,7*1,1*1=18
		if (n == 0)
			return 0; // if n=0,return 0
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (n - a[i] >= 0) {
				int subAns = 0;
				if(dp[n-a[i]]!=-1) {
					subAns = dp[n-a[i]];
				}else {
				 subAns = minCoins(n - a[i], a, dp); // 11
				}
				if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
					ans = subAns + 1; // 18-7
				}

			}

		}
		return dp[n]=ans;

	}

}

/**
 * 18(7 , 5 , 1)
 * 
 * 11(7,5,1) 13 17
 * 
 * 4 , 6 , 10
 */
