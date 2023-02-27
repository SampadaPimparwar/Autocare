package loops;

import java.util.Scanner;

public class Tables {

	public static void main(String args[]) {
	/**	Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(i*no);
		}
	**/
		int no = 4;
		
		for(int i=1; i<=no; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i*j);
			}System.out.println();
		}
	}
	
	
}
