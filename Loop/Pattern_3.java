class Pattern_3
{
    // *********
      // *******
        // *****
	  // ***
	    // *
	public static void main(String[] args) {

		int x=4;
		for(int i=1;i<=5;i++)
		{
			for(int j= 1;j<=5+x;j++)
			{
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			x--;
		}
	}
}