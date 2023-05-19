package in.coDate.copy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_x {
public static void main (String[]args) {
	Date today = new Date();
	SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	cal.setTime(today);
	for (int i = 1; i<=30; i++)
	//cal.add(Calendar.DATE, 30);
	System.out.println(sdf.format(cal.getTime()));
}
}

