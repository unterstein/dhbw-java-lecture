package test.test2;


import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MeineLustigeJavaClass {

  public static void main(String[] args) {
    Integer i1 = new Integer(12);
    Integer i2 = new Integer(12);
    System.out.println(i1.equals(i2));
  }

  private String lala;
  private int lolo;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MeineLustigeJavaClass that = (MeineLustigeJavaClass) o;
    return lolo == that.lolo &&
        Objects.equals(lala, that.lala);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lala, lolo);
  }
}
