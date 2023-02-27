package CollectionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

 public class Pratice {
   public static void main(String args[]) {
	
List<String> str = Arrays.asList("Pune","Pimpari","Pandharpur","Mumbai","Banglore");

Iterator<String> itr = str.iterator();
  
 while(itr.hasNext()){
	  String ele = itr.next();
	 
  if (ele.charAt(0) == 'P'){

      System.out.println(ele);
       }
    }
   }
}
 