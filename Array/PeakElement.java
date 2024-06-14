// input: array[]= {5, 10, 20, 15}
// Output: 20
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

// Input: array[] = {10, 20, 15, 2, 23, 90, 67}
// Output: 20 or 90
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67
public class PeakElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        if (n == 1) {

            System.out.println(arr[0]);
            // System.out.println("1");
        }
        if (arr[0] >= arr[1]) {
            System.out.println(arr[0]);
            // System.out.println("2");
        }
        if (arr[n - 1] >= arr[n - 2]) {
            System.out.println(arr[n - 1]);
            // System.out.println(3);
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                System.out.println(arr[i]);
                // System.out.println(4);
            }
        }
        // return 0;
    }
}