package ba.java.oo.innerclasses;

public class SecondClass {

  public static void main(String[] args) {
    OuterClass.StaticInnerClass innerClass = new OuterClass.StaticInnerClass();
//    new OuterClass.InnerClass(); <- Geht nicht!
  }
}
