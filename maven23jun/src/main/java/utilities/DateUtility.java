package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getRequiredDateBasedOnNumberOfDays("dd MM yyyy HH:mm:ss", -3));
System.out.println(getRequiredDateBasedOnNumberOfDays("dd MM yyyy" ,-3));
System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMM yyyy", 3));
System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMMM yyyy",3));
System.out.println(getReqiredDateBasedOnNumberOfMonths("dd/MM/yyyy", 4));
System.out.println(getRequiredDateBasedOnYears("dd MMMM yyyy", 5));
compareDate("12/10/2022","15/10/2022");

	}
//No.of days
	public static String getRequiredDateBasedOnNumberOfDays(String format,int numberOfDays)
	{
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,numberOfDays);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getReqiredDateBasedOnNumberOfMonths(String format,int numberOfMonths)
	{
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.MONTH, numberOfMonths);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnYears(String format,int numberOfYears)
	{
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.YEAR, numberOfYears);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static void compareDate(String date1,String date2)
	{
		//if(date1)
	}
}
