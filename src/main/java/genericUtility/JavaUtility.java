package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


/**
 * This is a Utility Class which Stores the functionality from java Utility
 * @author Hareesha D P
 * @version 26-02-09
 */
public class JavaUtility {
	/**
	 * THis is general method to fetch calendar details
	 * @param pattern
	 * @return
	 */

	public String getCalendarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d =cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
		
	}
	
	/**
	 * This is general method to create random number
	 * @param bound
	 * @return
	 */
	
	public int generateRandomNumber(int bound) {
		Random r = new Random();
		int num = r.nextInt(bound);
		return num;
		
	}
}
