package com.words.count;

import java.util.HashMap;
import java.util.Set;

public class WordsCountDemo 
{

	public static void main(String[] args) 
	{
		String s1="the java concept of the day";
		String[] split = s1.toLowerCase().split(" ");
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		for(String sw:split)
		{
			if(hm.containsKey(sw))
			{
				hm.put(sw, hm.get(sw)+1);
			}
			else 
			{
				hm.put(sw,1);
			}
		}
		Set<String> keySet = hm.keySet();
		int size = keySet.size();
		System.out.println(size);
		for(String ssw:keySet)
			
		{
			if(hm.get(ssw) != null) 
			{
				
			System.out.println();
			}
		}
	 

	}

}
