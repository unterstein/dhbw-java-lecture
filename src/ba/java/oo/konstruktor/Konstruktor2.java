package ba.java.oo.konstruktor;

import java.util.Arrays;

public class Konstruktor2 extends Konstruktor {

  public Konstruktor2() {
    super(10);
    System.out.println("Konstruktor2()");
  }

  public Konstruktor2(int i) {
    super(i);
    System.out.println("Konstruktor2(i)");
    super.irgendwas = 12;
  }

  public static void main(String args[]) {
    char[] test = {'h', 'a', 'l'};
    String s = Arrays.toString(test);
    System.out.println(s);
    String test2 = "hallo";
    System.out.println(test2.indexOf("ll"));
    new Konstruktor2();
    System.out.println("----");
    new Konstruktor2(2);
  }


}
