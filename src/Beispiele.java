import ba.java.auto.AudiQFuenf;
import ba.java.auto.AudiQSieben;
import ba.java.auto.Groesse;
import ba.java.auto.Pkw;

public class Beispiele {

  private AudiQFuenf q5;


  public static void main(String[] args) {
    int i1 = 4;
    long l1 = i1;
    System.out.println(i1);
    System.out.println(l1);

    int i2 = (int) l1;
    System.out.println(i2);

    long l2 = 2_147_483_648L;

    int i3 = (int) l2;
    System.out.println(i3);

    AudiQFuenf q5 = new AudiQFuenf();
    System.out.println(q5);
    q5.anzahlBlinker = 4;
    Pkw pkw = q5;
    System.out.println(pkw);
    pkw.anzahlBlinker = 5;
    AudiQFuenf q52 = (AudiQFuenf) pkw;


    if (pkw instanceof AudiQSieben) {
      System.out.println("Ging gut");
      AudiQSieben q7 = (AudiQSieben) pkw;
    } else {
      System.out.println("Nicht ausfgefuehrt.");
    }


    System.out.println(q52);


    System.out.println(q52.anzahlBlinker);


    int i = 5;
    i += 5; // == i = i + 5
    i *= 5;
    i /= 5;

    boolean a = true;
    String result = a ? "A ist true!" : "A ist nicht true!";

    String result2;
    if (a) {
      result2 = "A ist true";
    } else {
      result2 = "A ist nicht true!";
    }

    String s1 = "Hallo";
    String s2 = new String("Hallo");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    Groesse g = q5;
    System.out.println(g);
    System.out.println(g instanceof AudiQFuenf);
  }

  String einString;
  String andererString;

  void setEinstreing(String einString) {
    ClassA classA1 = new ClassA(1, 2);
    ClassA classA2 = new ClassA(1, 2);
  }

  public final class ClassA {
    private int i1;
    private int i2;

    public ClassA(int i1) {
      this.i1 = i1;
      System.out.println("hi!");
    }

    public ClassA(double i1) {
      super();
      this.i1 = (int) i1;
    }

    public ClassA(int i1, int i2) {
      this(i1);
      this.i2 = i2;
    }

    public String getDetails() {
      return "";
    }

  }

  public class ClassB extends ClassA {

    public ClassB() {
      super(1);
    }

    @Override
    public String getDetails() {
      return super.getDetails();
    }
  }

  class Rechteck {
    protected int breite;
    protected int laenge;

    public Rechteck() {
    }

    public Rechteck(int breite, int laenge) {
      this.breite = breite;
      this.laenge = laenge;
    }

    public int getFlaeche() {
      return laenge * breite;
    }


    public int getBreite() {
      return breite;
    }

    public void setBreite(int breite) {
      this.breite = breite;
    }

    public int getLaenge() {
      return laenge;
    }

    public void setLaenge(int laenge) {
      this.laenge = laenge;
    }
  }

  class Quadrat extends Rechteck {
    public Quadrat() {
      super();
    }

    public Quadrat(int seitenLaenge) {
      super(seitenLaenge, seitenLaenge);
    }

    public void setBreite(int breite) {
      this.breite = breite;
      this.laenge = breite;
    }

    public void setLaenge(int laenge) {
      setBreite(laenge);
    }
  }
}
