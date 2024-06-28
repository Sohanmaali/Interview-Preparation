class WordCharReverse
{
	public static void main(String arg[])
	{
		String s = "Java Is Plateform Independent";
		
		String x = "";
		int start = 0;
		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i) == ' ' || i == s.length()-1)
			{
				int end =(i == s.length() - 1) ? i : i - 1;
				
				while(end>=start)
				{
					x+=s.charAt(end);
					end--;
				}
				if(i!=s.length()-1)
					x+=' ';
				start = i+1;
			}
			
		}
		System.out.println(x);
	}
}