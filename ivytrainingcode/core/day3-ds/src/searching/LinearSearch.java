package searching;

public class LinearSearch {

	// i want to return index O(n)
	static int linearSearch(int arr[], int no) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == no) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 7, 5, 77, 8 };

		int index=linearSearch(arr, 7);
		System.out.println(index);
	}
}
