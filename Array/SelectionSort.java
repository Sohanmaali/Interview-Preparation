public class SelectionSort {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 1, 2, 6, 2 };

        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for (int i : array)
            System.out.print(i + "  ");
    }
}
