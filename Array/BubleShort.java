class BubleShort
{
	public static void main(String arrrr[]){
		int array[] = {1,2,3,4,5,1,2,6,2};
		
		for(int i= 0; i<array.length;i++)
		{
			for(int j =0;j<array.length-1; j++ )
			{
				if(array[i]<array[j])
				{
					int temp = array[i];
					array[i]= array[j];
					array[j]=temp;
				}
			}
		}
		for(int i:array)
		{
			System.out.print(i+"  ");
		}
	}
}