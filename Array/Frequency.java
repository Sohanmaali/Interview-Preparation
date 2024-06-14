class Frequency
{
	public static void main(String arrrr[]){
		int array[] = {1,2,3,4,5,1,2,6,2};
		boolean visited[] = new boolean[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			int count  = 1;
			if(visited[i]) continue;
			
			for(int j =i+1; j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					visited[j] = true;
				}
			}
			System.out.println(array[i] +"             "+count);
		}
	}
}