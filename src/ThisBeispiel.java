public class ThisBeispiel {

  private String einString;

  public void printString() {
    System.out.println(einString);
  }

  public void setEinString(String einString) {
    this.einString = einString;
  }


  private static class Mensch {

    private String name;
    private int groesse;

    public Mensch() {
      super();
      System.out.println("Mensch()");
    }

    public Mensch(String name) {
      this();
      System.out.println("Mensch(String name)");
      this.name = name;
    }

    public Mensch(String name, int groesse) {
      this(name);
      System.out.println("Mensch(String name, int groesse)");
      this.groesse = groesse;
    }
  }

  private static class Kind extends Mensch {

  }


  private static class Rechteck {
    int laenge;
    int breite;

    public Rechteck() {
    }

    public Rechteck(int laenge) {
      this.laenge = laenge;
    }

    public Rechteck(int laenge, int breite) {
      this(laenge);
      this.breite = breite;
    }

    public int getLaenge() {
      return laenge;
    }

    public void setLaenge(int laenge) {
      this.laenge = laenge;
    }

    public int getBreite() {
      return breite;
    }

    public void setBreite(int breite) {
      this.breite = breite;
    }
  }

  private static class Quadrat extends Rechteck {

    public Quadrat(int laenge) {
      super(laenge, laenge);
    }

    public void setLaenge(int laenge) {
      super.setLaenge(laenge);
      super.setBreite(laenge);
    }

    @Override
    public void setBreite(int breite) {
      super.setLaenge(breite);
      super.setBreite(breite);
    }
  }

  public static void main(String[] args) {
    Quadrat quadrat = new Quadrat(4);
  }
}
