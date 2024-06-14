class PascleTrangale
{
		 // 1
	       // 1  1
	      // 1 2 1
            // 1 3 3 1
          // 1 4 6 4 1
	public static void main(String[] args) {

		int ans;
		int row=5;
		for (int i = 0; i < row; i++) {
			ans = 1;
			for (int j = 0; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(ans + " ");
				ans = ans * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}