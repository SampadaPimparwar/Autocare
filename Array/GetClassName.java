package Array;

public class GetClassName {
	public static void main(String args[]) {
		int ay[] = {2,5,7,9,3};
		//getting the class name of array 
		Class c = ay.getClass();
		String name = c.getName();
		
		//printing the class name
		
		System.out.println(name);
	}

}
