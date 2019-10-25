package com.anagram.check;

import java.util.Arrays;

public class AnagramArrayDemo
{
	public static void main(String[] args) 
	{
		String s1="keep";
		String s2="peek";
		String replaceAll = s1.replaceAll("//s", "").toLowerCase();
		String replaceAll2 = s2.replaceAll("//s", "").toLowerCase();
		char[] charArray = replaceAll.toLowerCase().toCharArray();
		 char[] charArray2 = replaceAll2.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		boolean equals = Arrays.equals(charArray, charArray2);
		if(equals==true)
		{
			System.out.println("two strings are anagram");
		}
		else {
			System.out.println("two strings are not anagram");

		}
	}

}
