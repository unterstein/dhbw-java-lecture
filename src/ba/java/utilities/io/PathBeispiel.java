package ba.java.utilities.io;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class PathBeispiel {

  public static void main(String[] args) {
    File file = new File("mein/ausgedachter/Pfad");
    File newFile = new File(file.getAbsolutePath() + "../../was/lustiges/dran"); // <-- unüblich
    Path path = Paths.get(file.getAbsolutePath(), "../../was/lustiges/dran");
    Path parent = path.getParent();
    File parentFile = parent.toFile();
    Path parent2 = parentFile.toPath();
  }
}
