package week1.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		int length= test.length();
		char[] charArray1 = test.toCharArray();
		for(int i=0;i<length ;i++) {
			char c=charArray1[i];
					if(i%2!=0) {
				c=Character.toUpperCase(c);
				System.out.println("The uppercase strings are " + c);
				
			}
					else if(i%2==0) {
						c=charArray1[i];
						System.out.println("The lowercase strings are " +c);
					}
		}
			
			
		
	}

}
