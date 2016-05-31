package ba.java.weiteres.generics;

public class AlteListe {
  private Object[] data;
  private int size;

  public AlteListe(int maxSize) {
    this.data = new Object[maxSize];
    this.size = 0;
  }

  public void addElement(Object element) {
    if (size >= data.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    data[size++] = element;
  }

  public Object elementAt(int index) {
    if (size >= data.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return data[index];
  }
}

