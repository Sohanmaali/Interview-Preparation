class InsertionSort {
	public static void main(String arrrr[]) {
		int array[] = { 8, 2, 3, 4, 5, 1, 2, 6, 2 };

		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}

		for (int i : array) {
			System.out.print(i + "  ");
		}
	}
}