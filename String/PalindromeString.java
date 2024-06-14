class PalindromeString
{
	public static void main(String arg[])
	{
		String s= "aaabbaaa";
		
		for(int i =0; i<s.length()/2+1;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				System.out.print("String is not palindrome");
				return;
			}
		}
			System.out.print("String is  palindrome");
		
	}
}