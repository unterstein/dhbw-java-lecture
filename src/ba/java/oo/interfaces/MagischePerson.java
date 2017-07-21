package ba.java.oo.interfaces;

public class MagischePerson implements MagischesInterface, MagischesInterface2 {

  @Override
  public int getTelefonnummer() {
    return 123;
  }

  @Override
  public int getTelefonnummer2() {
    return 123;
  }


  public static void main(String[] args) {
    MagischePerson person = new MagischePerson();

    System.out.println(person.getTelefonnummer());
    System.out.println(person.getTelefonnummer2());
  }
}
