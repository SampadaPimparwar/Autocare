package Array;

public class MultiplicationOfTwoMatrix {

	public static void main(String args[]) {
		int [][]a = {{2,3,4},
					 {3,4,5},
					 {1,2,3}};
		
		int [][]b = {{2,3,4},
					 {3,4,5},
		              {1,2,3}};
		
		int [][]c = new int[3][3];
		
		for(int i= 0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				//c[i][j] = 0;
				for(int k = 0;k<b.length;k++) {
					c[i][j] += a[i][k]*b[k][j];
					
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
