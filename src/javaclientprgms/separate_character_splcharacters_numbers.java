package javaclientprgms;

public class separate_character_splcharacters_numbers {
public static void main(String[] args) {
	String s="team123#";
	String ch="",num="",sp="";
	for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i)>='A' && s.charAt(i)<='Z')||
				(s.charAt(i)>='a' && s.charAt(i)<='z'))
           {
	         ch=ch+s.charAt(i);
           }
		else if((s.charAt(i)>='0' && s.charAt(i)<='9'))
		{
			num=num+s.charAt(i);
		}
		else
		{
		sp=sp+s.charAt(i);	
		}	
	}
	System.out.println("characters--->"+ch);
	System.out.println("numbers--->"+num);
	System.out.println("special characters--->"+sp);
}
}
