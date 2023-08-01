package com.cc.java;

public class Buchhaltung extends Mitarbeiter{

    
    public Buchhaltung(String firstName, String lastName, int birthYear, String id, String role,
            int startYear) {
        super(firstName, lastName, birthYear, id,  role, startYear);
       this.departement="accounting";
    }

    @Override
    protected String doYourWork() {
       return "Rechnet";
    }
    
}
