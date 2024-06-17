class  MaximumLengthWord{
	
	public static void main(String arg[])
	{
		String s = "Dear Student, you have need to work Sohanmaali";
		
		String words[] = s.split(" ");
		
		StringBuffer sb =new StringBuffer();
		int max = 0;
		int index = 0;
		for(int i =0;i<words.length;i++)
		{
			if(words[i].length()>max)
			{
				max = words[i].length();
				index = i;
			}
		}
		System.out.println(words[index]);
	}
}