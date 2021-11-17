package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		//25	47		3	19	  8		18
		int arr[]= {25,47,3,19,8,18};
		
		for(int i=1;i<arr.length; i++) {
			int ele=arr[i];
			
			int j=i-1;
			while(j>=0 && arr[j]> ele) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;
		}
		
		for(int temp: arr) {
			System.out.print(temp+" ");
		}
	}
}
