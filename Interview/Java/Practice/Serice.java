class Serice
{
	public static void main(String ar[])
	{
		
		int n = 7; 
	        int value = 1;
		int temp = 1;													
		int i = 1;
		while (i <= n) {

			System.out.print(value + " ");
			if (i == 1||i == 2) {
				temp = 2;
			}  else {
				temp = value;
			}
				value *= temp;
			i++;
		}
	}
}