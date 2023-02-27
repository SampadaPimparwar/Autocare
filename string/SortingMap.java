package string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMap {
	
	
	public static void main(String args[]) {
		
		Map<Integer, Integer> sortmap = new HashMap<Integer, Integer>();
		sortmap.put(7,4);
		sortmap.put(8,33);
		sortmap.put(2,22);
		sortmap.put(3,1);
		sortmap.put(1,101);
		sortmap.put(5,110);
		sortmap.forEach((k,v)->System.out.println(k+" -> "+v));
		
		System.out.println("After sorting the map by value : ");
		List<Entry<Integer,Integer>> ll = new ArrayList<>(sortmap.entrySet());
		
		//sorting in ascending order
		ll.sort(Entry.comparingByValue());
		//sorting indescending order
		ll.sort(Entry.comparingByValue(Comparator.reverseOrder()));
 	
		for(Map.Entry<Integer,Integer>e:ll){
		System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
