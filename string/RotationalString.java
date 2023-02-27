package string;

public class RotationalString {
public static void main(String args[]) {
	String str1 = "xyzXXX";
	String str2 = "xxxzyx";
	String revStr1 = "";
	
	for(int i=str1.length()-1;i>=0; i--) {
		revStr1 = revStr1+str1.charAt(i);
		}
	System.out.println(revStr1);
	if(revStr1.toLowerCase().equals(str2.toLowerCase())) {
		System.out.println("Strings are rotationl");
	}else {
		System.out.println("Strings are not rotational");
	}
}
}
