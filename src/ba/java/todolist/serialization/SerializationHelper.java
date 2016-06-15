package ba.java.todolist.serialization;

import ba.java.todolist.model.User;

import java.util.Map;

public class SerializationHelper {

  private SerializationMode mode;

  public SerializationHelper(SerializationMode mode) {
    this.mode = mode;
  }

  public void save(Map<String, User> users) {
    mode.getSerializer().save(users);
  }

  public Map<String, User> load() {
    return mode.getSerializer().load();
  }
}
