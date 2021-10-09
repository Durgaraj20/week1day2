package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stors";
		String text2 = "potss";
		int len1 = text1.length();
		int len2 = text2.length();
		if (len1 == len2) {
			System.out.println("The length of the texts are same " + len1);
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println("The text is a anagram");
			} else {
				System.out.println("Not a anangram");
			}

		} else {
			System.out.println("The length is not same and not a anagram");
		}
	}

}
