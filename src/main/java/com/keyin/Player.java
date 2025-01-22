package com.keyin;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(birthday, player.birthday) && Objects.equals(firstName, player.firstName) && Objects.equals(lastName, player.lastName) && Objects.equals(shootingHand, player.shootingHand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday, firstName, lastName, shootingHand);
    }
}
