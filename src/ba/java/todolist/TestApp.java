package ba.java.todolist;

import ba.java.todolist.model.App;
import ba.java.todolist.model.User;
import ba.java.todolist.model.TodoList;
import ba.java.todolist.serialization.SerializationMode;

public class TestApp {

  public static void main(String[] args) {
    App app = new App(SerializationMode.BINARY);

    User johannes = app.register("Johannes", "asdasd");

    TodoList einkaufen = johannes.addTodoList("Einkaufen");
    einkaufen.addTodo("Milch");
    einkaufen.addTodo("Butter");
    einkaufen.addTodo("Wurst");

    TodoList baumarkt = johannes.addTodoList("Baumarkt");
    baumarkt.addTodo("Hammer");
    baumarkt.addTodo("Nagel");
    baumarkt.addTodo("Leiter");

    // save
    app.save();
    // clear
    app.clear();
    // load again
    app.load();
    // test what happens
    System.out.println(app.userCount());
  }
}
