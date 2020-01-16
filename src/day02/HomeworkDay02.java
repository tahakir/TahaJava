package day02;

import java.sql.SQLOutput;

public class HomeworkDay02 {
    public static void main(String[] args) {
        int weeklyWorkoutHours=6;
        int weeklyEatingHours=4;
        int weeklyDrivingHours=20;
        int weeklySleepingHours=45;
        int weeklyReadingHours=15;
        int myWeeklyRoutine=weeklyWorkoutHours+weeklyEatingHours+weeklyDrivingHours+weeklySleepingHours+weeklyReadingHours;

        System.out.println("My Weekly Routine hours are " + myWeeklyRoutine + " hours " + " for the same every week.");

        int monday=5;
        int tuesday=6;
        int wednesday=5;
        int thursday=7;
        int friday=7;
        int myTotalDrivingHours=monday+tuesday+wednesday+thursday+friday;

        System.out.println("My Driving hours is total of " + myTotalDrivingHours + " hours");



    }
}
