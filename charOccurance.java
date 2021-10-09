package week1.day2;

public class charOccurance {

	public static void main(String[] args) {
		int count = 0;
		String str = "welcome to trichyooo";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'o') {
				count++;
			}

		}
System.out.println("The character "+ charArray[4]+ count);
	}

}
 