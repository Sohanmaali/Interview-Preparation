class Maximum
{
	public static void main(String arrrr[]){
		int array[] = {-56666,2,3,4,5,1,2,6,2};
		int max = array[0];
		
		for(int i :array)
		{
			if(i>max)max =i;
		}
		System.out.print("Maximum   = "+max);
	}
}