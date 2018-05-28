package ba.java;

import ba.java.auto.AudiQFuenf;
import ba.java.auto.AudiQSieben;
import ba.java.auto.Groesse;
import ba.java.auto.Pkw;

import java.time.*;
import java.util.Timer;

public class TestClass {

  String x;
  String y;

  public TestClass() {

  }

  public static void main(String[] args) throws InterruptedException {

    int i = 4;
    long l = i;
    System.out.println(l);
    int i2 = (int) l;
    System.out.println(i2);
    long superlong = 2_148_483_747L;
    int i3 = (int) superlong;
    System.out.println(i3);

    AudiQFuenf q5 = new AudiQFuenf();
    Pkw pkw = q5;

    System.out.println(q5);
    System.out.println(pkw);
    AudiQFuenf q52 = (AudiQFuenf) pkw;
    System.out.println(q52);
//    AudiQSieben q7 = (AudiQSieben) pkw;
//    System.out.println(q7);

    String s = "lala";
    s += "lolo";
    System.out.println(s);


    // String s = a ? b : c
    boolean a = 1 == 1;

    String result = a ? "A ist true!" : "A ist falsch!";
    System.out.println(result);

    System.out.println(q5 + " << Das ist ein Q5!");
    System.out.println("Hi " + q5 + q5 + " Ho");

    AudiQFuenf test = new AudiQFuenf();

    Object object = test;


    if (object instanceof Groesse) {
      Groesse groesse = (Groesse) object;
      System.out.println(groesse.getBreite());
    }

    String lala = "lkadslas";
    Object o2 = lala;
    System.out.println(o2 instanceof Groesse);

  }
}
