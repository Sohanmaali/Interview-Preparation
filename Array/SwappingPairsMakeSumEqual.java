// Swapping pairs make sum equal Input: n = 6, m = 4, a[] = {4, 1, 2, 1, 1, 2}, b[] = (3, 6, 3, 3)
// Output: 1
// Explanation: Sum of elements in a[] = 11, Sum of elements in b[] = 15, To get same sum from both arrays, we can swap following values: 1 from a[] and 3 from b[]

// Input: n = 4, m = 4, a[] = {5, 7, 4, 6}, b[] = {1, 2, 3, 8}
// Output: 1
// Explanation: We can swap 6 from array a[] and 2 from array b[]
import java.util.HashSet;
class SwappingPairsMakeSumEqual
{
	public static void main(String arg[])
	{
		int a[] = {4, 1, 2, 1, 1, 2}, b[] = {3, 6, 3, 3};
		
		int sumA =0;
		int sumB =0;
		
		for(int i: a)sumA+=i;

		for(int i: b)sumB+=i;
		
		int rem = sumB-sumA;
		
		if(rem%2 !=0) {
			System.out.println("-1");
			return;
		}
		rem/=2;
		
		HashSet<Integer> setA = new HashSet<>();
		
		for(int i : a) setA.add(i);
		
		for(int i :b)
		{
			if(setA.contains(i-rem))
			{
				System.out.println("1");
				return;
			}
		}
		System.out.println("-1");
	}
}