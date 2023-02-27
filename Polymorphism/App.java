package Polymorphism;

public class App {
	
	public static void main(String args[]) {
		RBIBank rb1 = new SBIBank(); //upcasting
		System.out.println(rb1.getRateOfIntrest());
		
		rb1 = new HDFCBank();
		System.out.println(rb1.getRateOfIntrest());
		System.out.println(rb1.moneyInvestment());
		
		rb1 = new AxisBank();
		System.out.println(rb1.getRateOfIntrest());
		
		System.out.println(rb1.moneyInvestment());
	}

}
