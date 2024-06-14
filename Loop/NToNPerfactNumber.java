public class NToNPerfactNumber {
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 500;
		// 6, 28, 496
		while (num1 < num2) {

			int sum = 0;
			for (int i = 1; i < num1; i++) {
				if (num1 % i == 0)
					sum += i;
			}
			if (sum == num1)
				System.out.print(num1 + "    ");
			num1++;
		}
	}
}