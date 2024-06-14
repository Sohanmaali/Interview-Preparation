class DecimalToBainari {
	public static void main(String[] args) {
		int n = 13;

		int bai = 0;
		int i = 1;
		while (n > 0) {
			int rem = n % 2;
			bai = bai + rem * i;
			i *= 10;
			n /= 2;
		}
		System.out.print(bai + "    ");
	}
}