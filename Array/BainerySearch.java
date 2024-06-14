class BainerySearch{
	public static void main(String arrrr[]){
		int array[] = {8,2,3,4,5,1,2,6,2};
		int element = 15;
		insertionSort(array);
		
		int start = 0;
		int last = array.length-1;
		int middel = 0;
		
		while(start<=last)
		{
			middel =(start+last)/2;
			if(array[middel]==element) {
				System.out.print("Element is present");
				return;
			}
			if(array[middel]>element)
			{
				last = middel-1;
			}
			else{
				start = middel+1;
			}
		}
		System.out.print("Element is Not present");
	}
	public static void insertionSort(int array[])
	{
		for(int i=1;i<array.length;i++)
		{
			int temp = array[i];
			int j = i-1;
			while(j>=0&&array[j]>temp)
			{
				
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
	}
}