import java.util.Scanner;
class PrintEvenOdd
{
	public static void main(String[]args)
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Even number");
		for(int i:a)if(i%2==0)System.out.print(i+"  ");
		
		System.out.println("\nOdd number");
		for(int i:a)if(i%2!=0)System.out.print(i+"  ");
		
	}
}