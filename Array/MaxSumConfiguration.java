// Input: n = 4, a[] = {8, 3, 1, 2}
// Output: 29
// Explanation: All the configurations possible by rotating the elements are:
// 3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
// 1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
// 2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
// 8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11, so the maximum sum will be 29.

class MaxSumConfiguration
{
	public static void main(String arg[])
	{
		int  a[] = {8, 3, 1, 2};
		
		long tempsum = 0;    
		long sum = 0;    
		long ans = 0;    
        
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			tempsum += a[i] * i;
		}
        
		ans = tempsum;
        
		for (int i = 1; i < a.length; i++) {  
			tempsum = tempsum - sum + (a[i - 1] * a.length);
			ans = Math.max(tempsum, ans);
		}
        
		System.out.println("Sum =    "+ans);
	}
}