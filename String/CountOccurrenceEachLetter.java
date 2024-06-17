import java.util.Map;
import java.util.HashMap;
class CountOccurrenceEachLetter {
	public static void main(String arg[]) {
		String s = "aabbccddd";
		// usingCollection(s.toCharArray());
		withoutCollection(s.toCharArray());
		
	}
	public static void withoutCollection(char arr[])
	{
		boolean b[] = new boolean[arr.length];
// int c = 0;
		for (int i = 0; i < arr.length; i++) {
			int c = 0;
			if (b[i])
				continue;
			c++;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					c++;
					b[j] = true;
				}
			}
			System.out.println(arr[i] + "\t\t" + c);
		}
	}
	public static void usingCollection(char arr[])
	{
		Map<Character,Integer> map = new HashMap<>();
		
		for(char s:arr )
		{
			if(map.containsKey(s))
			{
				map.put(s,map.get(s)+1);
			}
			else{
				map.put(s,1);
			}
		}
		for(char key : map.keySet())
		{
			System.out.println(key + "\t\t" + map.get(key));
		}
	}
}