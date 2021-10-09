package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		int strlength = test.length();
		System.out.println("Length of string is " + strlength);
		System.out.println("The char is " + test.charAt(5));
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = test.charAt(i);
			if (Character.isLetter(ch)) { // Character.isLetter
				letter++;
			} else if (Character.isDigit(ch)) { // Character.isDigit
				num++;
			} else if (Character.isSpaceChar(ch)) { // Character.isSpaceChar
				space++;
			} else { // else -> consider as special character
				specialChar++;
			}
			System.out.println("The CharArray: " + charArray[i]);

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
