class FirstRepeatingElement
{
	public static void main(String arg[])
	{
		int arr[] = {1, 5, 3, 4, 3, 5, 6};
		
		boolean b= new boolean[arr.length];
		int c =-1;
		for(int i =0; i<arr.length;i++)
		{
			if(b[i]) continue;
			c= 0;
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
					b[j]= true;
				}
			}
		}
	}
}
