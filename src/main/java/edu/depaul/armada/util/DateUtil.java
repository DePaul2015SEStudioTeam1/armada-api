/**
 * 
 */
package edu.depaul.armada.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility that can be used to format dates
 * 
 * @author ptrzyna
 */
public class DateUtil {
	
	/**
	 * Formats dates to ISO-8601 format
	 * 
	 * @param date	date we want to format
	 * @return String representing ISO-8601 formatted date
	 */
	public static String toJson(Date date) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");
		return formatter.format(date);
	}

}
