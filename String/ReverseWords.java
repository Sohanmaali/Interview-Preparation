class ReverseWords
{
	public static void main(String arg[])
	{
		String input = "Hello World This Is Java";
		
		System.out.println(withOutMethod(input));
		System.out.println(usingMethod(input));
	}
	public static String withOutMethod(String input)
	{
		int length = input.length();
		String result = "";
		
		for(int i = length-1; i>=0; i--)
		{
			if(input.charAt(i)== ' ' || i == 0)
			{
				int start = (i==0) ? i : i+1;
				int end = length;
				
				for(int j = start; j<end; j++)
				{
					result += input.charAt(j);
				}
				
				if(i!=0) result += " ";
				length = i;
			}
		}
		return result;
	}
	
	public static String usingMethod(String input)
	{
		String result = "";
		String[]a = input.split("\\s+");
		
		for(int i = a.length-1; i>=0;i--)
		{
			result += a[i];
			if(i!=0) result+= " ";
		}
		return result;
	}
	public static String usingCollection(String input)
	{
		String result = "";
		String[]a = input.split("\\s+");
		
		for(int i = a.length-1; i>=0;i--)
		{
			result += a[i];
			if(i!=0) result+= " ";
		}
		return result;
	}
}