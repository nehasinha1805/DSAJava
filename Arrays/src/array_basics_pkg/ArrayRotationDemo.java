package array_basics_pkg;

/* Reversal Algorithm for array rotation:-
For arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
A = [1, 2] and B = [3, 4, 5, 6, 7]
Reverse A, we get Ar = [2, 1]
Reverse B, we get Br = [7, 6, 5, 4, 3]
Reverse all, we get BrAr = [7, 6, 5, 4, 3, 2, 1]
*/
public class ArrayRotationDemo {

	// to print array data
	static void printArray(int[] ar) {
		int len = ar.length;
		for(int i = 0; i < len; i++) {
			System.out.print(ar[i] + " ");
		}
	}
	
	// to reverse the content of smaller array
	static int[] reverse(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		for(int i = 0; i < n; i++) {
			temp[i] = arr[n-i-1];
		}
		return temp;
	}
	
	// to rotate array to left by d position(s)
	static int[] rotate(int[] a, int d, int n) {
		// Array A is first part of array a
		int[] A = new int[d];
		for(int i = 0; i < d; i++) {
			A[i] = a[i];
		}
		System.out.println("Array A:-");
		printArray(A);
		System.out.println();
		
		// reversing Array A 
		int[] Ar = reverse(A);
		System.out.println("Array Ar:-");
		printArray(Ar);
		System.out.println();
		
		// Array B is second part of array a
		int[] B = new int[n-d];
		for(int i = 0; i < n-d; i++) {
			B[i] = a[i+d];
		}
		System.out.println("Array B:-");
		printArray(B);
		System.out.println();
		
		// reversing array B
		int[] Br = reverse(B);
		System.out.println("Array Br:-");
		printArray(Br);
		System.out.println();
		
		// combining data of array Br and Ar to new BrAr array
		int[] BrAr = new int[n];
		for(int i = 0; i < n-d; i++) {
			BrAr[i] = Br[i];
		}
		for(int i = 0; i < d; i++) {
			BrAr[n-d+i] = Ar[i];
		}
		return BrAr;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		printArray(a);
		System.out.println();
		
		int[] result = rotate(a, 2, 7);
		System.out.println("Result is :-");
		printArray(result);
	}

}
