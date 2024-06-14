class MergeToArray
{
	public static void main(String arg [])
	{
		int arr[] = {1,2,3,4,5};
		int arr1[] = {1,2,3,4,5};
		int arr2 [] = new int[arr.length+arr1.length];
		
		for(int i=arr.length-1,j=0; i>=0;i--,j++)
		{
			arr2[j] = arr[i];
			j++;
			arr2[j] = arr1[i];
		}
		for(int i: arr2)System.out.print (i+" ");
	}
}