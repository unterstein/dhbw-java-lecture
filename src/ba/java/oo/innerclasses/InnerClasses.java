package ba.java.oo.innerclasses;

public class InnerClasses {

  private String outerString;
  private int einInt;

  class InnerClass {
    private String innerString;
    private int einInt;

    public InnerClass(String innterString, int einInt) {
      this.innerString = innterString;
      this.einInt = einInt;
    }

    public void doSomething() {
      System.out.println(outerString + ":" + innerString + ":" + this.einInt + ":" + InnerClasses.this.einInt);
    }
  }

  public InnerClasses(String outerString, int einInt) {
    this.outerString = outerString;
    this.einInt = einInt;
    new InnerClass("innerClass", 14).doSomething();
  }


  public static void main(String[] args) {
    new InnerClasses("outer1", 16);
  }
}
