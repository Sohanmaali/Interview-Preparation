class FirstnonRepeatingCharacter
{
	public static void main(String arg[])
	{
		String s = "arfsdfspdfa";
		boolean b[] = new boolean[s.length()];
		for(int i =0;i<s.length();i++)
		{
			if(b[i]) continue;
			
			boolean flag = true;
			for(int j =i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)) {
					flag = false;
					b[j]= true;
				}
			}
			if(flag) 
			{
				System.out.print(s.charAt(i));
				break;
			}
		}
	}
}
