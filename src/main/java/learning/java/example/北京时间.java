package learning.java.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 北京时间 {

    public static void main(String[] args) throws Exception {
        getDate();
        //System.out.println(getTime(10));
    }

    /**
     * 获得当前日期并格式化
     */
    private static void getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为：" + sdf.format(new Date()));
    }

    /**
     * 获得当前是星期几
     */
    private static String getWeek() {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        String week = "";
        if (weekday == 1) {
            week = "周日";
        } else if (weekday == 2) {
            week = "周一";
        } else if (weekday == 3) {
            week = "周二";
        } else if (weekday == 4) {
            week = "周三";
        } else if (weekday == 5) {
            week = "周四";
        } else if (weekday == 6) {
            week = "周五";
        } else if (weekday == 7) {
            week = "周六";
        }
        return week;
    }

    /**
     * 获取几天以后是星期几
     */
    public static String getNextDay(int nextDay) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, nextDay);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        String week = "";
        if (weekday == 1) {
            week = "周日";
        } else if (weekday == 2) {
            week = "周一";
        } else if (weekday == 3) {
            week = "周二";
        } else if (weekday == 4) {
            week = "周三";
        } else if (weekday == 5) {
            week = "周四";
        } else if (weekday == 6) {
            week = "周五";
        } else if (weekday == 7) {
            week = "周六";
        }
        return week;
    }

    /**
     * 获取多少分钟后的时间
     */
    public static Date getTime(int mins) {
        //当前的时间
        Date date = new Date();
        System.out.println(date);
        //得到一个Calendar
        Calendar calendar = Calendar.getInstance();
        //设置当前时间
        calendar.setTime(date);
        //在当前时间上添加多少分钟
        calendar.add(Calendar.MINUTE, mins);
        return calendar.getTime();
    }

}
