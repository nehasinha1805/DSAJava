package neha_collection_pkg;

// HashSet has unique set of elements 

import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Apple");
		hs.add("Banana");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
