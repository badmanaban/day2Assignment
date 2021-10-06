package week1.day2;

import java.util.function.BiConsumer;

public class Calculator {

	int num1 = 5;
	int num2 = 6;
	int num3 = 1;
	int x;
	double number1 = 5.5;
	double number2 = 2;
	float numbe1 = 5.5f;
	float numbe2 = 5.5f;

	public void sum() {
		x = num1 + num2 + num3;
		System.out.println("The sum of three number : " + x);
	}

	public void sub() {
		x = num1 - num2;
		System.out.println("The subtraction of two numbers : " + x);
	}

	public void mul() {
		double x = number1 * number2;
		System.out.println("The multiply of two numbers : " + x);
	}

	public void div() {
		float x = numbe1 / numbe2;
		System.out.println("The division of two numbers : " + x);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.sum();
		obj.sub();
		obj.mul();
		obj.div();
	}

}
