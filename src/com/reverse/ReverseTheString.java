package com.reverse;

public class ReverseTheString 
{

	public static void main(String[] args)
	{

		String s1="venkat";
		char[] charArray = s1.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.println(charArray[i]);
		}
	}

}
