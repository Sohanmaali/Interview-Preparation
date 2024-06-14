class WordCounter {

	public static void main(String[] args) {
		String sentence = "This is a sample sentence to count words in Java without collections or methods Java is this";

		sentence = sentence.toLowerCase();

		String[] words = sentence.split(" ");

		int[] wordCount = new int[words.length];
		boolean[] b = new boolean[words.length];
		for (int i = 0; i < words.length; i++) {
			// if (words[i].equals(""))
			if (b[i])
				continue;

			wordCount[i]++;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					wordCount[i]++;
					// words[j] = "";
					b[j] = true;
				}
			}
		}

		System.out.println("Word\t\tCount");
		System.out.println("------------------");
		for (int i = 0; i < words.length; i++) {
			// if (!words[i].equals(""))
			if (!b[i])
			System.out.println(words[i] + "\t\t" + wordCount[i]);

		}
	}

}
