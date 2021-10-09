package week1.day2;

import java.util.Arrays;

public class LearnStringInitialization {

	public static void main(String[] args) {
int numArr[] = {58,45,12,1,3,6,9,62,458,459,75};
int length = numArr.length;
System.out.println("The lenght of the array is "+length);
Arrays.sort(numArr);
System.out.println("The last element of the array is "+numArr[10]);
for(int i=0;i<length;i++) {
	System.out.println("The array is "+numArr[i]);
}

	}

}
