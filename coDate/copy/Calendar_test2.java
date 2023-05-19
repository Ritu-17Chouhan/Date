package in.coDate.copy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar_test2 {
public static void main(String[]args) throws ParseException {
	String dob = "31/01/2003";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	sdf.parse(dob);
	Date d = sdf.parse(dob);
	System.out.println(d);
	
}
}
