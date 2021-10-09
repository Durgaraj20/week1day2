package week1.day2;

public class TwoSumProblem {

	public static void main(String[] args) {
			
int num[]= {2,3,5,9,11,6};
int target = 8;
for(int i=0;i<=num.length;i++) {
	for(int j=i+1; j<num.length;j++){
		if ((num[i]+num[j])==target) {
			System.out.println(num[i]++);
			System.out.println(num[j]++);
			
		}
	}
}
	}

}
