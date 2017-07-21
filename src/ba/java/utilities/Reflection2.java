package ba.java.utilities;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection2 {




  public static void main(String[] args) throws Exception {

    Class q5class = Class.forName("ba.java.auto.AudiQFuenf");
    Object q5obj = q5class.newInstance();
    System.out.println(q5obj);
    Method brauchtWartung = q5class.getMethod("hupe");
    brauchtWartung.invoke(q5obj);


    MeinePrivateVariable meinePrivateVariable = new MeinePrivateVariable();
    Field i = meinePrivateVariable.getClass().getDeclaredField("i");
    System.out.println(i);
    i.setAccessible(true);
    System.out.println(i.get(meinePrivateVariable));
    i.set(meinePrivateVariable, 12);
    System.out.println(i.get(meinePrivateVariable));

//    new ObjectOutputStream(new FileOutputStream("q5.blob")).writeObject(q5obj);
    Object q5back = new ObjectInputStream(new FileInputStream("q5.blob")).readObject();
    System.out.println(q5back);
  }
}
