package com.cc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) {

    Mitarbeiter ma1 = new Produktion("Mustermann", "Max", 1970, "ID001", "production", "worker", 2010);
    Mitarbeiter ma2 = new Buchhaltung("Chapeau", "Maxine", 1980, "ID002", "accounting", "accountant", 2012);
    Mitarbeiter ma3 = new Werbung("Martinelli", "Silvia", 1995, "ID003", "advertising", "consultant", 2018);
    List<Mitarbeiter> office = Arrays.asList(ma1, ma2, ma3);

    for (int i = 0; i < office.size(); i++) {
      output("------- MA " + (i + 1) + " --------------");
      output(office.get(i));
    }
  }

  private static void output(String outStr) {
    System.out.println(outStr);
  }
   private static void output(Mitarbeiter mitarbeiter) {
    System.out.println(mitarbeiter);
  }
}
