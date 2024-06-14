class FirstRepetingChar
{
	public static void main(String arg[])
	{
		String s = "adfgha";
		char ch = '\0';
		int index =-1;
		for(int i =0;i<s.length();i++)
		{
			for(int j= i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					ch  = s.charAt(i);
					index = j;
					break;
				}
			}
		}
		if(ch!='\0')
		{
			System.out.print("Char "+ch+" Present at index "+index);
		}
		else
		{
			System.out.print("Not repeting char preset in string");
		}
	}
}