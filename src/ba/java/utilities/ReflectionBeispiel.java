package ba.java.utilities;

import ba.java.auto.AudiQFuenf;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Vector;

public class ReflectionBeispiel {

  private void reflectionBeispiel() {

    try {
      String meinKlassenName = "ba.java.auto.AudiQFuenf";
      Class<?> meineKlasse = Class.forName(meinKlassenName);
      Object meinObjekt = meineKlasse.newInstance(); // Funktioniert nur mit Default-Konstruktor
      AudiQFuenf meinAudi = (AudiQFuenf) meinObjekt;
      System.out.println(meinAudi.anzahlBlinker);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("--------");
    try {
      String str = "Test";
      Class<?> clazz = str.getClass();
      Method[] declaredMethods = clazz.getDeclaredMethods();
      for (Method m : declaredMethods) {
        System.out.println(m.getName() + "(" + Arrays.toString(m.getParameterTypes()) + ")");
      }
      Method m = clazz.getDeclaredMethod("length");
      Object ret = m.invoke(str);
      System.out.println(ret);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("--------");

    try {
      Class<?> aClass = Class.forName("java.util.Vector");
      for (Field field : aClass.getDeclaredFields()) {
        System.out.println(field);
      }
      Vector vector = new Vector();
      System.out.println("count: " + vector.size());

      Field elementCount = aClass.getDeclaredField("elementCount");
      elementCount.setAccessible(true); // try it without this line :)
      elementCount.setInt(vector, 12); // oooooopppsss!

      System.out.println("count: " + vector.size());
    } catch (Exception o_O) {
      o_O.printStackTrace();
    }

  }

  public static void main(String[] args) {
    new ReflectionBeispiel().reflectionBeispiel();
  }
}
