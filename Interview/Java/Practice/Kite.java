class Kite{
	
	public static void main(String arg[]){
		int  row = 5;
		int x= row;
		int 		y=1;
		for(int i= 1;i<row<<1;i++){
			for(int j=1;j<=x;j++){
				
				if((i<=row && j>=row-i+1)||(i>row&& j>y))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			y=i>row?++y:y;
			x=i<row?++x:--x;
			System.out.println(" ");
		}
		y=1;
		for(int i= 1;i<row;i++)
		{
			for(int j=1;j<=row+y;j++){
				
				if(j==row-i||j==row||j==row+y){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			y++;
			System.out.println("  ");
		}
	}
}