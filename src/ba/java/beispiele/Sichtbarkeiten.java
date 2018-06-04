package ba.java.beispiele;

import ba.java.auto.AudiQSieben;

import java.util.Arrays;

public class Sichtbarkeiten {

  final int i;

  public Sichtbarkeiten() {
    i = 12;
  }

  public static void main2(final String[] args) {
    new Kind();

    final int konstante = 5;
    final AudiQSieben q7 = new AudiQSieben();
//    q7 = new AudiQSieben();
    q7.anzahlBlinker = 5;

    final int[] array = new int[2];
    array[0] = 4;
    array[1] = 5;
    System.out.println(Arrays.toString(array));
  }

  static class Eltern {
    int var = 15;

    public Eltern() {
      var += 4;
      print(getVar());
    }

    public void print(int var) {
      System.out.println("Eltern prints: " + var);
    }

    public int getVar() {
      return var;
    }
  }

  static class Kind extends Eltern {
    int var = 9;

    public Kind() {
      // super();
      var -= 4;
      print(getVar());
    }

    public int getVar() {
      return var;
    }

    public void print(int var) {
      System.out.println("Kind prints: " + var);
    }
  }


  interface Interface1 {
    int lala();
  }

  interface Interface2 extends Interface1 {
    int lolo();
  }

  interface Interface3 {
    int lolo();
  }

  static class InterfaceImpl implements Interface2, Interface3 {

    @Override
    public int lala() {
      return 0;
    }

    @Override
    public int lolo() {
      return 0;
    }

    public void lulu() {
      System.out.println("asd");
    }

    public void lili() {
      System.out.println("lili");
    }
  }

  public static void main(String[] args) {
    InterfaceImpl testObjekt = new InterfaceImpl();
    testObjekt.lulu();
    Interface1 interface1 = testObjekt;
    interface1.lala();
  }
}
