import java.util.Scanner;

class RemoveDuplicate {

	public static void main(String arg[]) {
		int size = 10;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elemet");
		int ar[] = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println("array elemet");
		for (int i : ar) {
			System.out.print(i + "  ");
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (ar[i] == ar[j]) {
					for (int k = j; k < size - 1; k++) {
						ar[k] = ar[k + 1];
					}
					size--;
					j--;
				}
			}

		}

		System.out.println("remove duplicate array elemet");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
	}

}
