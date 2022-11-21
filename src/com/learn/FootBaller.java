package com.learn;

public class FootBaller {
    private String firstName;
    private String lastName;
    private String number;
    private String team;
    private int goals;

    public FootBaller() {
    }

    public FootBaller(String firstName, String lastName, String number, String team, int goals) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.team = team;
        this.goals = goals;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return  "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                ", team='" + team + '\'' +
                ", goals=" + goals;

    }
}
