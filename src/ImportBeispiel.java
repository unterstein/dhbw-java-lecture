import java.util.Date;
import java.util.Objects;

public class ImportBeispiel {

  public static void main(String[] args) {
    TestKlasse testKlasse = new TestKlasse();

    System.out.println(testKlasse.toString());

    testKlasse.equals("Bist du gleich?");
    testKlasse.hashCode();
  }

  private static class TestKlasse extends Object {
    String id;
    String name;

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      TestKlasse that = (TestKlasse) o;
      return Objects.equals(id, that.id) &&
          Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(id, name);
    }
  }
}
