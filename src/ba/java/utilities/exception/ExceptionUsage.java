package ba.java.utilities.exception;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by junterstein on 16/06/17.
 */
public class ExceptionUsage {

  public ExceptionUsage() throws BuchhaltungFehlgeschlagenException {
    first();
    first();
    first();
    first();
    first();
    first();
    first();
    first();
    first();
    first();
  }

  public static void main(String[] args) throws BuchhaltungFehlgeschlagenException {
    new ExceptionUsage();
    System.out.println("Sinnvoll beendet");
  }

  private void first() {
    // Berechne alle Gehälter
    try {
      meldeBuchhaltung();
    } catch (BuchhaltungFehlgeschlagenException e) {
      System.out.println("UnsereException");
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (Exception e) {
      System.out.println("meh!");
    }
    geheOnlineBanking();
    System.out.println("Gehälter überweisen");
  }

  private Random random = new Random();

  private void geheOnlineBanking() throws RuntimeException{
    throw new RuntimeException("haha");
  }


  private void verwener() throws FileNotFoundException {
    try {
      meldeBuchhaltung();
    } catch (BuchhaltungFehlgeschlagenException e) {
      e.printStackTrace();
    }
  }

  private void meldeBuchhaltung() throws BuchhaltungFehlgeschlagenException, FileNotFoundException {
    if (random.nextInt() % 2 == 0) {
      throw new BuchhaltungFehlgeschlagenException("muh", 12);
    } else {
      throw new FileNotFoundException();
    }
  }
}
