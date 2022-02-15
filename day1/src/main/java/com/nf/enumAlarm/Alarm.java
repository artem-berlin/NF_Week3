package com.nf.enumAlarm;

import static com.nf.enumAlarm.Warning.*;

public class Alarm {

        private static final String WARNING_MESSAGE = "Zu viele Personen";
        private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";

        public static String checkNumberOfCustomers(int numberOfCustomers, Warning alarmLevel) {

            return switch (alarmLevel) {
                case ROT -> checkCustomers(numberOfCustomers, 0);
                case GELB -> checkCustomers(numberOfCustomers, 30);
                case GRUEN -> checkCustomers(numberOfCustomers, 60);
             // new enum defult + private static final   default -> "unknown alarm level";
            };
        }

        private static String checkCustomers(int numberOfCustomers, int maxNumberOfCustomers) {
            if (numberOfCustomers > maxNumberOfCustomers) {
                return WARNING_MESSAGE;
            }
            return OK_MESSAGE;
        }

    public static void main(String[] args) {
        System.out.println(checkNumberOfCustomers(25,ROT));
        System.out.println(checkCustomers(25,100));
    }
}
