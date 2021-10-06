package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		String str1a = "";
		String str2b = "";
		int length1 = text1.length();
		int length2 = text2.length();
		if (length1 == length2) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			str1a=String.valueOf(charArray1);
			str2b=String.valueOf(charArray2);
				}
		
		if(str1a.equals(str2b)){
			System.out.println("It has same values");
		} else {
			System.out.println("It has diff values");
		}
	}

}
