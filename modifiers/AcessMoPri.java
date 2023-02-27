package modifiers;

 class AcessMoPri {
	private AcessMoPri() {
		System.out.println("my name is sam");
		
	}

		private void add(int a, int b) {
			System.out.println(a+b);
		}
		public static void main(String args[]) {
			AcessMoPri am = new AcessMoPri();
			am.add(20,45);	
			
			
	}

}
