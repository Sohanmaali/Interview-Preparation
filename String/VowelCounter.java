public class VowelCounter {
	public static void main(String[] args) {
		String str = "Hello World!";
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Number of vowels: " + count);
	}  
}