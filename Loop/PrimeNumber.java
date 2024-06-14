class PrimeNumber
{
	public static void main(String[] args) {

		int num = 3;
		
		if(num<2) {
			System.out.print("Not a prime number");
			return;
		}
		if(num==2|| num==3) {
			System.out.print("prime number");
			return;
		}
		
		for(int i=2;i<num/2; i++)
			if(num%i==0) {
			System.out.print("Not a prime number");
			return;
		}
		System.out.print(" prime number");
	}
}