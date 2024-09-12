import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		This wil print the current date & time in a standard format
		Date d = new Date();
		System.out.println(d.toString());
		
//		If we need current & date in s specific required format, then we need to use SimpleDateFormat class
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/YYYY ss:mm:hh");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
		
	}

}
