package ba.java.grundlagen1;

public class KontrollflussBeispiel {

  private void verzweigung() {
    int meineZahl = 5;
    // If/Else Anweisung
    if (meineZahl == 5) {
      // tue etwas
    } else if (meineZahl == 6) {
      // tue etwas anderes
    } else {
      // tue was ganz anderes
    }

    // Switch-Anweisung
    switch (meineZahl) {
      case 5:
        // tue etwas
        break;
      case 6:
        // tue etwas anderes
        break;
      default: // tue etwas ganz anderes
    }

    // Switch-Anweisung
    switch (meineZahl) {
      case 5 | 7 | 9:
        // tue etwas
        break;
      case 6:
        // tue etwas anderes
        break;
      default: // tue etwas ganz anderes
    }
  }

  private void schleifen() {
    int meineZahl = 0;
    // While Schleife
    while (meineZahl < 5) {
      // tue etwas
      meineZahl++;
    }

    meineZahl = 0;
    // Do-While-Schleife
    do {
      // tue etwas, z.B.
      System.out.println(meineZahl);
      meineZahl++;
    } while (meineZahl < 0);

    // For-Schleife
    // for(init; test; update)
    // for(int x = 0, y = 1; x < 5 && y == 1; x++)
    for (int x = 0; x < 5; x++) {
      // tue etwas
    }

    int[] array = {0, 1, 2, 3, 4};
    // For-Each-Schleife
    for (int x : array) {
      // tue etwas
    }
  }

  public static void main(String[] args) {
    new KontrollflussBeispiel().verzweigung();
    new KontrollflussBeispiel().schleifen();
  }
}
