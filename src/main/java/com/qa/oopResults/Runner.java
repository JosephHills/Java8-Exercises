package com.qa.oopResults;

public class Runner {

//	A person takes 3 exams in college, Physics, Chemistry and Biology, each exam can have a maximum of 150 marks.
//	When all the exam marks have been added together, we can find the overall percentage that the person has got
//	by multiplying their score by 100 and then dividing by 450. Create the results class, this class has 
//	5 variables, Physics, Chemistry and Biology, total and percentage. This class should also have 2 methods: 
//	Method 1 - displays the results that the person got for each exam and then the total mark.  
//	Try to make the output neat and bespoke for each exam. 
//	Method 2 - which finds and displays the percentage that the person received for the exams overall.

	public static void main(String[] args) {
		
//		Exercise1 testClass = new Exercise1();
//		testClass.method(); // NON STATIC CALL
//		Exercise1.method(); // STATIC CALL

//		Results.marksMethod(45, 55, 120);
//		Results.percentageMethod();
//		Results.checkPass();
		
		Results obj = new Results();
		obj.marksMethod(75, 100, 25);
		obj.percentageMethod();
		obj.checkPassMethod();
		
		
		
		
	}


}
