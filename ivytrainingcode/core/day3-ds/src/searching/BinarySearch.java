package searching;
import java.util.*;
public class BinarySearch {

	public static int binarySerach(int arr[], int key) {
		int first=0;
		int last=arr.length-1;
		int mid=(first+last)/2;
		
		while(first<=last) {
			if(arr[mid]< key) {
				first=mid+1;
			}else if(arr[mid]==key) {
				break;
			}else
				last=mid-1;
			
			mid=(first+last)/2;
		}
		if(first> last)
			return -1;
		else
			 return mid;
	}
	public static void main(String[] args) {
		//O(log n)	
		int arr[] = { 59, 6, 71, 7, 5, 77, 8 };
		
		Arrays.sort(arr);// this method is used to sort the array
		printArray(arr);
		
		int index=binarySerach(arr, 71);
		System.out.println("---------------");
		System.out.println(index);
	}

	private static void printArray(int[] arr) {
		for(int temp: arr) {
			System.out.print(temp+" ");
		}
	}
}
