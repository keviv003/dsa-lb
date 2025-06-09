package org.codelounge.basics;

public class DetermineDayType {

    static String dayDetermine(int day) {
        switch (day) {
            case 1:
                return "Weekday";
            case 2:
                return "Weekday";
            case 3:
            case 4:
            case 5:
                return "weekday";
            case 6:
                return "Weekend";//instead of break ?
            default:
                return "invalid";// default so no return compiler issue
        }
    }

    public static void main(String[] args) {
        int i = 6;
        if (i > 0 && i <= 5) {
            System.out.println("weekday");
        } else if (i > 5 && i <= 7) {
            System.out.println("weekend");
        }

   /*     switch(i){
            case 1:
                return "Weekday";

        }*/

        System.out.println(dayDetermine(i));

    }


}
