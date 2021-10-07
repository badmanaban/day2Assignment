package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args)
	{
		String test = "I am a software tester";
		String[] spli = test.split(" ");
		for (int i = 0; i < spli.length; i++) 
		{
			if (i%2 == 0) {
				char[] charArray = spli[i].toCharArray();
				for (int j = charArray.length-1; j>=0; j--) 
				{
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(spli[i]+ " ");
			}
			
		}
	}
}
