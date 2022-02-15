package com.nf.enumAlarm;

import org.junit.jupiter.api.Test;



import static com.nf.enumAlarm.Warning.GELB;
import static com.nf.enumAlarm.Warning.ROT;
import static com.nf.enumAlarm.Warning.GRUEN;


import static org.testng.Assert.assertEquals;

class AlarmTest {

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(15, GELB));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(30, GELB));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(31, GELB));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(45, GRUEN));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(60, GRUEN));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(61, GRUEN));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(1, ROT));
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(0, ROT));
    }

    @Test
    void testUnknownAlarmLevel() {
        // assertEquals("unknownMain level", Alarm.checkNumberOfCustomers(100, "unknown"));
    }

}