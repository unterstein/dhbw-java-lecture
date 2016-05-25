package ba.java.oo.innerclasses;

public class OuterClass {

  private int meinInt;

  private String meinString;


  public class InnerClass {
    private int meinInt;

    public InnerClass(int meinInt) {
      this.meinInt = meinInt;
    }

    private void printTheInts() {
      System.out.println("Inner:" + meinInt + ", outer: " + OuterClass.this.meinInt + "_" + meinString);
    }
  }

  public static class StaticInnerClass {
    public StaticInnerClass() {
//      meinInt; <- Geht nicht!
    }
  }
}
