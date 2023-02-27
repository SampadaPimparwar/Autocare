package string;

public class Vowels {

	public static void main(String[] args) {

		String str = "Welcome to spring boot project you";
		//int count = 0;
		
		str=str.toLowerCase();
		System.out.println("number of vowels");
		
		for(int i=0; i<str.length(); i++) {
              
	/**		if(str.charAt(i)=='a'||

			str.charAt(i)=='e'||

			str.charAt(i)=='i'||

			str.charAt(i)=='o'||
			
			str.charAt(i)=='u') {
				count++;
				System.out.println(str.charAt(i));
			}
		}
	}
}
**/
//we can also use switch method
       char c = str.charAt(i);
       
       switch(c){
       case 'a' :
              System.out.println(c);
               break;
       case 'e' :
              System.out.println(c);
              break;

       case 'i' :
              System.out.println(c);
              break;

       case 'o' :
              System.out.println(c);
              break;

       case 'u' :
              System.out.println(c);

       }
   }
 }
}



