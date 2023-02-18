package com.kingcode;

public class CorrectTimeString {

    public static String timeCorrect(String timestring) {
        String extractedHour = timestring.substring(0, 2);
        String extractedMin = timestring.substring(3, 5);
        String extractedSec = timestring.substring(6, 8);
        return addMinToHour(getHour(extractedHour), extractedMin) + ":" + getMinOrSec(extractedMin) + ":" + getMinOrSec(extractedSec);
    }

    private static String getHour(String extractedHour) {
        if (Integer.parseInt(extractedHour) > 23) {
            int hour = Integer.parseInt(extractedHour) % 24;
            if (hour < 10) {
                return "0" + hour;
            } else {
                return "" + hour;
            }
        } else {
            return extractedHour;
        }
    }

    private static String getMinOrSec(String extractedMin) {
        if (Integer.parseInt(extractedMin) > 60) {
            int min = Integer.parseInt(extractedMin) - 60;
            if (min < 10) {
                return "0" + min;
            } else {
                return "" + min;
            }
        } else {
            return extractedMin;
        }
    }

    private static String addMinToHour(String hour, String extractedMin) {
        if (Integer.parseInt(extractedMin) > 60) {
            int addedMinToHour = Integer.parseInt(hour) + 1;
            return hour = addedMinToHour + "";
        } else return hour;
    }
}
