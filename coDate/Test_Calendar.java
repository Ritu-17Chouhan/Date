package in.coDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test_Calendar {
public static void main(String[]args) {
	Date today = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	cal.setTime(today);
	//cal.add(Calendar.DATE,30 );
	for (int i = 1; i<=12;i++) {
		cal.add(Calendar.DATE, 30);
		System.out.println(sdf.format(cal.getTime()));
	}
}
}
