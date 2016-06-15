package ba.java.todolist.model;

import ba.java.todolist.SerializationHelper;

import java.util.HashMap;
import java.util.Map;

public class App {

  private Map<String, Benutzer> benutzer;

  public App() {
    benutzer = new HashMap<>();
  }

  public Benutzer register(String name, String password) {
    if (benutzer.containsKey(name)) {
      return null;
    }
    Benutzer result = new Benutzer(name, password);
    benutzer.put(name, result);
    return result;
  }

  public Benutzer login(String name, String password) {
    Benutzer benutzer = this.benutzer.get(name);
    if (benutzer != null && benutzer.login(name, password)) {
      return benutzer;
    }
    return null;
  }

  public void load() {
    benutzer = SerializationHelper.load();
  }

  public void save() {
    SerializationHelper.save(benutzer);
  }

  public void clear() {
    benutzer.clear();
  }

  public int userCount() {
    return benutzer.keySet().size();
  }
}
