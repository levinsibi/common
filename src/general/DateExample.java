package general;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		/*
		 * Date d=new Date(); System.out.println(d); SimpleDateFormat sdf=new
		 * SimpleDateFormat("dd-MM-yyyy"); String s =sdf.format(d);
		 * System.out.println(s);
		 * 
		 * Calendar cal=new GregorianCalendar(); System.out.println(cal.getTime());
		 * cal.add(Calendar.DAY_OF_WEEK, -2);
		 * System.out.println(sdf.format(cal.getTime()));
		 */
		
		
		
		SimpleDateFormat f1=new SimpleDateFormat("dd-MM-yyyy");
		Date d=f1.parse("15-12-2019");
		SimpleDateFormat f2=new SimpleDateFormat("dd-MMM-yyyy");
		String s =f2.format(d);
		System.out.println(s);
		
	}

}
