package ba.java.oo.innerclasses;

import ba.java.auto.BodenFahrzeug;
import ba.java.auto.Pkw;
import ba.java.oo.interfaces.PrivatPerson;

public class NewOuterClass {
  InnerClass innerClass;
  String state = "";

  public void lala() {
    innerClass = new InnerClass();
    innerClass.eins = "lala";
    innerClass.zwei = "lolo";

    class TestClass {
      int a;
      int b;
    }
    TestClass test = new TestClass();
    test.a = 12;
    test.b = 13;
    System.out.println(test.a);
    System.out.println(test.b);



    BodenFahrzeug bfz = new Pkw() {

      @Override
      public void blinkeRechts() {
        super.blinkeRechts();
        System.out.println("lala");
      }
    };

    BodenFahrzeug bodenFahrzeug = new BodenFahrzeug() {

      @Override
      public double getBreite() {
        return 123;
      }

      @Override
      public double getHöhe() {
        return 345;
      }

      @Override
      public double getLaenge() {
        return 567;
      }
    };

    class MyPrivatePrivatPerson implements PrivatPerson {

      @Override
      public int getTelefon() {
        return 123;
      }
    }
    MyPrivatePrivatPerson privatePrivatPerson = new MyPrivatePrivatPerson();

    PrivatPerson privatPerson = new PrivatPerson() {

      String state;

      @Override
      public int getTelefon() {
        NewOuterClass.this.state = "wurst";
        return 123;
      }
    };
  }

  private class InnerClass {
    private String eins;
    private String zwei;

    void clearState() {
      state = "lala";
    }
  }

  private static class InnerClass2 {
    private double x;
    private int y;

    void lala() {
//      state = "ala";
    }
  }


  public static void main(String[] args) {
    NewOuterClass newOuterClass = new NewOuterClass();
    newOuterClass.lala();

    System.out.println(newOuterClass.innerClass.eins);
    System.out.println(newOuterClass.innerClass.zwei);
    System.out.println(newOuterClass.state);
    newOuterClass.innerClass.clearState();
    System.out.println(newOuterClass.state);
  }

}
