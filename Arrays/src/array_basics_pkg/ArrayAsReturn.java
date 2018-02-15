package array_basics_pkg;

public class ArrayAsReturn {
	public static void main(String[] args) {
		int[] arr = meth();
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static int[] meth() {
		
		return new int[] {10, 20, 30};
	}
}
