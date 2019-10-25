package com.app.palindrome;

public class PalindromeDemo 
{
	public static void main(String[] args) 
	{
		String s="madam";
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		char[] ch2=new char[length];
		int i=0;
		while(i!=length)
		{
			ch2[length-1-i]=charArray[i];
			++i;
		}
		i=0;
		while(i!=length)
		{
			if(ch2[i]!=charArray[i]) {
				System.out.println("not palindrome");
				System.exit(0);
			}
			else {
				++i;
			}
		}
		System.out.println("palindrome");
	}

}
