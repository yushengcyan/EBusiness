package com.EBusiness.util;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;

import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

        

public final class DateUtil {
    private static final Logger LOG = LoggerFactory.getLogger(DateUtil.class);
    public static final String ORACLE_DATETIME_FORMAT = "yyyy-MM-dd HH24:mm:ss";
    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME_FORMAT2 = "yyyyMMdd HH:mm:ss";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String YYYYMMDD = "yyyyMMdd";
    public static final String YYYYMM = "yyyyMM";
    public static final String YYYYMMDDHHMM = "yyyyMMddHHmm";
    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String yyyyMMddHHmmssSSS = "yyyyMMddHHmmssSSS";

    private DateUtil() {
    }

    public static long getCurrentTimeMillis() {
        Timestamp time = getSysDate();
        return time.getTime();
    }

    public static String getCurrentTime() throws Exception {
        return getDateString("yyyy-MM-dd HH:mm:ss");
    }

    public static Timestamp getSysDate() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static String getDateString(String pattern) throws Exception {
        if (StringUtils.isEmpty(pattern)) {
            throw new Exception("请指定日期格式");
        } else {
            Timestamp time = getSysDate();
            DateFormat dfmt = new SimpleDateFormat(pattern);
            return dfmt.format(time);
        }
    }

    public static String getDateString(Timestamp time, String pattern) throws Exception {
        if (time == null) {
            throw new Exception("请指定时间");
        } else if (StringUtils.isEmpty(pattern)) {
            throw new Exception("请指定格式");
        } else {
            DateFormat dfmt = new SimpleDateFormat(pattern);
            return time != null ? dfmt.format(time) : "";
        }
    }

    public static String getDateString(Date date, String pattern) throws Exception {
        if (date == null) {
            throw new Exception("请指定时间");
        } else if (StringUtils.isEmpty(pattern)) {
            throw new Exception("请指定格式");
        } else {
            SimpleDateFormat sdfmt = new SimpleDateFormat(pattern);
            return date != null ? sdfmt.format(date) : "";
        }
    }

    public static boolean isValidDate(String str, String fomat) throws Exception {
        if (StringUtils.isEmpty(str)) {
            throw new Exception("请指定时间字符");
        } else if (StringUtils.isEmpty(fomat)) {
            throw new Exception("请指定格式");
        } else {
            boolean flag = true;

            try {
                SimpleDateFormat sdf = new SimpleDateFormat(fomat);
                sdf.parse(str);
                flag = true;
            } catch (ParseException var4) {
                flag = false;
            }

            return flag;
        }
    }

    public static Date str2Date(String str) throws Exception {
        Date date = null;
        if (!StringUtils.isEmpty(str)) {
            date = toDate(str, "yyyy-MM-dd");
        }

        return date;
    }

    public static Timestamp getFutureTime() throws Exception {
        Date d = str2Timestamp("2100-01-01 00:00:00");
        return getBeforeSecond(new Timestamp(d.getTime()));
    }

    public static Date str2Timestamp(String str) throws Exception {
        Date date = null;
        if (!StringUtils.isEmpty(str)) {
            date = toDate(str, "yyyy-MM-dd HH:mm:ss");
        }

        return date;
    }

    public static Date toDate(String dateStr, String format) throws Exception {
        if (StringUtils.isEmpty(dateStr)) {
            throw new Exception("请指定时间");
        } else if (StringUtils.isEmpty(format)) {
            throw new Exception("请指定格式");
        } else {
            SimpleDateFormat df = new SimpleDateFormat(format);

            try {
                Date date = df.parse(dateStr);
                return new Date(date.getTime());
            } catch (ParseException var4) {
                throw new Exception("系统转换日期字符串时出错！", var4);
            }
        }
    }

    public static Date getDate() throws Exception {
        String s = getDateString("yyyy-MM-dd HH:mm:ss");
        return str2Date(s);
    }

    public static Date getTheDayDate(Timestamp sysDate) throws Exception {
        DateFormat dfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dfmt.format(sysDate);
        return str2Date(dateString);
    }

    public static Date getOffsetDaysDate(Timestamp sysDate, int offsetDays) throws Exception {
        Timestamp t = getOffsetDaysTime(sysDate, offsetDays);
        return getTheDayDate(t);
    }

    public static Date getOffsetDaysDate(Date date, int offsetDays) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, offsetDays);
        return new Date(calendar.getTimeInMillis());
    }

    public static Timestamp getTheDayFirstSecond(Timestamp sysDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(13, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static Timestamp getTheDayLastSecond(Timestamp sysDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(13, -1);
        calendar.add(5, 1);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static Timestamp getOffsetDaysTime(Timestamp sysDate, int offsetDays) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.add(5, offsetDays);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static Timestamp getOffsetMonthsTime(Timestamp sysDate, int offsetDays) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.add(2, offsetDays);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static Timestamp getOffsetYearsTime(Timestamp sysDate, int offsetDays) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.add(1, offsetDays);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static Timestamp getTimeThisMonthLastSec(Timestamp sysDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.add(2, 1);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(13, -1);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static Timestamp getTimeThisMonthFirstSec(Timestamp sysDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.add(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(13, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static Timestamp getTimeNextMonthFirstSec(Timestamp sysDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.add(2, 1);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(13, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static int getDaysOfThisMonth() {
        Timestamp currTimestamp = getSysDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currTimestamp);
        return calendar.getActualMaximum(5);
    }

    public static String getMonth(String yyyyMM) throws Exception {
        if (!StringUtils.isEmpty(yyyyMM) && yyyyMM.length() == 6) {
            return yyyyMM.substring(4, 6);
        } else {
            throw new Exception("格式出错，无法获取月");
        }
    }

    public static boolean isDateType(String str) {
        String withYYYYMMDDHHSSRegax = "^\\d{4}([1-9]|(1[0-2])|(0[1-9]))([1-9]|([12]\\d)|(3[01])|(0[1-9]))(([0-1][0-9])|([2][0-3]))([0-5][0-9])([0-5][0-9])$";
        String withYYYYMMDDRegax = "^\\d{4}([1-9]|(1[0-2])|(0[1-9]))([1-9]|([12]\\d)|(3[01])|(0[1-9]))$";
        String withYYYYMMRegax = "^\\d{4}((1[0-2])|(0[1-9]))$";
        if (StringUtils.isEmpty(str)) {
            return false;
        } else if (str.length() == 6) {
            return str.matches(withYYYYMMRegax);
        } else if (str.length() == 8) {
            return str.matches(withYYYYMMDDRegax);
        } else {
            return str.length() == 14 ? str.matches(withYYYYMMDDHHSSRegax) : false;
        }
    }

    public static long getTimeDifference(Timestamp formatTime1, Timestamp formatTime2) {
        SimpleDateFormat timeformat = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
        long t1 = 0L;
        long t2 = 0L;

        try {
            t1 = timeformat.parse(getTimeStampNumberFormat(formatTime1)).getTime();
        } catch (ParseException var10) {
        }

        try {
            t2 = timeformat.parse(getTimeStampNumberFormat(formatTime2)).getTime();
        } catch (ParseException var9) {

        }

        long diff = t1 - t2;
        return diff / 86400000L;
    }

    public static int getTimeDifference(String beginDate, String endDate) {
        SimpleDateFormat timeformat = new SimpleDateFormat("yyyyMM");
        Calendar cal1 = new GregorianCalendar();
        GregorianCalendar cal2 = new GregorianCalendar();

        try {
            cal1.setTime(timeformat.parse(endDate));
            cal2.setTime(timeformat.parse(beginDate));
        } catch (ParseException var6) {

        }

        int c = (cal1.get(1) - cal2.get(1)) * 12 + cal1.get(2) - cal2.get(2);
        return c;
    }

    public static int getDates() {
        Timestamp currTimestamp = getSysDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currTimestamp);
        return calendar.get(5);
    }

    public static int getDaysBetween(String beginDate, String endDate) {
        SimpleDateFormat timeformat = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        long between_days = 0L;

        try {
            cal.setTime(timeformat.parse(beginDate));
            long time1 = cal.getTimeInMillis();
            cal.setTime(timeformat.parse(endDate));
            long time2 = cal.getTimeInMillis();
            between_days = (time2 - time1) / 86400000L;
        } catch (ParseException var10) {
        }

        return Integer.parseInt(String.valueOf(between_days));
    }

    public static String getOffsetMonth(String date, int offsetMonth) {
        SimpleDateFormat timeformat = new SimpleDateFormat("yyyyMM");
        GregorianCalendar cal = new GregorianCalendar();

        try {
            cal.setTime(timeformat.parse(date));
        } catch (ParseException var5) {

        }

        cal.add(2, offsetMonth);
        return timeformat.format(cal.getTime());
    }

    public static long getMinuteDif(Timestamp formatTime1, Timestamp formatTime2) {
        SimpleDateFormat timeformat = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
        long t1 = 0L;
        long t2 = 0L;

        try {
            t1 = timeformat.parse(getTimeStampNumberFormat(formatTime1)).getTime();
        } catch (ParseException var10) {

        }

        try {
            t2 = timeformat.parse(getTimeStampNumberFormat(formatTime2)).getTime();
        } catch (ParseException var9) {

        }

        long diff = t1 - t2;
        return diff / 60000L;
    }

    public static String getTimeStampNumberFormat(Timestamp formatTime) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss", new Locale("zh", "cn"));
        return format.format(formatTime);
    }

    public static int getMillis() {
        Timestamp currTimestamp = getSysDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currTimestamp);
        return calendar.get(14);
    }

    public static Timestamp getBeforeSecond(Timestamp currentDate) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(currentDate);
        calender.add(13, -1);
        return new Timestamp(calender.getTimeInMillis());
    }

    public static Timestamp getAfterSecond(Timestamp currentDate) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(currentDate);
        calender.add(13, 1);
        return new Timestamp(calender.getTimeInMillis());
    }

    public static Timestamp getTimestamp(String time) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        Timestamp ts = null;

        try {
            ts = new Timestamp(format.parse(time).getTime());
        } catch (ParseException var4) {

        }

        return ts;
    }

    public static String getCurYM() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
        Calendar calender = Calendar.getInstance();
        return df.format(calender.getTime());
    }

    public static Timestamp getTimestamp(String time, String pattern) throws Exception {
        if (StringUtils.isEmpty(time)) {
            throw new Exception("请指定字符串时间");
        } else if (StringUtils.isEmpty(pattern)) {
            throw new Exception("请指定日期格式");
        } else {
            DateFormat format = new SimpleDateFormat(pattern);
            format.setLenient(false);
            Timestamp ts = null;

            try {
                ts = new Timestamp(format.parse(time).getTime());
            } catch (ParseException var5) {

            }

            return ts;
        }
    }

    public static Timestamp getTimestamp(long time) {
        Timestamp ts = new Timestamp(time);
        return ts;
    }

    public static int getTimeDifferenceMonth(Timestamp formatTime1, Timestamp formatTime2) {
        Calendar calendarTime1 = Calendar.getInstance();
        calendarTime1.setTime(formatTime1);
        int yearTime1 = calendarTime1.get(1);
        int monthTime1 = calendarTime1.get(2);
        int dayTime1 = calendarTime1.get(5);
        Calendar calendarTime2 = Calendar.getInstance();
        calendarTime2.setTime(formatTime2);
        int yearTime2 = calendarTime2.get(1);
        int monthTime2 = calendarTime2.get(2);
        int dayTime2 = calendarTime2.get(5);
        int y = yearTime2 - yearTime1;
        int m = monthTime2 - monthTime1;
        int d = dayTime2 - dayTime1;
        return d >= 0 ? y * 12 + m + 1 : y * 12 + m;
    }

    public static String trans2CnTime(Timestamp time) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        return df.format(time);
    }

    public static String trans2CnDate(Timestamp time) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        return df.format(time);
    }

    public static Timestamp getTimeNextDay(Timestamp date) {
        long time = date.getTime();
        time += 86400000L;
        return new Timestamp(time);
    }

    public static Timestamp getTimeBeforeDay(Timestamp date) {
        long time = date.getTime();
        time -= 86400000L;
        return new Timestamp(time);
    }

    public static Timestamp getBeforeMonth(Timestamp currentDate) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(currentDate);
        calender.add(2, -1);
        return new Timestamp(calender.getTimeInMillis());
    }

    public static Timestamp getTimeLastMonthLastSec(Timestamp sysDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(sysDate);
        cal.add(2, -1);
        int maxDay = cal.getActualMaximum(5);
        cal.set(cal.get(1), cal.get(2), maxDay, 23, 59, 59);
        return new Timestamp(cal.getTimeInMillis());
    }

    public static Timestamp getOffsetMinute(Timestamp sysDate, int offsetMinutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysDate);
        calendar.add(12, offsetMinutes);
        return new Timestamp(calendar.getTimeInMillis());
    }
}
