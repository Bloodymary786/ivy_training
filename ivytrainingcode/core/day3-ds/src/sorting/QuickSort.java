package sorting;

public class QuickSort {

	public static void quickSort(int [] inputArray, int start, int end){
		if(start < end){
			int pp = partition(inputArray, start, end); // index position of the correctly placed value in the array
			quickSort(inputArray, start, pp-1); // sorts the left half of the range
			quickSort(inputArray, pp+1, end); // sorts the right half of the range
		}
	}
	
	public static int partition(int [] inputArray, int start, int end){
		
		int pivot = inputArray[end];
		// in the first iteration, i starts from -1
		int i = start - 1;
		for(int j = start; j <= end-1; j++){
			if(inputArray[j] <= pivot){
				i++;
				// we are swapping below
				int ival = inputArray[i];
				int jval = inputArray[j];
				inputArray[i] = jval;
				inputArray[j] = ival;
			}
		}
		
		// put the pivot value in the correct slot next
		int ival = inputArray[i+1];
		inputArray[end] = ival;
		inputArray[i+1] = pivot; // here, pivot value is placed in the correct slot of the array.
		
		return i+1;
	}
	
	
	public static void main(String[] args) {
		
		//10    	7  	  1  	  3 	   5	     8 	   9 	  6
		int arr[]= {10,7,1,3,5,8,9,6};
		
		quickSort(arr, 0, arr.length-1);
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
		
		/*
		 * pivot element => last element (6)
		 * 
		 * 
		 * quickSort(arr, p, r){
		 * 	if(p<r){
		 * 	q=partition(arr, p, r);
		 * 	 quickSort(arr, p, q-1);
		 * 	 quickSort(arr, q+1, r);
		 * 	}
		 * }
		 */
		
		
		//https://www.youtube.com/watch?v=MZaf_9IZCrc
	}
}
