package com.qa.exercise3;

public class Runner {

	public static void main(String[] args) {
		CheckString1 cs1 = new CheckString1();
		System.out.println(cs1.match1("match"));
		CheckString2 cs2 = new CheckString2();
		System.out.println(cs2.match2("different", "same"));
	}

}
