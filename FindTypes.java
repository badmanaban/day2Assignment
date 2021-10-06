package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++)
		{
			if (Character.isLetter(charArray[i])) 
			{
				letter++;
			} 
			else if (Character.isSpaceChar(charArray[i]))
			{
				space++;
			}
			else if(Character.isDigit(charArray[i]))
			{
				num++;
			}
			else
			{
				specialChar++;
			}
	}
		System.out.println("$$ Welcome to 2nd Class of Automation $$ ");
		System.out.println("Count of letters : " + letter);
		System.out.println("Count of space : " + space);
		System.out.println("Count of numbers : " + num);
		System.out.println("Count of special characters : " + specialChar);
}
}
