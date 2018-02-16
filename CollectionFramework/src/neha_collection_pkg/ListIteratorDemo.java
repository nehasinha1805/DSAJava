package neha_collection_pkg;

// ListIterator can iterate both backward and forward while iterator can iterate only forward
import java.util.*;
public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Chiku");
		al.add("Drumstick");
		al.add(1, "Banana");
		
		System.out.println("Item at index 2 " + al.get(2));
		ListIterator<String> itr = al.listIterator();
		
		System.out.println("traversing elements in forward direction:-");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Traversing elements in backward direction:-");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
