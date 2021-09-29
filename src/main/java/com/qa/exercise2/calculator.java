package com.qa.exercise2;

public class calculator {

	public static void main(String[] args) {
		addMethod(3, 5);
		subtractMethod(10, 8);
		multiplicationMethod(5, 5);
		divisionMethod(200, 10);

	}

	public static int addMethod(int int1, int int2) {
		int result = int1 + int2;
		System.out.println(result);
		return result;

	}

	public static int subtractMethod(int int1, int int2) {
		int result = int1 - int2;
		System.out.println(result);
		return result;

	}

	public static int multiplicationMethod(int mul1, int mul2) {
		int result = mul1 * mul2;
		System.out.println(result);
		return result;

	}

	public static int divisionMethod(int div1, int div2) {
		int result = div1 / div2;
		System.out.println(result);
		return result;

	}

}
