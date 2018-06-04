package ba.java.beispiele;

public class WrapperSamples {

  private static int defaultI;
  private static Integer defaultI2;

  public static void main(String[] args) {
    int i = 15;
    Integer i1 = Integer.valueOf(i);
    Integer i2 = Integer.parseInt("15");

    Integer i3 = 15; // Integer.valueOf(15); << auto boxing
    Integer i4 = i; // Integer.valueOf(i); << auto boxing

    int i5 = i4.intValue();
    int i6 = i4; // i4.intValue(); << auto unboxing

    print(i5);
    print(i4); // auto unboxing: print(i4.intValue());

    print(defaultI);
    print(defaultI2.intValue());

    i4.set
  }

  private static void print(int o) {
    System.out.println(o);
  }
}
