package javaclientprgms;

public class print_prime_numbers_in_array {
public static void main(String[] args) {
	int a[]={2,3,4,5,6,7,8};
	
	for (int k = 0; k < a.length; k++) {
		int n=a[k];
		int i=2;
		while(i<=n)
		{
			if(n%i==0){
				break;
			}
			i++;
		}
		
		if(n==i)
		{
			System.out.println(n+"==>prime");
		}
		else
		{
			System.out.println(n+"==>not a prime");
		}
		
		
	}
}
}
