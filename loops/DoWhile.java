package loops;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);                                //something wrong
		int choice = 0;
		int marks = sc.nextInt();
		
		do{

			if(marks >=90) {
				System.out.println("very good");
			}else if(marks >=60){
					System.out.println(" it was nice");
				}else if(marks >=30) {
						System.out.println("do hard work");
		}else {
			System.out.println("do u want to know more?(1/0)");
			choice = sc.nextInt();
		}
	}while(choice == 0);
		System.exit(choice);
		System.out.println("welcome back");
}
}
