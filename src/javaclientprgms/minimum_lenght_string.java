package javaclientprgms;

public class minimum_lenght_string {
	public static void main(String[] args) 
	{
		String[] strarr={"hello","all","welcome","abcdefgh",
				"zbcdefgh","to","india","we"};
		
		String minElement=strarr[0];
		
		for (int i = 0; i < strarr.length; i++) 
		{
			if(minElement.length()>strarr[i].length())
			{
				minElement=strarr[i];
			
		}
		}
		
		for (int i = 0; i < strarr.length; i++)
			{
				if (minElement.length()==strarr[i].length()) 
				{
					System.out.println(strarr[i]);
					
				}
				
			}
		}
		
		

}
