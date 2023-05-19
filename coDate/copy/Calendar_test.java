package in.coDate.copy;

import java.util.Calendar;
import java.util.Date;

public class Calendar_test {
public static void main(String[]args) {
	Date today = new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(today);
	cal.add(Calendar.DATE, 15);
	System.out.println(cal.getTime());
}

}
