package javaclientprgms;

public class findmaxLengthElement 
{
	public static void main(String[] args) 
	{
		String[] strarr={"hello","all","welcome","pythons","to","india","welcome"};
		
		String maxElement=strarr[0];
		
		for (int i = 0; i < strarr.length; i++) 
		{
			if(maxElement.length()<strarr[i].length())
			{
				maxElement=strarr[i];
			
		}
		}
		
		for (int i = 0; i < strarr.length; i++)
			{
				if (maxElement.length()==strarr[i].length()) 
				{
					System.out.println(strarr[i]);
					
				}
				
			}
		}
		
		
	}


