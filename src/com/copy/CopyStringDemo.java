package com.copy;

import java.util.Arrays;

public class CopyStringDemo {

	public static void main(String[] args) {
		String s = "venkat is good boy";
		char[] charArray3 = s.toCharArray();
		/*
		 * String[] split = s.split(" "); System.out.println(split.length);
		 */
		
		for(int i=charArray3.length-1;i>=0;i--)
		{
			System.out.print(charArray3[i]);
		}
		/*
		 * String replaceFirst = s.replaceAll("\\s", ""); char[] charArray =
		 * replaceFirst.toCharArray(); int length = charArray.length; char[] charArray2
		 * = new char[length];
		 * 
		 * char[] copyOf = Arrays.copyOf(charArray, length); System.out.println(copyOf);
		 * for (int i=charArray.length-1; i>=0; i--) { charArray2[i] = charArray[i];
		 * System.out.print(charArray2[i]); }
		 */

	}

}
