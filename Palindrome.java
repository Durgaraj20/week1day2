package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * Pseudo Code
		 * 
		 * a) Declare A String value as"madam"
		 * 
		 * 
		 * b) Declare another String rev value as "" c) Iterate over the String in
		 * reverse order d) Add the char into rev e) Compare the original String with
		 * the reversed String, if it is same then print palinDrome
		 * 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
		 */
		String str = "malayalam";
		String[] test2 = str.split("\\s");
		StringBuilder sbcmp = new StringBuilder();
		for (String w : test2) {
			StringBuilder sb = new StringBuilder(w);
			sbcmp.append(sb.reverse());

		}
		if (str.equals(sbcmp.toString())) {
			System.out.println("It is a palindrome");

		} else {
			System.out.println("It is not a palindrome");
		}
	}
}
