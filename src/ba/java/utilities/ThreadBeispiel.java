package ba.java.utilities;

public class ThreadBeispiel {

  public ThreadBeispiel() {
    Runnable codeImThread = new Runnable() {

      @Override
      public void run() {
        while (true) {
          System.out.println("als runnable");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };
    Thread thread1 = new Thread(codeImThread);
    Thread thread2 = new Thread() {
      @Override
      public void run() {
        while (true) {
          System.out.println("direkt überschrieben");
          try {
            Thread.sleep(300);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };
    thread1.start();
    thread2.start();
  }

  public static void main(String[] args) {
    new ThreadBeispiel();
  }
}
