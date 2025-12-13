package arrays;

public class FirstLargest {
	public static int firstLargest(int[] ar) {
		if(ar == null || ar.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] ar = {-10, 0, 5, 3, 99, -50};
		int max = firstLargest(ar);
		System.out.println(max);
		
	}
}
