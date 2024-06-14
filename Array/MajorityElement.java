// Write a program to find the majority element of an array.
// A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
// Expected Output :
// The given array is : 4 8 4 6 7 4 4 8
// There are no Majority Elements in the given array.

class MajorityElement
{
	public static void main(String a[])
	{
		int arr[] = {4, 8, 4, 6, 7, 4, 4, 8,4};
		
		int candidate = 0;
		int c= 0;
		for(int i=0;i<arr.length;i++)
		{
			if(c==0)
			{
				candidate = arr[i];
			}
			c+= arr[i]==candidate?1:-1;
		}
		c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==candidate) c++;
		}
		
		if(c>arr.length/2)
			System.out.println("Majority element = "+ candidate);
		else
			System.out.println(" not any Majority element ");
	}
}