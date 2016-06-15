package ba.java.todolist.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TodoList implements Serializable {

  private String name;
  private List<Todo> todo;

  public TodoList() {
    // Default Constructor is needed or JAXB
  }

  public TodoList(String name) {
    this.name = name;
    todo = new ArrayList<>();
  }

  public Todo addTodo(String name) {
    Todo result = new Todo(name);
    todo.add(result);
    return result;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
