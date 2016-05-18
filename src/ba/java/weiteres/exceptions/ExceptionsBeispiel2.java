package ba.java.weiteres.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsBeispiel2 {

  public static void main(String[] args) {
    FileInputStream fileInputStream = null;
    try {
      new FileInputStream(new File("asd"));
    } catch (IOException e) {
    } finally {
      if (fileInputStream != null) {
        try {
          fileInputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    try (FileInputStream fis = new FileInputStream(new File("asd"))) {
      // lese Inhalt
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private static void doSomething() throws FileNotFoundException {
    throw new RuntimeException("kaputt");
  }
}
