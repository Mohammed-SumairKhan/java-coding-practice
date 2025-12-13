package arrays;

public class FirstSmallest {
	public static int firstSmallest(int[] ar) {
		int min = Integer.MAX_VALUE;
		
		if(ar == null || ar.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		for(int i=0; i<ar.length;i++) {	
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] arr = { 45, -2, 0, 99, -100, 23 };
		int min = firstSmallest(arr);
		System.out.println(min);
	}
}
