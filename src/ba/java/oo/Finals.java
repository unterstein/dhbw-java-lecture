package ba.java.oo;

public class Finals {
  public Finals() {
    final int[] array = new int[5];
    array[0] = 5;
    array[0] = 6;
    for (int s : array) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    new Finals();
  }
}
