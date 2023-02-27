package patterns;

public class ArmstrongNo {
	
	public static void main(String args[]) {
		int no = 371,reminder,result = 0;
		int original = no;
		
		while(original > 0) {
			reminder = original % 10;
			result += Math.pow(reminder, 3);
			original /= 10;
		}if(result == no) {
			System.out.println("is armstrong");
		}else {
				System.out.println("is not armstrong");
			}
		
	}

}
