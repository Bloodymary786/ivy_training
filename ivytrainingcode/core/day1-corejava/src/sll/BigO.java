package sll;

public class BigO {

	public static void main(String[] args) {

		// ex of alog with O(1) best perfromance : where time taken is independent of
		// size of data
		int arr[] = { 5, 6, 7, 8, 9 };
		int val = findElByIndex(arr, 92);
		System.out.println(val);
		
		
		//O(N)
		//linear search
		
		int val2=findByLinearSearch(arr, 7);
		
		printStartPattern();
		
	}

	/*
	 * for(.............){
	 * 	for(...........){
	 *    for(.........){
	 *    }
	 *    }
	 *    }
	 */
	
	//O(n2)
	private static void printStartPattern() {
		for(int i=0;i<5;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}



	private static int findByLinearSearch(int[] arr, int data) {
		for(int temp: arr) {
			if(temp==data) {
				return temp;
			}
		}
		return -999;
	}

	private static int findElByIndex(int[] arr, int i) {
		if (i >= 0 && i < arr.length)
			return arr[i];
		else
			return -999;
	}
}
