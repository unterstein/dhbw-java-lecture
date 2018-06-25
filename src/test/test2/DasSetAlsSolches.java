package test.test2;

import ba.java.auto.Pkw;
import jdk.nashorn.api.tree.ObjectLiteralTree;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class DasSetAlsSolches {

  public static void main(String[] args) throws Exception {
    Set<String> unserSet = new HashSet<>();
    unserSet.add("unserElement");
    unserSet.add("unserElement");
    unserSet.add("unserElement");
    unserSet.add("unserElement");
    unserSet.add("unserElement");
    unserSet.add("unserElement1");
    unserSet.add("unserElement2");
    unserSet.add("unserElement3");
    System.out.println(unserSet.size());
    System.out.println(unserSet.toString());

    Map<String, String> unsereMap = new HashMap<>();
    unsereMap.put("key1", "hallo");
    unsereMap.put("key1", "hey");
    unsereMap.put("key1", "ho");
    unsereMap.put("key1", "lets");
    unsereMap.put("key1", "go");
    System.out.println(unsereMap.get("key1"));

    Pkw pkw = new Pkw();
    pkw.anzahlBlinker = 8;


    Object myFancyObject = pkw;
    for (Method method : myFancyObject.getClass().getDeclaredMethods()) {
      System.out.println(method.getName());
    }

    for (Field field : myFancyObject.getClass().getDeclaredFields()) {
      System.out.println(field.getName());
    }

    Field anzahlBlinker = myFancyObject.getClass().getDeclaredField("anzahlBlinker");
    System.out.println(anzahlBlinker.get(myFancyObject));

    Method hupe = myFancyObject.getClass().getDeclaredMethod("hupe");
    hupe.invoke(myFancyObject);

    Object meinPkw = Class.forName("ba.java.auto.Pkw").newInstance();
    hupe.invoke(meinPkw);

    Field meinPrivateInt = myFancyObject.getClass().getDeclaredField("meinPrivateInt");
    meinPrivateInt.setAccessible(true);
    System.out.println(meinPrivateInt.get(myFancyObject));
    meinPrivateInt.set(myFancyObject, 13);
    System.out.println(meinPrivateInt.get(myFancyObject));

    Date d = new Date(2007, 1, 1);
    System.out.println(d);

    BigDecimal bigDecimal = new BigDecimal("10000000000000000000000");
    BigDecimal bigDecimal2 = new BigDecimal("10000000000000000000000");
    System.out.println(bigDecimal.add(bigDecimal2));

    new BigDecimal("0.000000000000000000000000000000000000000000001");
  }
}
