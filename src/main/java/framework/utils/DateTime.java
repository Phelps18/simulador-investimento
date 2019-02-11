package framework.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static String getTimeStampWithoutFormat(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date now = new Date();
		return dateFormat.format(now);
	}
    
    public static String getDateTimeFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HHmmss");
        Date now = new Date();
        return dateFormat.format(now);
    }
}