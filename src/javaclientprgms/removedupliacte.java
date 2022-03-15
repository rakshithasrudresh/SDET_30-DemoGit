package javaclientprgms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removedupliacte {
	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] str=s.split(" ");
		//step1:store each word of string in set
		
LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}	
	
		//step 2:compare each word of set with all words
		for(String word:set)
		{
			System.out.print(word+" ");
	}

	}

}
