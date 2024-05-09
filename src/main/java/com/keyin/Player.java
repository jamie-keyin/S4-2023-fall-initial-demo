package com.keyin;

import java.util.Calendar;
import java.util.Date;

public class Player {
    private Calendar birthday;
    private String firstName;
    private String lastName;
    private String shootingHand;

    public int getBirthYear() {
        return birthday.get(Calendar.YEAR);
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getShootingHand() {
        return shootingHand;
    }

    public void setShootingHand(String shootingHand) {
        this.shootingHand = shootingHand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "birthday=" + birthday +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
