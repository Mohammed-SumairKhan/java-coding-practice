package arrays;

public class CheckArrayIsSorted {
	public static void isSorted(int[] ar) {
	    if (ar == null || ar.length <= 1) {
	        System.out.println("Array is sorted");
	        return;
	    }
	  for(int i=0; i<ar.length -1; i++) {
		  if(ar[i] > ar[i+1]) {
			  System.out.println("array is not sorted");
			  return;
		  }
	  }
	    System.out.println("Array is sorted");
	}
	
	public static void main(String[] args) {
		int[] arr = {};

		isSorted(arr);
	}
}
