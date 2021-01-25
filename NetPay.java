/*
* NetPay.java
* Author: Emily Ockerman
* Submission Date: August 27, 2018
*
* Purpose: This program computes your tax deductions and subsequent
* net and gross pay if you enter the number of hours worked when prompted.
*
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
CSCI 1301: Project 1 Page 3
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

import java.util.Scanner;

public class NetPay {
	//defining constant variables
	static final double FEDERAL_TAX_PERCENT = .1;
	static final double STATE_TAX_PERCENT = .045;
	static final double SS_PERCENT = .062;
	static final double MEDICARE_PERCENT = .0145;
	static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[] args) {
		
		//Scanner input to allow for User input to be read and utilized by the program
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hours per Week:\t\t");
		final int hoursWorked = input.nextInt();
		final double grossPay = PAY_PER_HOUR * hoursWorked; 
		final double federal = grossPay * FEDERAL_TAX_PERCENT;
		final double state = grossPay * STATE_TAX_PERCENT;
		final double socialSecurity = grossPay * SS_PERCENT;
		final double medicare = grossPay * MEDICARE_PERCENT;
		final double netPay = grossPay - federal - state - socialSecurity - medicare;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		//tax deductions
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		

	}

}
