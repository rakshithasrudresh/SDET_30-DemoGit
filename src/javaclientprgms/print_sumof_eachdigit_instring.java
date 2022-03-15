package javaclientprgms;

public class print_sumof_eachdigit_instring {
public static void main(String[] args) {
	String s="a1b2c3";
	int sum=0;//1,3,6
	for(int i=0;i<s.length();i++)
	{
		//0<6,2<6,3<6,4<6,5<6,6<6
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			//51>=48 and 51<=57
		int n=s.charAt(i)-48; //49-48=1
		sum=sum+n;//0+1,1+2,3+3
		}
	}
	System.out.println(sum);
}
}
