package ba.java.todolist.model;

import ba.java.todolist.SerializationHelper;

import java.util.HashMap;
import java.util.Map;

public class App {

  private Map<String, User> users;

  public App() {
    users = new HashMap<>();
  }

  public User register(String name, String password) {
    if (users.containsKey(name)) {
      return null;
    }
    User result = new User(name, password);
    users.put(name, result);
    return result;
  }

  public User login(String name, String password) {
    User user = this.users.get(name);
    if (user != null && user.login(name, password)) {
      return user;
    }
    return null;
  }

  public void load() {
    users = SerializationHelper.load();
  }

  public void save() {
    SerializationHelper.save(users);
  }

  public void clear() {
    users.clear();
  }

  public int userCount() {
    return users.keySet().size();
  }
}
