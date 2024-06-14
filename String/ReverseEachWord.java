class ReverseEachWord {
	public static void main(String[] args) {
		String s1 = "Java Is Plateform Independent";
		String s2[] = s1.split(" ");
		StringBuffer s4 = new StringBuffer();
		for (int i = 0; i < s2.length; i++) {

			String s3 = s2[i];
			for (int j = s3.length() - 1; j >= 0; j--) {
				s4.append(s3.charAt(j));
			}
			s4.append(" ");
		}
		System.out.println(s4);
	}

}