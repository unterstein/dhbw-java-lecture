package ba.java.grundlagen1;

public class Klasse2 extends Klasse1 {

  public Klasse2() {
    super(12);
    System.out.println("Klasse2()");
  }


  public static void main(String[] args) {
    new Klasse2();
  }
}
