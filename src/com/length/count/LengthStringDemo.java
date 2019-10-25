package com.length.count;

public class LengthStringDemo 
{

	public static void main(String[] args)
	{
		String x="venkat reddy";
		String concat = x.concat("\0");
		char[] charArray = concat.toCharArray();
		System.out.println(charArray.length);
		
	}

}
