package ba.java.todolist;

import ba.java.todolist.model.Benutzer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class SerializationHelper {

  public static void save(Map<String, Benutzer> benutzer) {
    saveBinary(benutzer);
  }

  public static Map<String, Benutzer> load() {
    return loadBinary();
  }

  public static void saveBinary(Map<String, Benutzer> benutzer) {
    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("datenbank"))) {
      objectOutputStream.writeObject(benutzer);
    } catch (IOException o_O) {
      o_O.printStackTrace();
    }
  }

  private static Map<String, Benutzer> loadBinary() {
    try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("datenbank"))) {
      return (Map<String, Benutzer>) objectInputStream.readObject();
    } catch (IOException o_O) {
      o_O.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }
}
