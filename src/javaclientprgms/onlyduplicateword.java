package javaclientprgms;

import java.util.HashSet;

public class onlyduplicateword {
	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] str=s.split(" ");
		//step1:store each word of string in set
		
		HashSet<String> set=new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}	
	
		//step 2:compare each word of set with all words
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					//step 3
					count++;
				}
			}
			//step 4:print both word n count
			if(count>=2){
			System.out.println(word+" "+count);
			}
		}
			
		
			}
	}


