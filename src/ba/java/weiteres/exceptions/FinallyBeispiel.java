package ba.java.weiteres.exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class FinallyBeispiel {

  public FinallyBeispiel() {
    try {
      tueEtwas();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  private void tueEtwas() throws FileNotFoundException {
    File file = null;
    try {
      file = new File("irgend/ein/pfad");
      String string = leseDatei(file);
      System.out.println(string);
    } catch (FileNotFoundException e) {
      // Fehlerbehandlung
      System.err.println(e.getMessage());
      throw e;
    } finally {
      schliesseDatei(file);
    }
  }

  private void schliesseDatei(File file) {
    // Gebe Referenz auf Datei frei
  }

  private String leseDatei(File file) throws FileNotFoundException {
    // Datei lesen ein und gebe Inhalt zurück
    return null;
  }
}
