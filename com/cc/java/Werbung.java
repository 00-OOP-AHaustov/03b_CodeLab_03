package com.cc.java;

public class Werbung extends Mitarbeiter {

    public Werbung(String firstName, String lastName, int birthYear, String id,  String role,
            int startYear) {
        super(firstName, lastName, birthYear, id,  role, startYear);
        this.departement ="advertising";
    }

    @Override
    protected String doYourWork() {
       return "Macht geliebte Kalt-Akquise";
    }
  
    
}
