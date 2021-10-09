package week1.day2;

import java.util.Arrays;

public class FindLargestSmallestElement {

	public static void main(String[] args) {
		// array syntax
		// int[] arrayname= {array element};

		int[] numArr = { 100, 49, 398, 34, 1, 267 };
		int length = numArr.length;
		System.out.println("Lenght of the array" + length);
		Arrays.sort(numArr);
		System.out.println("sorted output is");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		System.out.println("smallest number " + numArr[0]);
		System.out.println("second largest number " + numArr[length - 2]);
		System.out.println("second smallest number " + numArr[1]);
		System.out.println("largest numberis " + numArr[5]);
	}

}
