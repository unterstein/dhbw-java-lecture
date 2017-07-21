package ba.java.uebungen;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Recap {
  static interface ExampleInterface {
    public void lala(String s);
  }

  static class MyClass implements ExampleInterface {

    @Override
    public void lala(String s) {

    }
  }

  public static String duplicate(String input) {
    return input + input;
  }

  public static void main(String[] args) {
    ExampleInterface test = new ExampleInterface() {

      @Override
      public void lala(String s) {
        System.out.println("1" + s);
      }
    };
    ExampleInterface test2 = s -> {
      System.out.println("2" + s);
    };
    test.lala("lala");
    test2.lala("lala");

    List<Integer> integers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      integers.add(i);
    }
    List<String> meineListe = integers.stream()
        .filter(i -> i % 2 == 0)
        .map(i -> "Hallo" + i)
        .map(Java8Recap::duplicate)
        .map(i -> duplicate(i))
        .collect(Collectors.toList());

    System.out.println(meineListe.stream().anyMatch(element -> element.length() == 5));
    boolean contains5chars = false;
    for (String s : meineListe) {
      if(s.length() == 5) {
        contains5chars = true;
        break;
      }
    }
    Optional<String> optional = meineListe.stream().reduce((x, y) -> x + y);
    if(optional.isPresent()) {
      String result = optional.orElse("IrgendeinDefault");
    }
  }
}
