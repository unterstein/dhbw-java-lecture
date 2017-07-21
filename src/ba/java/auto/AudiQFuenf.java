package ba.java.auto;


import ba.java.gehaltsberechnung.*;
import ba.java.gehaltsberechnung.testpacket.SpecialGF;

import java.io.Serializable;
import java.util.*;
import java.awt.*;

public class AudiQFuenf extends Suv implements Serializable {

  private String snr;

  public AudiQFuenf() {
    Pkw pkw = new Pkw();
    String string = new String();
    Mitarbeiter arbeiter = new Arbeiter(12, 12);
    SpecialGF specialGF = new SpecialGF(123,123,123,123);

    java.awt.List meineListe = new java.awt.List();
  }
}
