package ba.java.weiteres.generics;

import ba.java.auto.Suv;

public class AlteListe {
  private Object[] data;
  private int size;

  public AlteListe(int maxSize) {
    this.data = new Object[maxSize];
    this.size = 0;
  }

  public void add(Object element) {
    if (size >= data.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    data[size++] = element;
  }

  public Object get(int index) {
    if (size >= data.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return data[index];
  }

  public static void main(String[] args) {
    AlteListe zahlenListe = new AlteListe(20); // Vector vector = new Vector();
    zahlenListe.add(1);
    zahlenListe.add(2);

    Object object = zahlenListe.get(0);
    if (object instanceof Integer) {
      Integer meinInteger = (Integer) object; // << doof
      System.out.println("Hurray!! " + meinInteger);
    }

    zahlenListe.add(new Suv());
    System.out.println((Integer) zahlenListe.get(2));
  }
}

