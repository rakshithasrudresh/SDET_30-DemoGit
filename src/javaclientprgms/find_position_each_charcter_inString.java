package javaclientprgms;


import java.util.LinkedHashSet;

public class find_position_each_charcter_inString
{
	public static void main(String[] args) 
	{
		String s="Tester";
		s=s.toLowerCase();

		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}

		for(Character ch: set)// t e s r
		{
			for(int i=0;i<s.length();i++)//lenght=6
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
			}		

		}
		}
}
