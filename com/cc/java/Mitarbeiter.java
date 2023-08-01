package com.cc.java;

import java.time.LocalDate;

public abstract class Mitarbeiter {
    private String firstName;
    private String lastName;
    private int birthYear;

    protected String id;
    protected String departement;
    protected String role;
    protected int startYear;

    public Mitarbeiter(String lastName, String firstName, int birthYear, String id, String departement, String role,
            int startYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.id = id;
        this.departement = departement;
        this.role = role;
        this.startYear = startYear;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    protected String hasLunch() {
        return "Hi, I'm " + this.firstName + " and I'm having lunch!";
    }

    protected String startsWork() {
        return "Hi, I'm " + this.firstName + " and I'm starting my work at the "
                + this.departement + " departement!";
    }

    protected String getEmployedTime(){
        return "Hi, I'm "+this.firstName+ " and I've been working here for "+(LocalDate.now().getYear()-this.startYear)+" years.";
    }

    protected abstract String doYourWork();


    @Override
    public String toString() {
        return this.startsWork()+ '\n'+
        this.hasLunch() + '\n' +
        this.getEmployedTime() + '\n' +
        this.doYourWork()+'\n';
    }


}
