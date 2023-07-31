package com.cc.java;

public class Werbung extends Mitarbeiter {

    public Werbung(String firstName, String lastName, int birthYear, String id, String departement, String role,
            int startYear) {
        super(firstName, lastName, birthYear, id, departement, role, startYear);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected String doYourWork() {
       return "Macht geliebte Kalt-Akquise";
    }
    
}
