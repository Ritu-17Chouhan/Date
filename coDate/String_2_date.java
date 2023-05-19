package in.coDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String_2_date {
public static void main(String[]args) throws ParseException {
	String dob = "17/10/2000";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
sdf.parse(dob);
Date d = sdf.parse(dob);
System.out.println(d);
}
}
