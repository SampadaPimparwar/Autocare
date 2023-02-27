package oops;

import Inheritance.HDFCBank;
import Inheritance.SBIBank;

public class App2 {

	public static void main(String args[]) {

		SBIBank b1 = new SBIBank();
		System.out.println(b1.getRateOfIntrest());
		b1.display();
		b1.money();
		

		HDFCBank h1 = new HDFCBank();
		System.out.println(h1.getRateOfIntrest());
        h1.display();
        h1.change(22);
        
	}
}
