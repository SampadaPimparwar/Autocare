package Polymorphism;

public class CompileTime {
	String name;
	int age;

	public void displayInfo(String name) {
		System.out.println(name);
	}

	public void displayInfo(int age) {
		System.out.println(age);
	}
  
	public void displayInfo(String name, int age) {
		System.out.println(name+age);
		System.out.println(age);
	}

	public static void main(String args[]) {
		CompileTime s1 = new CompileTime();
		s1.displayInfo(22);
		s1.displayInfo("sima");
		s1.displayInfo("lala", 33);
	}
}
