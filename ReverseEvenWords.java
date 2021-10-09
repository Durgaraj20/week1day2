package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		StringBuilder sbresult = new StringBuilder();
		String[] test1 = test.split(" ");
		for (int i = 1; i < test1.length + 1; i++) {
			if (i % 2 == 0) {
				String[] test2 = test1[i - 1].split("\\s");
				for (String w : test2) {
					StringBuilder sb = new StringBuilder(w);
					sbresult.append(sb.reverse() + " ");
				}
			} else {
				sbresult.append(test1[i - 1] + " ");
			}

		}
		System.out.println(sbresult.toString());

	}
}