package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
int count = 0;
String str ="Welcome to chennai";
char[] charArray = str.toCharArray();
for (int i = 0; i < charArray.length; i++) {
	if (charArray[i] == 'e') {
		count++;
		
	}
	
}
System.out.println(count);
	}

}
