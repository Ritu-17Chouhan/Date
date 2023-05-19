package in.coDate.copy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_1 {
public static void main(String[]args) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date today = new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(today);
	//cal.add(Calendar. DATE, 30);
	
	System.out.println(sdf.format(cal.getTime()));
}


}


