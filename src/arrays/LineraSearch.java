package arrays;
/**
 * Check whether an element exists in an array (Linear Search)
 */
public class LineraSearch {
	static void isElementExists(int[] ar , int target) {
		if(ar == null || ar.length == 0) 
			{
				System.out.println("empty array");
				return;
			}
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == target) {
				System.out.println("Element found at index "+i);
				return;
			}
		}
			System.out.println("Element not found");
	}
	public static void main(String[] args) {
		int[] arr = {5, 10, 0, 20};
		int target = 15;
		isElementExists(arr, target);
	}
}
