package ba.java.utilities;

import java.util.Random;

public class UtilitesBeispiele {

  private static void utilities() {
    Random random = new Random(System.currentTimeMillis() % 14930352);
    for (int i = 0; i < 10; i++) {
      System.out.println(random.nextInt());
    }
  }

  private static void system() {
    System.out.println(System.getProperty("line.separator"));
    System.out.println(System.getenv("path"));
     Runtime.getRuntime().exec("say i can speak!");
  }

  public static void main(String[] args) {
    utilities();
    system();
  }
}
