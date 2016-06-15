package ba.java.todolist;

import ba.java.todolist.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class SerializationHelper {

  public static void save(Map<String, User> users) {
    saveBinary(users);
  }

  public static Map<String, User> load() {
    return loadBinary();
  }

  public static void saveBinary(Map<String, User> users) {
    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("datenbank"))) {
      objectOutputStream.writeObject(users);
    } catch (IOException o_O) {
      o_O.printStackTrace();
    }
  }

  private static Map<String, User> loadBinary() {
    try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("datenbank"))) {
      return (Map<String, User>) objectInputStream.readObject();
    } catch (IOException o_O) {
      o_O.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }
}
