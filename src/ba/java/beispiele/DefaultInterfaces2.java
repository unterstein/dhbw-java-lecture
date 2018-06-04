package ba.java.beispiele;

public class DefaultInterfaces2 {


  interface Person {
    default int getPrivatTelefon() {
      return 4711;
    }
  }

  interface Mitarbeiter {
    int getTelefon();

    default int getPrivatTelefon() {
      return getTelefon();
    }
  }

  static class Mensch implements Mitarbeiter, Person {

    @Override
    public int getTelefon() {
      return 42;
    }

    @Override
    public int getPrivatTelefon() {
      return 21;
    }
  }

  public static void main(String[] args) {
    Mensch mensch = new Mensch();
    System.out.println(mensch.getTelefon());
    System.out.println(mensch.getPrivatTelefon());
  }
}
