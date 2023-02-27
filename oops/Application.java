package oops;

public class Application {

	public void barking() {
		System.out.println("Dog is barking");
	}
	public static void main(String args[]) {

		BabyDog b1 = new BabyDog();
		b1.eating();
		b1.sleeping();
		b1.playing();
	
		Application b2 = new Application();
		 b2.barking();
	}
}
