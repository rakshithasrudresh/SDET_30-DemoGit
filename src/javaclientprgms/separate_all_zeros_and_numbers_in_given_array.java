package javaclientprgms;

public class separate_all_zeros_and_numbers_in_given_array {

	public static void main(String[] args)
	{
		int a[]={3,0,1,0,0,2,0};
		int b[]=new int[a.length];
		int m=0;
		int n=b.length-1;
		
		for (int i = 0; i < b.length; i++) 
		{
			if (a[i]==0)
			{
				b[n]=a[i];
				n--;
			}
			else
			{
				b[m]=a[i];
				m++;
			}
			
		}
	
	
		for (int i= 0; i < b.length; i++) 
		{
		System.out.print(b[i]+" ");
		}
		
	}
}
