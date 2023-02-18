package com.kingcode;

public class CorrectTimeString {

    public static String timeCorrect(String timestring) {
        //"19:99:99" -> "20:40:39"
        if (timestring == null || timestring.equals("")) return null;

        String extractedHour = timestring.substring(0, 2);
        String extractedMin = timestring.substring(3, 5);
        String extractedSec = timestring.substring(6, 8);

        String hour = getHour(extractedHour);
        String second = getSecond(extractedSec);
        String minute = getMinute(extractedMin, hour);
        if (Integer.parseInt(extractedSec) > 60) {
            minute = (Integer.parseInt(getMinute(extractedMin, hour)) + 1) + "";
        }
        if (Integer.parseInt(extractedMin) >= 60) {
            hour = (Integer.parseInt(hour) + 1) + "";
        }

        if (Integer.parseInt(hour) == 23 && Integer.parseInt(minute) == 60 ||  Integer.parseInt(second) == 60) {
            hour = "00";
        }
        String extractedTime = hour + ":" + minute + ":" + second;
//        if (extractedTime.equals("23:59:60")) {
//            return "00:00:00";
//        }

        return extractedTime;
    }

//    private static boolean isDigit(String timestring, int beginIndex, int endIndex) {
//        return Character.isDigit(Integer.parseInt(timestring.substring(beginIndex, endIndex)));
//    }

    private static String getHour(String extractedHour) {
        if (Integer.parseInt(extractedHour) > 23) {
            int hour = Integer.parseInt(extractedHour) % 24;
            return hour < 10 ? "0" + hour : "" + hour;
        } else {
            return extractedHour;
        }
    }

    private static String getMinute(String minute, String hour) {
        if (Integer.parseInt(hour) == 23 && Integer.parseInt(minute) == 60) return "00";
        if (Integer.parseInt(minute) > 60) {
            int min = Integer.parseInt(minute) - 60;
            return min < 10 ? "0" + min : "" + min;
        }
        return minute;
    }

    private static String getSecond(String second) {
        if (Integer.parseInt(second) > 60) {
            int min = Integer.parseInt(second) - 60;
            return min < 10 ? "0" + min : "" + min;
        }
        return second;
    }

    private static String addMinToHour(String input, String extractedMinOrSec) {
        if (Integer.parseInt(extractedMinOrSec) > 59) {
            int addedMinToHour = Integer.parseInt(input) + 1;
            return addedMinToHour == 24 ? "00" : addedMinToHour + "";
        }
        return input;
    }
}
