class NToNStrongNumber {
	public static void main(String[] args) {
		// 145 is Strong Number
		int num1 = 1;
		int num2 = 500;
		while (num1 < num2) {
			int temp = num1, sum = 0;
			while (temp > 0) {
				int rem = temp % 10;
				int fact = 1;
				for (int i = 1; i <= rem; i++)
					fact *= i;
				sum += fact;
				temp /= 10;
			}
			if (sum == num1)
				System.out.print(sum + "    ");
			num1++;
		}
	}
}