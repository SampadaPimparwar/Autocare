package oops;

import Inheritance.Animal;

public class Dog extends Animal {

	public void playing() {
		System.out.println("dog is playing");

	}

	public static void main(String args[]) {
		Dog d1 = new Dog();

		d1.eating();

		d1.playing();

	}
}