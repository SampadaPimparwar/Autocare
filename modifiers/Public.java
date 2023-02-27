package modifiers;

public class Public {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String args[]) {
		Public p1 = new Public();
		p1.add(20, 45 );
	}
}
