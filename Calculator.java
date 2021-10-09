package week1.day2;

public class Calculator {
	public void add() {
		int num1 = 10, num2 = 20, num3 = 30;
		int add = num1 + num2 + num3;
		System.out.println("The sum is " + add);
	}

	public void sub() {
		int num1 = 51;
		int num2 = 48;
		int sub = num1 - num2;
		System.out.println("The difference is " + sub);
	}

	public void mul() {
		double num1 = 2000;
		double num2 = 3000;
		double mul = num1 * num2;
		System.out.println("The product is " + mul);

	}

	public void div() {
		float num1 = 300;
		float num2 = 16;
		float div = num1 / num2;
		System.out.println("The value is " + div);
	}

	public static void main(String[] args) {

		Calculator myCal = new Calculator();
		myCal.add();
		myCal.sub();
		myCal.mul();
		myCal.div();

	}

}
