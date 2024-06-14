class CheckEmail 
{
	public static void main(String arg[])
	{
		String  email = "exa_mple@example.com";
		boolean atSymbol = false;
		boolean dotSymbol = false;
		int atIndex = -1;
		int dotIndex = -1;

		for (int i = 0; i < email.length(); i++) {
			
			if (email.charAt(i) != '@' && (email.charAt(i)<'a'||email.charAt(i)>'z')) {
				System.out.print("ivalide");
				return ;
			}
			
			if (email.charAt(i) == '@') {
				if (atSymbol) 
				{
					System.out.print("ivalide");
					return ;
				}
				atSymbol = true;
				atIndex = i;
			}
			
			if (email.charAt(i) == '.') {
				dotSymbol = true;
				dotIndex = i;
			}
		}

		if (!atSymbol || atIndex == 0 || atIndex == email.length() - 1) {
			System.out.print("ivalide");
			return ;
		}
		
		if (!dotSymbol || dotIndex <= atIndex + 1 || dotIndex == email.length() - 1) {
			System.out.print("ivalide");
			return ;
		}

		System.out.print("valide");
	}
}