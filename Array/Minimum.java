class Minimum
{
	public static void main(String arrrr[]){
		int array[] = {0,2,3,4,5,1,2,6,2,-52};
		int min = array[0];
		
		for(int i :array)
		{
			if(i<min)min =i;
		}
		System.out.print("minimum   = "+min);
	}
}