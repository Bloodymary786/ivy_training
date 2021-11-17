package sorting;

public class BubbleSortString {

	public static void main(String[] args) {
		String arr[]= {"ram","seeta","raman","kapil"};
		//kapil ram raman seeta 
		bubbleSort(arr);
		
		System.out.println("----------printing the result-------");
		printArray(arr);
	}

	private static void printArray(String[] arr) {
		for(String val: arr) {
			System.out.print(val+" ");
		}
	}

	private static void bubbleSort(String[] arr) {
		int n=arr.length;
		String temp;
		boolean swapped=false;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				//POC
				if(arr[j].compareTo(arr[j+1])>0) {
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
