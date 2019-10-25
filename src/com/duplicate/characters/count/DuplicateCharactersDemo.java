package com.duplicate.characters.count;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersDemo 
{
	public static void main(String[] args)
	{
		String s1="the java concept of the day";
		String replaceAll = s1.replaceAll("//s", "").toLowerCase();
		char[] charArray = replaceAll.toCharArray();
		HashMap<Character,Integer>hm=new HashMap<>();
		for(char ch:charArray)
		{
			if(hm.containsKey(ch)) 
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else 
			{
				hm.put(ch, 1);
			}
		}
		Set<Character> keySet = hm.keySet();
		for(Character c:keySet)
		{
			if(hm.get(c)>1)
			{
				System.out.println(c+":"+hm.get(c));
			}
		}
	}

}
