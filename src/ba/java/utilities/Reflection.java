package ba.java.utilities;


import ba.java.auto.AudiQFuenf;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

  public static void main(String[] args) throws Exception {
    Class<?> meineAudiKlasse = Class.forName("ba.java.auto.AudiQFuenf");
    Object q5 = meineAudiKlasse.newInstance();

    Method blinkeRechts = meineAudiKlasse.getMethod("blinkeRechts");
    blinkeRechts.invoke(q5);

    Field snr = meineAudiKlasse.getDeclaredField("snr");
    snr.setAccessible(true);
    snr.set(q5, "test");
    System.out.println(snr.get(q5));

//    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("q5"));
//    oos.writeObject(q5);
//    oos.close();

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("q5"));
    Object o = ois.readObject();
    AudiQFuenf q5back = (AudiQFuenf) o;
    System.out.println(q5back.brauchtWartung());
  }
}
