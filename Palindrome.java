package week1.day2;

import java.io.CharArrayReader;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if (rev.equals(str))
		{
			System.out.println("palindrome");
		} else 
		{
			System.out.println("Not a palindrome");
		}
	}
}