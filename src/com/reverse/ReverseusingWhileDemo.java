package com.reverse;

public class ReverseusingWhileDemo 
{

	public static void main(String[] args)
	{
		String s="balaji";
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		char[] charArray2=new char[length];
		int i=0;
		while(i!=length)
		{
			charArray2[length-1-i]=charArray[i];
			i++;
		}
		System.out.println(charArray);
		System.out.println(charArray2);
	}

}
