package com.cc.java;

public class Produktion extends Mitarbeiter {

    public Produktion(String firstName, String lastName, int birthYear, String id, String departement, String role,
            int startYear) {
        super(firstName, lastName, birthYear, id, departement, role, startYear);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected String doYourWork() {
       return "Produziert";
    }
    
}
