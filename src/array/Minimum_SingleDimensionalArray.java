package array;

public class Minimum_SingleDimensionalArray {

	public static int findMinimum(int arr[]) {
		int mi = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < mi) {
				mi = arr[i];
			}
		}
		return mi;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 34, 1, 13, 2, 38, 18 };
		int min = findMinimum(a);
		System.out.println("Minimum is --->" + min);
	}

}
