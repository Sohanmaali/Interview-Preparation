public class Pascle {

    public static void main(String[] args) {

        System.out.println("Enter number of Row");
        int row = 5;
        int ans = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }
            ans = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(ans + " ");
                ans = ans * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
