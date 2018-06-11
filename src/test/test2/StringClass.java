package test.test2;

import javafx.event.Event;
import javafx.event.EventHandler;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringClass {
  static String s1 = null;

  public static void main(String[] args) throws Exception {
    UnserEnum rot = UnserEnum.ROT;

    System.out.println(rot.unsereVariable);
    rot.unsereVariable = 15;
    System.out.println(rot.unsereVariable);

    System.out.println(UnserEnum.ROT.unsereVariable);

    List<String> meineListe = new ArrayList<String>();
    meineListe.add("a");
    meineListe.add("b");
    meineListe.add("c");
    genericList(meineListe);

    List<?> meineListe2 = new ArrayList<Object>();
//    List<?> meineListe3 = new ArrayList<?>();

    EventHandler handler = new EventHandler() {

      @Override
      public void handle(Event event) {
        System.out.println("handle!");
        System.out.println("handle!");
      }
    };

    EventHandler handler2 = (event) -> {
      System.out.println("handle!");
      System.out.println("handle!");
    };

    LalaInterface lala = (i1, i2) -> System.out.println(i1 + i2);

    lala.lala(1, 2);
    lala.lala(2, 2);
    lala.lala(3, 2);

    System.out.println("HIER GEHTS LOSHIER GEHTS LOSHIER GEHTS LOSHIER GEHTS LOSs");
    List<String> streamListe = new ArrayList<>();
    streamListe.add("a");
    streamListe.add("a");
    streamListe.add("b");
    streamListe.add("c");
    streamListe.add("d");
    streamListe.add("d");
    streamListe.add("e");

    String result = streamListe
        .stream()
        .map((s) -> s + "1")
        .distinct()
        .filter((s) -> s.contains("e"))
        .reduce((s1, s2) -> s1 + s2).orElse("");
    System.out.println(result);
  }

  private static interface LalaInterface {
    void lala(int i1, int i2);
  }


  private static void genericList(List<? extends Number> meineListe) {
    for (Object o : meineListe) {
      System.out.println(o);
    }
  }

  private static enum UnserEnum {

    ROT(1), GRUEN(2), BLAU(3);

    private int unsereVariable;

    private UnserEnum(int unsereVariable) {
      this.unsereVariable = unsereVariable;
    }
  }

  private static int magic() {
    try {
      return 1;
    } catch (Exception e) {
      return 2;
    } finally {
      return 3;
    }
  }

  private static String readFile(File f) throws Exception {
    throw new Exception();
  }

}
