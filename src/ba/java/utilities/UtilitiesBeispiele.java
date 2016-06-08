package ba.java.utilities;

import java.io.IOException;
import java.util.Random;

public class UtilitiesBeispiele {

  private static Random random = new Random(System.currentTimeMillis() % 14930352);

  private static void utilities() {
    for (int i = 0; i < 10; i++) {
      System.out.println(nextRandomInt());
    }
  }

  public static int nextRandomInt() {
    return random.nextInt();
  }

  private static void system() {
    System.out.println(System.getProperty("line.separator"));
    System.out.println(System.getenv("PATH"));
    try {
      Runtime.getRuntime().exec("say i can speak!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    utilities();
    system();
  }
}
