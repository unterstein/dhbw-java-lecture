package ba.java.weiteres;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Java7Beispiele {

  public void tryWithResouces() {
    try (InputStream fileInput = new FileInputStream(new File("pfad/zur/meiner/Datei"))) {
      // Hier wird die Datei eingelesen
    } catch (Exception e) {
      // Und hier der Fehler behandelt
    }
  }

  public void projectCoin() {
    List<Integer> integerList = new LinkedList<Integer>();
    Map<Integer, List<Integer>> integerZuIntegerListMap = new HashMap<Integer, List<Integer>>();
    Map<Integer, Map<Integer, List<Integer>>> blabla = new HashMap<Integer, Map<Integer, List<Integer>>>();
    // Das ist zu viel! Daher ProjectCoin ab Java7
    // Der Compiler weiß schon am Besten, was ich initialisieren will,
    // kümmert er sich auch um die Generic Handling
    List<Integer> integerList7 = new LinkedList<>();
    Map<Integer, List<Integer>> integerZuIntegerListMap7 = new HashMap<>();
    Map<Integer, Map<Integer, List<Integer>>> blabla7 = new HashMap<>();
  }

}
