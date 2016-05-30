package ba.java.uebungen;

public class Konstruktoren {

  private static class SuperKlasse {
    public SuperKlasse(int i1, int i2) {
      System.out.printf("SuperKlasse(%d, %d)\n", i1, i2);
    }

    public SuperKlasse(int i) {
      System.out.printf("SuperKlasse(%d)\n", i);
    }
  }

  private static class SubKlasse extends SuperKlasse {

    public SubKlasse() {
      super(12);
      System.out.printf("SubKlasse()\n");
    }

    public SubKlasse(int i) {
      super(i);
      System.out.printf("SubKlasse(%d)\n", i);
    }

    public SubKlasse(int i1, int i2) {
      super(i1 + i2);
      System.out.printf("SubKlasse(%d, %d)\n", i1, i2);
    }
  }

  public static void main(String[] args) {
    new SubKlasse();
    System.out.println("----");
    new SubKlasse(1);
    System.out.println("----");
    new SubKlasse(1, 2);
  }
}
