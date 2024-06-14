class SecondMaximum
{
	public static void main(String arrrr[]){
		int array[] = {8,2,3,4,5,1,2,8,2};
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for(int i :array)
		{
			if(i>max)
			{
				smax = max;
				max =i;
			}
			else if( i>smax) smax=i;
		}
		System.out.println("maximum   = "+max);
		System.out.println(" Second maximum   = "+smax);
	}
}