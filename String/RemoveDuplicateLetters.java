class RemoveDuplicateLetters {
	public static void main(String arg[]) {
		String s = "aabbccddd";
		boolean b[] = new boolean[s.length()];
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < s.length(); i++) {
			if (b[i])
				continue;

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					b[j] = true;
				}
			}
			sb.append(s.charAt(i));
		}
		System.out.print(sb);
	}
}
