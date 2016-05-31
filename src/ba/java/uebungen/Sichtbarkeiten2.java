package ba.java.uebungen;

public class Sichtbarkeiten2 {

  private static class InnerClass1 {
    private int a;

    public InnerClass1() {
      a = 2;
    }
  }

  private static class InnerClass2 extends InnerClass1 {
    private int a;

    public InnerClass2() {
      a = 1;
    }
  }

  public static void main(String[] args) {
    InnerClass2 test = new InnerClass2();
    System.out.println(test.a);
    System.out.println(((InnerClass1) test).a);
  }
}
