package javaclientprgms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TY1 {
public static void main(String[] args) {
String s="hello";


LinkedHashSet<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++){
	set.add(s.charAt(i));
}

for(Character ch: set)
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(ch==s.charAt(i))
		{
			count++;
		}
	}
	
	
	System.out.println(ch+" "+count);

}
}
}
