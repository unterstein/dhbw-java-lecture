package ba.java.uebungen;

import java.util.ArrayList;
import java.util.List;

public class Java8Uebung {

  public static String methodRef(String s) {
    return s + "2";
  }

  public static void main(String[] args) {
    List<String> liste = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      liste.add("" + i);
    }
    liste.stream() // Keyword für Java8 Collections
        .map(Java8Uebung::methodRef) // .map erwartet Rückgabewert -> return String
        .forEach(System.out::println); // .forEach ist das gleiche wie .map, allerdings ohne Rückgabewert -> return void
  }
}
