// Write a program to print the next greatest elements in a given unsorted array. Elements for which no superior element exists, consider the next greatest element as -1.
// Expected Output :
// The given array is : 5 3 10 9 6 13
// Next Bigger Elements are:
// Next bigger element of 5 in the array is: 10
// Next bigger element of 3 in the array is: 10
// Next bigger element of 10 in the array is: 13
// Next bigger element of 9 in the array is: 13
// Next bigger element of 6 in the array is: 13
// Next bigger element of 13 in the array is: -1
// Next Bigger Elements Array:
// 10 10 13 13 13 -1

class NextGreatestElements{
	public static void main(String arg[])
	{
		int a []= {5, 3, 10, 9, 6, 13,};
		
		for(int i=0;i<a.length;i++)
		{
			int temp =0;
			boolean flag = false;
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[j];
					flag = true;
					break;
				}
			}
			if(flag)
			{
				System.out.print(temp+"  ");
			}else
				System.out.print(-1+"  ");
		}
	}
}