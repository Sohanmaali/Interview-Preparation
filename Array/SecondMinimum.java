class SecondMinimum
{
	public static void main(String arrrr[]){
		int array[] = {8,2,3,4,5,-551,2,-6,2};
		int min = array[0];
		int smin = array[0];
		
		for(int i :array)
		{
			if(i<min)
			{
				smin = min;
				min =i;
			}
			else if(smin>min && i<smin) smin=i;
		}
		System.out.println("minimum   = "+min);
		System.out.println(" Second minimum   = "+smin);
	}
}