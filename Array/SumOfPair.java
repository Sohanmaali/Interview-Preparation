class SumOfPair
{
	public static void main(String arg [])
	{
		int arr[] = {6, 8, 4, -5, 7, 9};
		int value = 15;
		for (int i = 0; i<arr.length; i++) {
			
			for(int j= i+1; j<arr.length;j++)
				if(arr[i]+arr[j]==value)
					System.out.println(i+" And  "+j +" index value sum = "+ value );
		}
	}
}