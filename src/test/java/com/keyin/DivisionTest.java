package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class DivisionTest {

    @Test
    public void testIsPlayerEligible() {
        Player u9Player = new Player();
        Calendar playerBirthday = Calendar.getInstance();
        playerBirthday.set(2015, 1, 15);
        u9Player.setBirthday(playerBirthday);
        u9Player.setFirstName("u9Player");
        u9Player.setLastName("u9Player");

        Division divisionU9UnderTest = new Division();
        divisionU9UnderTest.setName("U9"); // 2015, 2016
        divisionU9UnderTest.addEligibleBirthYear(2015);
        divisionU9UnderTest.addEligibleBirthYear(2016);

        Assertions.assertTrue(divisionU9UnderTest.isPlayerEligible(u9Player));

        Player u11Player = new Player();
        Calendar u11PlayerBirthday = Calendar.getInstance();
        u11PlayerBirthday.set(2013, 1, 15);
        u11Player.setBirthday(u11PlayerBirthday);
        u11Player.setFirstName("u11Player");
        u11Player.setLastName("u11Player");

        Assertions.assertFalse(divisionU9UnderTest.isPlayerEligible(u11Player));
    }
}
