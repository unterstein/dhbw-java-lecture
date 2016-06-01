package ba.java.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharWriterBeispiel {

  private void charWriter() {
    FileWriter fw = null;
    BufferedWriter bw = null;
    try {
      String s;
      fw = new FileWriter("buffer.txt");
      bw = new BufferedWriter(fw);
      for (int i = 1; i <= 10000; ++i) {
        s = "Dies ist die " + i + ". Zeile";
        bw.write(s);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      // Java Version < 7 Bedarf etwas
      // mehr aufwand zum stream closen
      try {
        if (bw != null) {
          bw.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
      try {
        if (fw != null) {
          fw.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    // Java >= 7
    try (FileWriter fw2 = new FileWriter("buffer.txt");
         BufferedWriter bw2 = new BufferedWriter(fw);
    ) {
      // ...
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private void charReader() {
    String line = null;
    try (BufferedReader br =
             new BufferedReader(new FileReader("config.sys"))) {
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
