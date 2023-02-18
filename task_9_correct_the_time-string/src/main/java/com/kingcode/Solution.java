package com.kingcode;

public class Solution {

    public static String timeCorrect(String timestring) {
        if (checkForInvalidFormat(timestring) == null) return null;

        int hour = getIntValuesHour(timestring);
        int minute = getIntValuesMinute(timestring);
        int second = getIntValuesSecond(timestring);

        if (hour != 23 && second > 60) {
            second -= 60;
            minute += 1;
            if (minute > 60) {
                minute -= 60;
                hour += 1;
            }
        }

        if (hour != 23 && minute > 60) {
            minute -= 60;
            hour += 1;
        }

        if (hour > 23 && minute < 60 && second < 60) hour = hour % 24;

        if (hour > 23 && second >= 60) {
            second -= 60;
            minute += 1;
            if (minute >= 60) {
                minute -= 60;
                hour += 1;
                if (hour > 23) hour = hour % 24;
            }
        }

        if (hour > 23 && minute >= 60) {
            minute -= 60;
            hour += 1;
            if (hour > 23) hour = hour % 24;
        }

        if (hour == 23 && second >= 60) {
            second -= 60;
            minute += 1;
            if (minute >= 60) {
                minute -= 60;
                hour = 0;
            }
        }

        if (hour % 24 == 0 && minute >= 60) {
            minute -= 60;
            hour += 1;
        }


        return formatOutput(hour) + ":" + formatOutput(minute) + ":" + formatOutput(second);
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

    private static String formatOutput(int num) {
        if (num < 10) return "0" + num;
        return num + "";
    }
}
