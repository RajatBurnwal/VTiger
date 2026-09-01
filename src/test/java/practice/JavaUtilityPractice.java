package practice;

import genericUtility.JavaUtility;

public class JavaUtilityPractice {

	public static void main(String[] args) {

		JavaUtility jutil = new JavaUtility();
		String dateTimeStamp = jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		System.out.println(dateTimeStamp);
		String dateStamp = jutil.getCalendarDetails("dd/MM/YYYY");
		// MM/dd/YY ----> dd-MM-YYYY hh-mm-ss
		System.out.println(dateStamp);
		int number = jutil.generateRandomNumber(10);
		System.out.println(number);
		int num2 = jutil.generateRandomNumber(20000);
		System.out.println(num2);
	}

}
