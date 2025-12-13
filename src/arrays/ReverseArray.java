package arrays;

public class ReverseArray {
	public static void reverseArray(int[] ar) {
		if(ar == null || ar.length == 0) {
			System.out.println("Array is Empty");
		}
		
		for(int i=ar.length -1 ; i>=0; i--) {
			System.out.print(ar[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		reverseArray(arr);
	}
}
