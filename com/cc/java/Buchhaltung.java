package com.cc.java;

public class Buchhaltung extends Mitarbeiter{

    
    public Buchhaltung(String firstName, String lastName, int birthYear, String id, String departement, String role,
            int startYear) {
        super(firstName, lastName, birthYear, id, departement, role, startYear);
       
    }

    @Override
    protected String doYourWork() {
       return "Rechnet";
    }
    
}
