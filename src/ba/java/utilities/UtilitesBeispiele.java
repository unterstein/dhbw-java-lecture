package ba.java.utilities;

import java.util.Random;

public class UtilitesBeispiele {

  private void utilities() {
    Random random = new Random(System.currentTimeMillis() % 14930352);
    for (int i = 0; i < 10; i++) {
      System.out.println(random.nextInt());
    }
  }

  private void system() {
    System.getProperty("");
    // Runtime.getRuntime().exec(command)
  }
}
