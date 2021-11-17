package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {25,47,3,19,8,18};
		
		bubbleSort(arr);
		
		System.out.println("----------printing the result-------");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for(int val: arr) {
			System.out.print(val+" ");
		}
	}

	private static void bubbleSort(int[] arr) {
		int n=arr.length;
		int temp;
		boolean swapped=false;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)
				break;
		}
	}
}
