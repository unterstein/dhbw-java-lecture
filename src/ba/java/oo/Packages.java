package ba.java.oo;

import java.util.Date;

public class Packages {
  // Import der Klasse verwenden
  Date dateImport = new Date();
  // Vollqualifizierter Zugriff auf die Klasse
  // Import ist in diesem Fall nicht notwendig
  java.util.Date dateQualified = new java.util.Date();
}
