package com.qa.oopResults;

public class Results {

//	A person takes 3 exams in college, Physics, Chemistry and Biology, each exam can have a maximum of 150 marks.
//	When all the exam marks have been added together, we can find the overall percentage that the person has got
//	by multiplying their score by 100 and then dividing by 450. Create the results class, this class has 
//	5 variables, Physics, Chemistry and Biology, total and percentage. This class should also have 2 methods: 
//	Method 1 - displays the results that the person got for each exam and then the total mark.  
//	Try to make the output neat and bespoke for each exam. 
//	Method 2 - which finds and displays the percentage that the person received for the exams overall.
//	Expand the Results project, there is now a pass rate of 60% for the overall result; 
//	if the person receives under 60%, they get a fail message.

	private int total;
	private int percent;

	public int marksMethod(int phy, int chem, int bio) {
		total = phy + chem + bio;
		System.out.println("Physics result = " + phy + "/150");
		System.out.println("Chemistry result = " + chem + "/150");
		System.out.println("Biology result = " + bio + "/150");
		System.out.println("Total marks = " + total + "/450");
		return total;

	}

	public int percentageMethod() {
		percent = total * 100 / 450;
		System.out.println("Final result as a percentage = " + percent + "%");
		return percent;

	}

	public void checkPassMethod() {
		if (percent >= 60)
			System.out.println("PASS");
		else
			System.out.println("FAIL");

	}

}
