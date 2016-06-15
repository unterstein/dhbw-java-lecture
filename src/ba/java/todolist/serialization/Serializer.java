package ba.java.todolist.serialization;

import ba.java.todolist.model.User;

import java.util.Map;

public interface Serializer {

  static String DATABASE_FILE = "database";

  public void save(Map<String, User> users);

  public Map<String, User> load();
}
