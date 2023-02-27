package Abstraction;

abstract class Bank {

	abstract float getROI();
}

class SBI extends Bank {
	float getROI() {
		return 7.5f;

	}

}
