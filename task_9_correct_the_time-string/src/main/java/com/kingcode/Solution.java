package com.kingcode;

public class Solution {

    public static String timeCorrect(String timestring) {

        if (checkForInvalidFormat(timestring) == null) return null;
        int hour = getIntValuesHour(timestring);
        int minute = getIntValuesMinute(timestring);
        int second = getIntValuesSecond(timestring);


        return hour + ":" + minute + ":" + second;
    }

    private static int getIntValuesHour(String timestring) {
        return Integer.parseInt(timestring.substring(0, 2));
    }

    private static int getIntValuesMinute(String timestring) {
        return Integer.parseInt(timestring.substring(3, 5));
    }

    private static int getIntValuesSecond(String timestring) {
        return Integer.parseInt(timestring.substring(6, 8));
    }

    private static String checkForInvalidFormat(String timestring) {
        if (timestring == null) return null;
        if (timestring.equals("")) return "";
        if (timestring.length() != 8 || timestring.contains(";")) return null;
        if (!Character.isDigit(timestring.charAt(0)) || !Character.isDigit(timestring.charAt(1))) return null;
        if (!Character.isDigit(timestring.charAt(3)) || !Character.isDigit(timestring.charAt(4))) return null;
        if (!Character.isDigit(timestring.charAt(6)) || !Character.isDigit(timestring.charAt(7))) return null;
        return timestring;
    }
}
