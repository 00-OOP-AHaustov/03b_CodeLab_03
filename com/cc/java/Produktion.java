package com.cc.java;

public class Produktion extends Mitarbeiter {

    public Produktion(String firstName, String lastName, int birthYear, String id,  String role,
            int startYear) {
        super(firstName, lastName, birthYear, id,  role, startYear);
       this.departement="production";
    }

    @Override
    protected String doYourWork() {
       return "Produziert";
    }
    
}
