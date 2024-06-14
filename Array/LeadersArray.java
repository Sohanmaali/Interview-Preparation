// An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

class LeadersArray {
	public static void main(String arg[]) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };

		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j])
					break;
			}
			if (j == arr.length)
				System.out.print(arr[i] + "  ");
		}
	}
}