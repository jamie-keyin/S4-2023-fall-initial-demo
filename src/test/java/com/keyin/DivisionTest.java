package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    public void testIsPlayerEligible() {
        Player u9Player = new Player();
        u9Player.setAge(7);
        u9Player.setFirstName("u9Player");
        u9Player.setLastName("u9Player");

        Division divisionUnderTest = new Division();
        divisionUnderTest.setName("U9");
        divisionUnderTest.setStartAge(7);
        divisionUnderTest.setEndAge(9);

        Assertions.assertTrue(divisionUnderTest.isPlayerEligible(u9Player));

        Player u11Player = new Player();
        u9Player.setAge(10);
        u9Player.setFirstName("u11Player");
        u9Player.setLastName("u11Player");

        Assertions.assertFalse(divisionUnderTest.isPlayerEligible(u11Player));
    }
}
