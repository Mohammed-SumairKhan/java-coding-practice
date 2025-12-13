package arrays;

public class CopyArray {
	public static void copyArray(int[] ar) {
		if(ar == null || ar.length == 0) {
			 System.out.println("Copied array is empty");
		        return;
		}
		
		int[] copiedArray = new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			copiedArray[i] = ar[i];
		}
		
		for(int i=0;i<copiedArray.length;i++) {
			System.out.print(copiedArray[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		copyArray(arr);
	}
}
