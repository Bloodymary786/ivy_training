package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		//25	 47	  3	  19	 8	 18
		int a[]= {25,47,3,19,8,18};
		
		int min;
		int temp;
		for(int i=0;i<a.length; i++)
		{
			min=i;
			for(int j=i+1;j<a.length; j++) 
			{
				if(a[j]<a[min]) 
					min=j;
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int val: a) {
			System.out.print(val+" ");
		}

		
//		int min;
//		int temp;
//		for(int i=0;i<arr.length; i++) {
//			min=i;
//			for(int j=i+1;j<arr.length; j++) {
//				if(arr[j]<arr[min]) {
//					min=j;
//				}
//				
//				temp=arr[i];
//				arr[i]=arr[min];
//				arr[min]=temp;
//			
//			}
//		}
//		
//		for(int val: arr) {
//			System.out.print(val + " ");
//		}
		
	}
}
