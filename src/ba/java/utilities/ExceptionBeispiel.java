package ba.java.utilities;

import java.io.FileNotFoundException;

public class ExceptionBeispiel {

  public static void main(String[] args) {

    runtimeExceptionMethod();
    System.out.println("hier wird Geld eingezogen");
  }

  private static void runtimeExceptionMethod() throws RuntimeException {
    throw new RuntimeException("lalala");
  }

  private static void doSomething() throws FileNotFoundException, MeineException, MeineSpeziellereException {
    throw new MeineSpeziellereException("Fehler 4711");
  }

  private static class MeineSpeziellereException extends MeineException {

    public MeineSpeziellereException(String fehlerCode) {
      super(fehlerCode);
    }
  }

  private static class MeineException extends Exception {
    private String fehlerCode;

    public MeineException(String fehlerCode) {
      this.fehlerCode = fehlerCode;
    }

    @Override
    public String toString() {
      return "MeineException{" +
          "fehlerCode='" + fehlerCode + '\'' +
          '}';
    }
  }
}
