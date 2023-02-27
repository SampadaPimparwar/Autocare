package Polymorphism;

public class MainMethod {

	public static void main(String args) {
		System.out.println(args);

	}

	public static void main(String args[]) {
		System.out.println("main");
		MainMethod.main("aai*");

	}
}
