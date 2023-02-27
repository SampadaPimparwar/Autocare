package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveDup {
	public static void main(String[] args) {
		List<String> li = Collections.synchronizedList(new ArrayList<String>());
		li.add("Hello");
		li.add("Hi");
		li.add("World");
		li=Collections.synchronizedList(li);
		synchronized (li) {
			Iterator itr = li.iterator();
			while(itr.hasNext());
			System.out.println(itr.next()+" ");
		}	
   }
}