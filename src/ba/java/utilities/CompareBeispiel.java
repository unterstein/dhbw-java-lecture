package ba.java.utilities;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CompareBeispiel {
  public static void main(String[] args) {

    List<StringWrapper> list = new ArrayList<>();
    list.add(new StringWrapper("c"));
    list.add(new StringWrapper("a"));
    list.add(new StringWrapper("d"));
    list.add(new StringWrapper("b"));

    Collections.sort(list);

    for (StringWrapper stringWrapper : list) {
      System.out.println(stringWrapper.string);
    }
  }

  private static class StringWrapper implements Comparable<StringWrapper> {
    private String string;

    public StringWrapper(String string) {
      this.string = string;
    }

    @Override
    public int compareTo(StringWrapper o) {
//      return Math.random();
      return 12;
    }
  }
}
