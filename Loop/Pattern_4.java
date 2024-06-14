public class Pattern_4 {
    public static void main(String[] args) {
        int row = 5;
        int x = 1, y = 1;
        for (int i = 1; i <= row << 1; i++) {
            for (int j = 1; j < row + x; j++) {
                if ((i <= row) && (j >= row - i + 1) || (i > row) && (j > y)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            x = i < row ? ++x : --x;
            y = i > row ? ++y : y;
            System.out.println("");
        }
    }

}
