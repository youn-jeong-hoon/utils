package person.younjh.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil2 {
	private static final String DATE_DELIMITER = "-";

	/**
     * 오늘 날짜를 구한다.
     * @param delimiter
     * @return
     * @throws Exception
     */
    public static String getToday(String delimiter) {
    	if(null == delimiter) {
    		delimiter = DATE_DELIMITER;
    	}

    	Calendar today = Calendar.getInstance();
        SimpleDateFormat type = new SimpleDateFormat("yyyy" + delimiter + "MM" + delimiter + "dd");
        return type.format(today.getTime());
    }

    /**
     * 오늘 날짜를 구한다.
     * @return
     */
    public static String getToday() {
    	return getToday(DATE_DELIMITER);
    }

    /**
     * 현재 시간을 구한다.
     * @param delimiter
     * @return
     */
    public static String getCurrentDatetime(String delimiter) {
    	if(null == delimiter) {
    		delimiter = DATE_DELIMITER;
    	}

    	Calendar today = Calendar.getInstance();
        SimpleDateFormat type = new SimpleDateFormat("yyyy" + delimiter + "MM" + delimiter + "dd HH:mm:ss");
        return type.format(today.getTime());
    }

    /**
     * 현재 시간을 구한다.
     * @return
     */
    public static String getCurrentDatetime() {
    	return getCurrentDatetime(DATE_DELIMITER);
    }
}