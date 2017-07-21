package ba.java.oo.interfaces;

public class KindPerson extends Person implements LaufzeitFlag {

  public static void main(String[] args) {
    KindPerson person = new KindPerson();
    System.out.println(person instanceof KindPerson);
    System.out.println(person instanceof Person);
    System.out.println(person instanceof Object);
    System.out.println(person instanceof SpeziellerAngestellter);
    System.out.println(person instanceof Angestellter);

    Angestellter angestellter = person;
    System.out.println(angestellter);

    System.out.println(KonstantenInterface.FIRST);

    if (angestellter instanceof LaufzeitFlag) {
      // do something very special!
    }
  }
}
