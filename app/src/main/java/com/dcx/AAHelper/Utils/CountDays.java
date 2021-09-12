package com.dcx.AAHelper.Utils;

import java.util.Date;

public class CountDays {
    // 一天的秒数
    public static final long oneDayMilliseconds = 86400000;

    /**
     * 计算日期[dateA, dateB]之间的天数，包含dateA和dateB
     *
     * @param dateA 一个日期
     * @param dateB 另一个日期
     * @return 这两个日期之间相差的天数
     */
    public static long daysBetween(Date dateA, Date dateB) {
        return Math.abs((dateB.getTime() - dateA.getTime()) / oneDayMilliseconds) + 1;
    }

}
