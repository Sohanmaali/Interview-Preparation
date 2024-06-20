import java.util.*;

class UnikeElement
{
	public static void main(String arg [])
	{
		int arr[] = {1,2,3,4,5,1,2,6,2};
		
		withOutCollection(arr);
		System.out.println();
		usingCOllection(arr);
		
	}
	
	public static void withOutCollection(int arr[])
	{
		System.out.println("The unique elements found in the array are:");
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j <arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void usingCOllection(int arr[])
	{
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr) 
			if(map.containsKey(i)) map.put(i,map.get(i)+1);
			else map.put(i,1);
		
		for(int i : map.keySet()) if(map.get(i)==1) System.out.print(i+" ");
	}
}