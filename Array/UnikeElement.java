class UnikeElement
{
	public static void main(String arg [])
	{
		int arr[] = {1,2,3,4,5,1,2,6,2};
		
		
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
}