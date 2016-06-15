package ba.java.todolist.serialization;

import ba.java.todolist.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

class BinarySerializer implements Serializer {

  @Override
  public void save(Map<String, User> users) {
    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("datenbank"))) {
      objectOutputStream.writeObject(users);
    } catch (IOException o_O) {
      o_O.printStackTrace();
    }
  }

  @Override
  public Map<String, User> load() {
    try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("datenbank"))) {
      return (Map<String, User>) objectInputStream.readObject();
    } catch (Exception o_O) {
      o_O.printStackTrace();
    }
    return null;
  }
}
