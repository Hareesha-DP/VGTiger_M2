package practice;

import genericUtility.JavaUtility;

public class CalendarAndRandomNumPrctice {
	public static void main(String[] args) {
	 
	JavaUtility jUtility = new JavaUtility();
	String date =jUtility.getCalendarDetails("dd-MM-YYYY");
	System.out.println(date);
	String time = jUtility.getCalendarDetails("hh-mm-ss");
	System.out.println(time);
	
	int randomNumber = jUtility.generateRandomNumber(10000);
	System.out.println(randomNumber);
		
		
	}

}
