package javaclientprgms;

public class SortingInDescending 
{
	public static void main(String[] args)
	{
		int[] arr1={20,30,50,10,40};
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = i+1; j < arr1.length; j++) 
			{
				if (arr1[i]<arr1[j])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;	
				}	
			}
	}
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
			
		}
		int sum=0;
		System.out.println("first 3 maximum --->");
		for (int i = 0; i < 3; i++) 
		{
			sum=sum+arr1[i];
			
			System.out.println(arr1[i]);
			}
		System.out.println("sum of first 3 max numbers-->"+sum);
	}

}
