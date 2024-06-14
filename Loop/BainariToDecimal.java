class BainariToDecimal {
	public static void main(String[] args) {
		int n = 1101;

		int deci = 0;
		int i = 0;
		while (n > 0) {
			int rem = n % 10;
			deci = deci + rem * (int) Math.pow(2, i);
			i++;
			n /= 10;
		}
		System.out.print(deci + "    ");
	}
}