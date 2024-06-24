import java.util.*;

class SortString
{
	public static void main(String []arg)
	{
		String s = "i am a java developer fron indore";
		
		char ch[] = s.toCharArray();
		
		for(int i = 0 ;i<ch.length; i++)
		{
			for(int j = 0;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					char temp = ch[i];
					ch[i]= ch[j];
					ch[j]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}