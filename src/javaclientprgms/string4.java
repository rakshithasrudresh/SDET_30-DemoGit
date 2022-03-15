package javaclientprgms;

import java.util.LinkedHashSet;

public class string4 {
public static void main(String[] args) {
	String s="hello";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++){
		set.add(s.charAt(i));
	}

	for(Character ch: set)
	{
		System.out.print(ch+" ");
		}
	}

	}


