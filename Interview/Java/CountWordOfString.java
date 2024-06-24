class CountWordOfString{
	
	public static void main(String arg[])
	{
		String s = "This is a sample sentence to count words in Java String without collections or methods Java is this";
		
		String words[] = s.split("\\s+");
		
		int []wordCount = new int[words.length];
		
		boolean b[] = new boolean[words.length];
		
		for(int i = 0;i<words.length;i++)
		{
			if(b[i]) continue;
			
			wordCount[i]++;
			
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					wordCount[i]++;
					b[j] = true;
				}
			}
		}
		
		for(int i =0 ;i<words.length;i++)
		{
			if(!b[i]) System.out.println(words[i]+"\t\t"+wordCount[i]);
		}
	}
}