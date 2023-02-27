package Array;

public class AdditionofTwoArray {
	public static void main(String args[]) {
		int a[][] = {{2,3,4},
					 {4,5,7}};
		
		int b[][] = {{2,6,4},
					 {4,5,7}};
		int c[][] = new int[2][3] ;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
//		for(int i=0;i<c.length;i++)
//		{
//			for(int j=0;j<c[i].length;j++)
//			{
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
		
	}

}
