import java.util.Map;
import java.util.HashMap;
class WordCounter {

	public static void main(String[] args) {
		String sentence = "This is a sample sentence to count words in Java without collections or methods Java is this";

		sentence = sentence.toLowerCase();

		String[] words = sentence.split(" ");
		// usingCollection(words);
		withoutCollection(words);
		
	}
	
	public static void withoutCollection(String arr[])
	{
		int[] wordCount = new int[arr.length];
		boolean[] b = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			// if (arr[i].equals(""))
			if (b[i])
				continue;

			wordCount[i]++;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					wordCount[i]++;
					// arr[j] = "";
					b[j] = true;
				}
			}
		}

		System.out.println("Word\t\tCount");
		System.out.println("------------------");
		for (int i = 0; i < arr.length; i++) {
			// if (!arr[i].equals(""))
			if (!b[i])
			System.out.println(arr[i] + "\t\t" + wordCount[i]);

		}
	}
	public static void usingCollection(String arr[])
	{
		Map<String,Integer> map = new HashMap<>();
		
		for(String s:arr )
		{
			if(map.containsKey(s))
			{
				map.put(s,map.get(s)+1);
			}
			else{
				map.put(s,1);
			}
		}
		for(String key : map.keySet())
		{
			System.out.println(key + "\t\t" + map.get(key));
		}
	}

}
