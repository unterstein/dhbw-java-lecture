package ba.java.utilities;

import ba.java.auto.AudiQFuenf;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Vector;

public class ReflectionBeispiel {

  private void reflectionBeispiel() {

    try {
      String meinKlassenName = "ba.java.auto.AudiQFuenf";
      Class<?> meineKlasse = Class.forName(meinKlassenName);
      Object meinObjekt = meineKlasse.newInstance();
      AudiQFuenf meinAudi = (AudiQFuenf) meinObjekt;
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      String str = "Test";
      Class<?> clazz = str.getClass();
      Method[] declaredMethods = clazz.getDeclaredMethods();
      for (Method m : declaredMethods) {
        System.out.println(m.getParameterTypes());
      }
      Method m = clazz.getDeclaredMethod("length");
      Object ret = m.invoke(str);
      System.out.println(ret);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      Class<?> aClass = Class.forName("java.util.Vector");
      for (Field field : aClass.getDeclaredFields()) {
        System.out.println(field);
      }
      Vector vector = new Vector();
      System.out.println("count: " + vector.size());

      Field elementCount = aClass.getDeclaredField("elementCount");
      elementCount.setAccessible(true);
      elementCount.setInt(vector, 12);

      System.out.println("count: " + vector.size());
    } catch (Exception o_O) {
      o_O.printStackTrace();
    }

  }

  public static void main(String[] args) {
    new ReflectionBeispiel().reflectionBeispiel();
  }
}
