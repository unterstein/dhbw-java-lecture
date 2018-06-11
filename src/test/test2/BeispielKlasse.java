package test.test2;

import ba.java.auto.AudiQFuenf;
import ba.java.weiteres.generics.Liste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

public class BeispielKlasse {

  private static String string1 = null;

  public static void main(String[] args) {
//    String s1 = "hallo";
//    String s2 = "hallo";
//    String s3 = new String(s2);
//    System.out.println(s2 == s3);
//    System.out.println(s2.equals(s3));
//    System.out.println(s1.equals(s3));
//
////    String trimmed = "   lala   \t\n\r".trim();
////    System.out.print("-" + trimmed + "-");
////    System.out.print("-" + trimmed + "-");
//
//
//    String s = "Hallo " + new Integer(123).toString();
//    String ss = "Hallo " + new AudiQFuenf().toString();
//
//    System.out.println("Hallo".equals(string1));
//    System.out.println(string1.equals("Hallo"));

    try {
      System.out.println("vorher");
      methodeMitException();
      System.out.println("nachher");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutofBounds");
    } catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException");
    } catch (AccessDeniedException e) {
      System.out.println("AccessDeniedException");
    } catch (MeineException e) {
      System.out.println(e.kundeNummer + " hat einen Fehler verursacht.");
    } catch (Exception e) {
      System.out.println("Fehler passiert: " + e.getMessage());
      e.printStackTrace();
    }


//    methodeMitException();
//    System.out.println("Weiteren lustigen Aktionen.");
//    System.out.println(">> Semantisches Wichtiges <<");
//
//    System.out.println("Programm regulär beendet.");
    System.out.println("vorher");
//    dieseRuntimeException("s", "b");
    System.out.println("nachher");

//    InnerEnum e1 = ;
    System.out.println(InnerEnum.A.i);
    InnerEnum.A.i = 15;
    System.out.println(InnerEnum.A.i);

    List<Integer> ersteListe = new ArrayList<Integer>();
    ersteListe.add(1);
    ersteListe.add(2);
    printListe(ersteListe);

    List<Double> zweiteListe = new ArrayList<Double>();
    zweiteListe.add(1.0);
    zweiteListe.add(2.0);
    printListe(zweiteListe);

    List<AudiQFuenf> dritteListe = new ArrayList<AudiQFuenf>();
//    printListe(dritteListe);
  }

  private static void printListe(List<? extends Number> liste) {
    for (Number s : liste) {
      System.out.println(s);
    }
  }

  static enum InnerEnum {
    A(1), B(2);

    int i;

    InnerEnum(int i) {
      this.i = i;
    }
  }

  static void dieseRuntimeException(String s1, String s2) throws RuntimeException {
    throw new IllegalArgumentException();
  }

  private static void magic() {

    File file = null;
    try {
      file = new File("meineDatei.txt");
      String fileInhalt = leseDatei(file);
    } catch (Exception e) {

    } finally {
      if(file != null) {
        try {
          schliesseDatei(file);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  static void schliesseDatei(File file) throws IOException {

  }

  static String leseDatei(File file) {
    return "";
  }

  static class MeineException extends Exception {
    int kundeNummer;

    public MeineException(String message, int kundeNummer) {
      super(message);
      this.kundeNummer = kundeNummer;
    }
  }

  private static int methodeMitException2() throws Exception {
    throw new MeineException("Meine Nachricht!", 4711);
  }

  private static int methodeMitException() throws Exception {
    try {
      return methodeMitException2();
    } catch (Exception e){
      e.printStackTrace();
      // entweder problem beheben
      throw e;
      // oder exception weiter schmeissen
    }
  }
}
