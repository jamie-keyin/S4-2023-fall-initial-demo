package com.keyin;

public class Division {
    private int startAge;
    private int endAge;
    private String name;

    public int getStartAge() {
        return startAge;
    }

    public void setStartAge(int startAge) {
        this.startAge = startAge;
    }

    public int getEndAge() {
        return endAge;
    }

    public void setEndAge(int endAge) {
        this.endAge = endAge;
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
                "startAge=" + startAge +
                ", endAge=" + endAge +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isPlayerEligible(Player player) {
        return player.getAge() >= startAge && player.getAge() < endAge;
    }
}
