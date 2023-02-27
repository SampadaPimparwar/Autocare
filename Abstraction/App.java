package Abstraction;

public class App {
	public static void main(String args[]) {
		Bank b1 = new SBI();
		System.out.println(b1.getROI());
	}
}
