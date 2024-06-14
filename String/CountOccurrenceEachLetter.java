class CountOccurrenceEachLetter {
	public static void main(String arg[]) {
		String s = "aabbccddd";
		boolean b[] = new boolean[s.length()];

		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			if (b[i])
				continue;
			c++;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					c++;
					b[j] = true;
				}
			}
			System.out.println(s.charAt(i) + "\t\t" + c);
		}
	}
}