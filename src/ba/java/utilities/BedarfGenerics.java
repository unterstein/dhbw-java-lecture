package ba.java.utilities;


import ba.java.auto.AudiQFuenf;
import ba.java.auto.Pkw;

import java.io.File;

public class BedarfGenerics {

  public static void main(String[] args) {
    Liste liste = new Liste(20);
    liste.add("lala");
    liste.add(new AudiQFuenf());
    liste.add(new File("lalal/lolo"));

    GenerischeListe<Pkw> generischeListe = new GenerischeListe<Pkw>(20);
    generischeListe.add(new AudiQFuenf());
    generischeListe.add(new Pkw());

    GenerischeListe<String> generischeListe1 = new GenerischeListe<String>(20);

    GenerischeListe<Integer> intListe = new GenerischeListe<>(20);

    GenerischeListe<?> irgendeineListe = new GenerischeListe<String>(20);

  }

  public static void printFirst(GenerischeListe<? super Number> liste) {
    liste.get(0);
  }

  public static class GenerischeListe<T> {

    Object[] array;
    int lastUsedIndex = 0;

    public GenerischeListe(int size) {
      array = new Object[size];
    }

    public T get(int index) {
      return (T) array[index];
    }

    public void add(T object) {
      array[lastUsedIndex++] = object;
    }
  }

  public static class Liste {

    Object[] array;
    int lastUsedIndex = 0;

    public Liste(int size) {
      array = new Object[size];
    }

    public Object get(int index) {
      return array[index];
    }

    public void add(Object object) {
      array[lastUsedIndex++] = object;
    }
  }

  public static class StringListe {

    String[] array;
    int lastUsedIndex = 0;

    public StringListe(int size) {
      array = new String[size];
    }

    public Object get(int index) {
      return array[index];
    }

    public void add(String object) {
      array[lastUsedIndex++] = object;
    }
  }

  public static class AudiQ5Liste {

    AudiQFuenf[] array;
    int lastUsedIndex = 0;

    public AudiQ5Liste(int size) {
      array = new AudiQFuenf[size];
    }

    public Object get(int index) {
      return array[index];
    }

    public void add(AudiQFuenf object) {
      array[lastUsedIndex++] = object;
    }
  }
}
