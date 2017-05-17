package source;

public class BinarySearch {

	public static boolean findBinarySearchKey(int key, int[] data) {
		int low = 0;
		int lstIndx = data.length;

		while (low <= lstIndx) {
			int mid = (low + lstIndx) / 2;

			if (data[mid] == key) {

				System.out.println(data[mid]);

				return true;

			}

			if (data[mid] <= key) {
				low = mid + 1;

			}

			if (data[mid] >= key) {
				lstIndx = mid - 1;

			}

		}

		return false;
	}

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6, 8 };

		findBinarySearchKey(7, data);

	}

}
