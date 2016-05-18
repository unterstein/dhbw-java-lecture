package ba.java.weiteres.generics;

import ba.java.weiteres.enums.Farbe;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by junterstein on 27.05.15.
 */
public class GenericsBeispiel {


  public static void main(String[] args) {

    MeineListe meineListe = new MeineListe(10);
    meineListe.add("asdasd");
    meineListe.add(Farbe.ROT);
    meineListe.add(new File("213123"));

    MeineGenerischeListe<String> meineStringListe = new MeineGenerischeListe<String>(10);
    meineStringListe.add("adsads");
    meineStringListe.get(0);

    MeineGenerischeListe<Farbe> meineFarbenListe = new MeineGenerischeListe<Farbe>(10);
    meineFarbenListe.add(Farbe.BLAU);

    MeineGenerischeListe<Integer> intList = new MeineGenerischeListe<Integer>(10);

    print(intList);

    Map<Integer, String> myMap = new HashMap<>();
    Map<Integer, Map<Integer, List<String>>> fancyMap = new HashMap<Integer, Map<Integer, List<String>>>();

    Map<Integer, Map<Integer, List<String>>> fancyMap2 = new HashMap<>();
  }

  public static void print(MeineGenerischeListe<? extends Number> liste) {
    Object object = liste.get(0);
  }

  private static class MeineListe {

    Object[] array;
    int lastUsedIndex = 0;

    public MeineListe(int size) {
      array = new Object[size];
    }

    public void add(Object object) {
      array[lastUsedIndex++] = object;
    }

    public Object get(int index) {
      return array[index];
    }
  }

  private static class MeineGenerischeListe<T> {

    Object[] array;
    int lastUsedIndex = 0;

    public MeineGenerischeListe(int size) {
      array = new Object[size];
    }

    public void add(T object) {
      array[lastUsedIndex++] = object;
    }

    public T get(int index) {
      return (T) array[index];
    }
  }
}
