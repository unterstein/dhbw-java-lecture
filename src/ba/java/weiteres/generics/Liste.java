package ba.java.weiteres.generics;

import ba.java.auto.Suv;

public class Liste<T> {
  private Object[] data;
  private int size;

  public Liste(int maxSize) {
    this.data = new Object[maxSize];
    this.size = 0;
  }

  public void add(T element) {
    if (size >= data.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    data[size++] = element;
  }

  public T get(int index) {
    if (size >= data.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return (T) data[index];
  }

  public static void main(String[] args) {
    Liste<Integer> zahlenListe = new Liste<Integer>(20);
    zahlenListe.add(1);
    zahlenListe.add(2);

    Integer integer = zahlenListe.get(0);
//    zahlenListe.add(new Suv());
  }

}

