package ba.java.todolist.model;

import ba.java.todolist.HashHelper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
  private String name;
  private String password;
  private List<TodoList> lists;

  public User(String name, String password) {
    this.name = name;
    this.password = HashHelper.hash(password);
    lists = new ArrayList<>();
  }

  public TodoList addTodoList(String name) {
    TodoList result = new TodoList(name);
    lists.add(result);
    return result;
  }

  public boolean login(String name, String password) {
    if (name != null && name.equals(this.name)) {
      return password != null && password.equals(HashHelper.hash(password));
    }
    return false;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
