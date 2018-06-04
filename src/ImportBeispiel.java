import java.util.Date;
import java.util.Objects;

public class ImportBeispiel {

  public static void main(String[] args) {
    new Enkel(12).test();
  }

  private static class Eltern {
    public void printString() {
      System.out.println("eltern");
    }
  }

  private static class Kind extends Eltern {

    @Override
    public void printString() {
      System.out.println("KIND!");
      super.printString();
    }

    public void test() {
      printString();
      super.printString();
    }

    public Kind(String s) {

    }
  }
  private static class Enkel extends Kind {

    String s;

    public Enkel(int i) {
      super("" + i);
    }


  }
}
