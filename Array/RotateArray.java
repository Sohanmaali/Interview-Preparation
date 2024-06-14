
public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27 };
		int d = 3;
		swap(arr,0,d-1);
		swap(arr,d,arr.length-1);
		swap(arr,0,arr.length-1);
		for(int i: arr) System.out.print(i+"  ");

	}

	public static void swap(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}