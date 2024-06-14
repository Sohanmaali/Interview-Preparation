class DeleteElement
{
	public static void main(String arg [])
	{
		
		int n=10;
		int arr[] = new int [100];
		for(int i= 0;i<n; i++) arr[i] = i+1;
		
		int index = 3;
		
		for (int i = index; i<n; i++) {
			
			arr[i]= arr[i+1];
		}
		
		for(int i =0; i<n-1;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
}