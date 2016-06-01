package ba.java.weiteres;

import java.util.HashMap;
import java.util.Map;

public class SynchronizedBeispiel {

  Map<String, Object> exampleMap = new HashMap<>();

  private synchronized void methodSynchronized() {
    System.out.println("hallo");
  }

  public void innerSynchronized() {
    // Variante 1
    synchronized(this) {
      System.out.println("lolo");
    }

    // Variante 2
    synchronized (exampleMap.get(4711)) {
      System.out.println("lala");
    }
  }

}
