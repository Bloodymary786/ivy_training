package basics;

public class Demo2DArray {

	public static void main(String[] args) {

		// i have 2D array i want to check wheter it is identity matrix or not
		int arr[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		print2DArray(arr);

		// check it is identity matrix or not ?
		boolean isIdentity = true;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					if (arr[i][j] != 1) {
						isIdentity = false;
					}
				} else {
					if (arr[i][j] != 0) {
						isIdentity = false;
					}
				}
			}
		}

		if (isIdentity) 
			System.out.println("it is an identity matrix");
		else 
			System.out.println("not a identity matrix");
		

	}

	private static void print2DArray(int[][] arr) {
		for (int temp[] : arr) {
			for (int tempVal : temp) {
				System.out.print(tempVal + " ");
			}
			System.out.println();
		}
	}
}
