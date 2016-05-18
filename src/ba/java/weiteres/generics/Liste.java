package ba.java.weiteres.generics;

public class Liste<T> {
  private Object[] data;
  private int size;

  public Liste(int maxSize) {
    this.data = new Object[maxSize];
    this.size = 0;
  }

  public void addElement(T element) {
    if (size >= data.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    data[size++] = element;
  }

  public T elementAt(int index) {
    if (size >= data.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return (T) data[index];
  }
}

