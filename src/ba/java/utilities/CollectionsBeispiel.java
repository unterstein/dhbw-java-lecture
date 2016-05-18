package ba.java.utilities;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsBeispiel {

  private void listeBeispiele() {
    List<Integer> meineListe = new LinkedList<>();
    meineListe.add(5);
    meineListe.add(2);
    meineListe.add(10);
    // sortiert Liste aufsteigend
    // Integer implementiert das Interface Comparable<Integer>
    Collections.sort(meineListe);
    // Ein spezieller Vergleicher,
    // der zur Sortierung heran gezogen wird
    Comparator<Integer> vergleicher = new Comparator<Integer>() {
      @Override
      public int compare(Integer int1, Integer int2) {
        return int2.compareTo(int1);
      }
    };
    // Liste speziell sortieren
    Collections.sort(meineListe, vergleicher);
    // dreht die Elemente der Liste (wieder) um
    Collections.reverse(meineListe);
    List<Integer> synchronisierteListe = Collections.synchronizedList(meineListe);
    List<Integer> unmodifizierbareListe = Collections.unmodifiableList(meineListe);
    Integer max = Collections.max(meineListe);
    // ...
  }

  private void arraysBeispiele() {
    Integer[] meinArray = {5, 2, 10, 25, 1, 20};
    Integer[] meinArray2 = {5, 2, 10, 25, 1, 20};
    List<Integer> alsListe = Arrays.asList(meinArray);
    // sortiert Liste aufsteigend
    Arrays.sort(meinArray);

    System.out.println(meinArray == meinArray2);
    // Vergleich von Arrays.equals geht auf den Inhalt!
    Integer[] zweiterArray = {1, 2, 3};
    boolean vergleich = Arrays.equals(meinArray, zweiterArray);
    // Es können Elemente gesucht werden
    int indexOfSearch = Arrays.binarySearch(meinArray, 20);
    System.out.println(Arrays.toString(meinArray));
    // Gibt "[1, 2, 5, 10, 20, 25]" aus
  }

  public static void main(String[] args) throws Exception {
    CollectionsBeispiel beispiel = new CollectionsBeispiel();
    beispiel.listeBeispiele();
    beispiel.arraysBeispiele();
  }
}
