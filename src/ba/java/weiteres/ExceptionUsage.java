package ba.java.weiteres;


import java.io.File;

public class ExceptionUsage {

  private void lala1() throws UnsereException {
    throw new UnsereException(1);
  }

  private void lala2() throws UnsereException {
    lala1();
  }

  private void bezahleRechnungen() {
    throw new RuntimeException();
  }

  private void lala() throws UnsereException {
    bezahleRechnungen();
  }

  private void bezahleGehaelter() {
    System.out.println("Gehälter bezahlt.");
  }

  private int magic() {
    File file = null;
    try {
      file = new File("/lala");
      // lese datei
      // mache was mit inhalt
    } catch (Exception e) {

    } finally {
      if (file != null) {
        try {
//          file.close();
          // lala
        } catch (Exception e) {
          e.printStackTrace();
          // nicht notwendig, weil es nie auftritt
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {

    ExceptionUsage bank = new ExceptionUsage();

    try {
      bank.bezahleRechnungen();
    } catch (Exception e) {
      e.printStackTrace();
    }
    bank.bezahleGehaelter();
  }
}
