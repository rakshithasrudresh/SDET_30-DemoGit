package javaclientprgms;

public class count_of_vowels 
{
public static void main(String[] args) 
{
	String s[]={"apple","banana"};
	for (int j = 0; j < s.length; j++) 
	{
		int count=0;
		String s2=s[j];
		for (int i = 0; i < s2.length(); i++)
		{
			if((s2.charAt(i)=='a'||
					s2.charAt(i)=='e'||
					s2.charAt(i)=='i'||
					s2.charAt(i)=='o'||
					s2.charAt(i)=='u'))
			{
			count++;	
			}
		}
	System.out.println("number of vowels in:"+" "+s[j]+" is:"+" "+count);
		
	}
	
	
}
}
