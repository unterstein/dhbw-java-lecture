package ba.java.uebungen;

import ba.java.utilities.UtilitiesBeispiele;

import java.io.FileNotFoundException;

public class ExceptionUebung {

  private static class MeineException extends RuntimeException {

    public MeineException(String text) {
      super(text);
    }
  }

  private static void trycatch() {
    try {
      test();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
    } catch (MeineException e) {
      // Bitte immer etwas mit einer Exception machen und nicht einfach schlucken!!
      // e.printStackTrace();
    } catch (Exception e) { // Muss ganz unten stehen!!
      e.printStackTrace();
    }
  }

  private static void test() throws FileNotFoundException, ArrayIndexOutOfBoundsException, NullPointerException {
    if (UtilitiesBeispiele.nextRandomInt() % 2 == 0) {
      throw new RuntimeException("hallo");
    }
    throw new MeineException("Meins");
  }

  public static void main(String[] args) {
    trycatch();
  }

}
