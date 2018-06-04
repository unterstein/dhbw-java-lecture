package ba.java.beispiele;

public class DefaultInterfaces {

  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(person.getTelefon());
    System.out.println(new Person2().getTelefon());
  }

  static interface Interface1 {

    default int getTelefon() {
      return 21;
    }
  }

  static interface Interface2 {
  }

  static class Person2  implements Interface1 {

  }

  static class Person implements Interface1, Interface2 {

    @Override
    public int getTelefon() {
      return 42;
    }
  }
}
