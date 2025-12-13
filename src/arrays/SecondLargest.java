package arrays;

public class SecondLargest {
	public static int secondLargest(int[] ar) {
		int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
		  boolean foundSecond = false;
		  
		if (ar == null || ar.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements");
		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				 if (max != Integer.MIN_VALUE || i > 0) { // only update secMax if max was set
		                secMax = max;
		                foundSecond = true;
		            }
				max = ar[i];
			} else if (ar[i] > secMax && ar[i] != max) {
				secMax = ar[i];
				foundSecond = true;
			}
		}
		if (!foundSecond) {
	        throw new IllegalArgumentException("Second largest element does not exist");
	    }

		return secMax;
	}

	public static void main(String[] args) {
		int[] arr = { Integer.MIN_VALUE, -1 };

		int secondLargest = secondLargest(arr);
		System.out.println(secondLargest);
	}
}
