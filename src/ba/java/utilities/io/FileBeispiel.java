package ba.java.utilities.io;

import java.io.File;
import java.io.IOException;


public class FileBeispiel {


  public FileBeispiel() {
    // Abstrahiert von Datei und Verzeichnis
    File homeVerzeichnis = new File("/Users/junterstein");
    File präsentation = new File(homeVerzeichnis.getAbsolutePath()
        + "/documents/java12.key");
    // Absolute und relative Namen unterstützt
    File testFile = new File("./test.jar");
    // Abfrage der Datei-/Verzeichnisattribute
    System.out.println(testFile.exists() + ":" + testFile.canRead()
        + ":" + testFile.canWrite());
    // Iterieren über Verzeichnisse
    for (File kind : homeVerzeichnis.listFiles()) {
      if (kind.isFile()) {
        // tue etwas
      }
      if (kind.isDirectory()) {
        // tue etwas anderes
      }
    }
    // Anlegen und Löschen von Dateien und Verzeichnissen
    testFile.delete();
    // mkdir() legt nur den angegebenen Ordner an, wenn der Vater existiert
    // mkdirs() legt alle Ordner an, bis der übergebene Pfad erreict ist
    new File(homeVerzeichnis.getAbsolutePath() + "/mein/ausgedachter/Pfad").mkdirs();
    // Verwalten Temporärer Dateien
    try {
      File temporäreDatei = File.createTempFile("meinProjektName", "meineDateiEndung");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new FileBeispiel();
  }
}
