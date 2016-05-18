package ba.java.weiteres.exceptions;

import java.io.FileNotFoundException;

public class ExceptionsBeispiel {

  // Behandeln von Exceptions
  public ExceptionsBeispiel() {
    // ... tue irgendwas
    try {
      tueEtwasMitEinerDatei();
    } catch (IndexOutOfBoundsException e) {
      // behandeln, weil etwas wegen einem Array kaputt ist
    } catch (FileNotFoundException e) {
      // behandeln, weil etwas wegen einer Datei kaputt ist
    } catch (Exception e) {
      // irgend etwas anderes ist kaputt gegangen.
      e.printStackTrace();
    }
    // tue irgendwas anderes ...
  }

  // Auslösen von Exceptions
  private void tueEtwasMitEinerDatei()
      throws IndexOutOfBoundsException,
      FileNotFoundException {
    // ...
    if (1 == 1) {
      throw new RuntimeException("Hier ist was dummes passiert ..");
    }
  }

  public static void main(String[] args) {
    new ExceptionsBeispiel();
  }
}
