package javaclientprgms;

public class maximum_minimum_elementfrom_sorted_array {
	public static void main(String[] args) 
	{
		int[] arr1={20,30,50,10,40};
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = i+1; j < arr1.length; j++)
			{
				if (arr1[i]>arr1[j]) 
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;	
				}	
			}
			
		}
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]+" ");
		}
		
		System.out.println("first minimum--->"+arr1[0]);
		System.out.println("first maximum---->"+arr1[arr1.length-1]);
		
		
		System.out.println("first three minimum numbers");
		int sum=0;
		for (int i=0; i<3; i++) 
		{
			sum=sum+arr1[i];
		System.out.println(arr1[i]);
		}
		System.out.println("sum of first 3 min numbers-->"+sum);	
	}
}
