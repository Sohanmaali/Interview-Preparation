class Pattern_2
{
	    // *
	  // ***
        // *****
      // *******
    // *********
	public static void main(String[] args) {

		int x=0;
		for(int i=5 ;i>=1;i--)
		{
			for(int j= 1;j<=5+x;j++)
			{
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			x++;
		}
	}
}