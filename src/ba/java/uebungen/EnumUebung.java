package ba.java.uebungen;

public class EnumUebung {

  private enum MeinEnum {
    EINS(1),
    ZWEI(2),
    DREI(3),
    VIER(4),;
    private int i;

    MeinEnum(int i) {
      this.i = i;
    }

    public int getI() {
      return i;
    }

    // Warum würde ein setter keinen Sinn machen?
//    public void setI(int i) {
//      this.i = i;
//    }
  }

  public static void main(String[] args) {
    MeinEnum enum1 = MeinEnum.EINS;
    MeinEnum enum2 = MeinEnum.ZWEI;
    MeinEnum enum3 = MeinEnum.DREI;

    System.out.println(enum1.getI());
    MeinEnum testEnum = MeinEnum.EINS;
//    testEnum.setI(2);

    System.out.println(enum1.getI());
  }
}
