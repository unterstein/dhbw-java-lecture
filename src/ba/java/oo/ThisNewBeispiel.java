package ba.java.oo;


public class ThisNewBeispiel extends ThisNewBeispielParent{
  private String einString = "default";

  public ThisNewBeispiel(String einString, String zweiString) {
    super(einString);
    this.einString = einString + zweiString;
    System.out.println("ThisNewBeispiel(String einString, String zweiString)");
  }

  public void doSomething() {
    System.out.println(this.einString);
  }

  public void setEinString(String einString) {
    {
      {
        String lala = "lolo";
        System.out.println(lala);
      }
    }
  }

  public static void main(String[] args) {
    ThisNewBeispiel bsp = new ThisNewBeispiel("lala", "lolo");
    bsp.doSomething();
    bsp.setEinString("ein String");
    bsp.doSomething();
  }
}
