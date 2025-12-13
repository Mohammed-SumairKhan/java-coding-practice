package arrays;

public class SecondSmallest {
	public static int secondSmallest(int[] ar) {
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		boolean secondSmallestFound = false;
		
		if(ar == null || ar.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements");
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < min) {
				if(min != Integer.MAX_VALUE || i > 0 ) {
					secondMin = min;
					secondSmallestFound = true;
				}
				min = ar[i];
			} else if (ar[i] < secondMin && ar[i] != min) {
				secondMin = ar[i];
				secondSmallestFound = true;
			}
		}
		if(!secondSmallestFound) {
			throw new IllegalArgumentException("Second largest element does not exist");
		}
		return secondMin;
	}
	
	public static void main(String[] args) {
		int[] arr = {Integer.MAX_VALUE, 1};
		int min = secondSmallest(arr);
		System.out.println(min);
	}
}
