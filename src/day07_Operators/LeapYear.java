package day07_Operators;

import java.sql.SQLOutput;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        boolean isLeapYear = year% 4 == 0;

        System.out.println(year + " is a leap year: " +isLeapYear);

    }
}
