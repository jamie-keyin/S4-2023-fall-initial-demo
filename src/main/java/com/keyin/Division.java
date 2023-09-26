package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Division {

    private List<Integer> eligibleBirthYears;

    private String name;

    public void addEligibleBirthYear(int year) {
        if (eligibleBirthYears == null) {
            eligibleBirthYears = new ArrayList<Integer>();
        }

        eligibleBirthYears.add(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Division{" +
                "eligibleBirthYears=" + eligibleBirthYears +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isPlayerEligible(Player player) {
        return eligibleBirthYears.contains(player.getBirthYear());
    }
}
