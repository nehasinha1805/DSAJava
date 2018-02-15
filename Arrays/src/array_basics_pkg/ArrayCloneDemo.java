package array_basics_pkg;
//Java program to demonstrate 
//cloning of one and multi-dimensional arrays
public class ArrayCloneDemo {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3};
		int[] cloneArray = intArray.clone();
		
		System.out.println(intArray == cloneArray);
		for(int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}
		
		System.out.println("Two Dimenaional array:");
		int[][] intArray2 = {{10, 20, 30}, {40, 50}};
		int[][] cloneArray2 = intArray2.clone();
		System.out.println(intArray2 == cloneArray2);
		
		//will print true as shallow copy is created
		//i.e., sub-array is shared
		System.out.println(intArray2[0] == cloneArray2[0]);
		System.out.println(intArray2[1] == cloneArray2[1]);
		
	}
}
