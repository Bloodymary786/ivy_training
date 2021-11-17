package sorting;

public class MergeSort {

	static void sort(int arr[], int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start + end) / 2;
		sort(arr, start, mid);
		sort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	static void merge(int[] arr, int start, int mid, int end) {
		int temp[] = new int[end - start + 1];
		int l = start;
		int r = mid + 1;
		int k = 0;
		while (l <= mid && r <= end) {
			if (arr[l] < arr[r]) {
				temp[k] = arr[l];
				l++;
			} else {
				temp[k] = arr[r];
				r++;
			}
			k++;
		}
		//we need to copy the remaining elements
		if(l<=mid) {
			while(l<=mid) {
				temp[k]=arr[l];
				l++;
				k++;
			}
		}else if(r<=end) {
			while(r<=end) {
				temp[k]=arr[r];
				k++;
				r++;
			}
		}
		//we need to copy the values from temp back the original arr
		for(int i=0;i<temp.length; i++) {
			arr[start+i]=temp[i];
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 1, 6, 8, 5, 3, 7 };

		sort(arr, 0, arr.length-1);
		System.out.println("---------------");
		
		for(int temp: arr) {
			System.out.print(temp+" ");
		}
		/*
		 * 2 4 1 6 8 5 3 7 1 2 4 6 3 5 7 8
		 * 
		 * sort(arr, p, r){ if(p<r){ q=(p+r)/2; sort(arr, p, q); sort(arr, q+1, r);
		 * merge(arr, p, q, r)
		 * 
		 * }
		 */

		// https://www.youtube.com/watch?v=Pr2Jf83_kG0
	}
}
