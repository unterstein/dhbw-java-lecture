package ba.java.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyStringWrapper implements Comparable<MyStringWrapper> {

  String s;

  public MyStringWrapper(String s) {
    this.s = s;
  }

  @Override
  public int compareTo(MyStringWrapper o) {
    return s.compareTo(o.s);
  }


  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("hallo");
    strings.add("asd");
    strings.add("lblala");
    strings.add("lalala");

    List<Integer> intList = new ArrayList<>();
    intList.add(12);
    intList.add(32);
    intList.add(22);

    List<MyStringWrapper> list = new ArrayList<>();
    list.add(new MyStringWrapper("hallo"));
    list.add(new MyStringWrapper("asd"));
    list.add(new MyStringWrapper("lblala"));
    list.add(new MyStringWrapper("lalala"));

    for (String string : strings) {
      System.out.println(string);
    }

    Collections.sort(strings);
    Collections.sort(intList);
    Collections.sort(list);

    for (String string : strings) {
      System.out.println(string);
    }

    for (Integer integer : intList) {
      System.out.println(integer);
    }
    for (MyStringWrapper myStringWrapper : list) {
      System.out.println(myStringWrapper.s);
    }
  }
}
