import java.util.Arrays;
class FirstNagative
{
	public static void main(String arg[])
	{
		int arr[] = {1, -2, 3, -4, 5, -6, 7, -8, 9};
		int j = 0;
		
		for (int i = 0; i < arr.length; i++) {
            
			if (arr[i] < 0) {
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                j++;
            }
        }
		System.out.print(Arrays.toString(arr));
	}
}