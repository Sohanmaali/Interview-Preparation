class InsertElement
{
	public static void main(String arg [])
	{
		
		int n=10;
		int arr[] = new int [100];
		for(int i= 0;i<n; i++) arr[i] = i+1;
		
		int index = 3;
		int value = 500;
		
		for (int i = n; i >=index; i--) {
			if(index==i) {
				arr[index]=value;
				break;
			}
			
			arr[i]= arr[i-1];
		}
		
		for(int i =0; i<=n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
}