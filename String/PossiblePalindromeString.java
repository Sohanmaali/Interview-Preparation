class PossiblePalindromeString {
	public static void main(String[] args) {
		String s = "naman";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				boolean flag = true;
				String sub = s.substring(i, j);

				int left = 0;
				int right = sub.length() - 1;

				while (left < right) {
					if (sub.charAt(left++) != sub.charAt(right--)) {
						flag = false;
						break;
					}
				}
				if (flag)
					System.out.println(sub);
			}
		}
	}
}
