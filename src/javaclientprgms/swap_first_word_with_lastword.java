package javaclientprgms;

public class swap_first_word_with_lastword {
	public static void main(String[] args)
	{
		String s="welcome to tyss company";
		String[] str=s.split(" ");
		
		String str1=str[0];   //welcome
		str[0]=str[str.length-1];//company
		str[str.length-1]=str1;//welcome
		
		for (int i = 0; i < str.length; i++)
		{
			System.out.print(str[i]+" ");
		}
		
		
		
	}

}
