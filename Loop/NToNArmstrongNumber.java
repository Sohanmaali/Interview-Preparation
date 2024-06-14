import java.util.Scanner;

class NToNArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 153,370,371

		System.out.println("Enter starting num");
		int num1 = sc.nextInt();

		System.out.println("Enter Ending num");
		int num2 = sc.nextInt();

		for (; num1 < num2; num1++) {
			int temp = num1;
			int c = 0;
			while (temp > 0) {
				c++;
				temp /= 10;
			}
			temp = num1;
			int sum = 0;
			while (temp > 0) {

				int rem = temp % 10;
				int pow = (int) Math.pow(rem, c);
				sum += pow;
				temp /= 10;
			}
			if (sum == num1)
				System.out.print(sum + "    ");
		}
	}
}