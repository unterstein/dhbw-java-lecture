package ba.java.auto;

public class Suv extends Pkw implements Allrad {

  public void starteAuto() {
    blinkeRechts();
    super.blinkeRechts();
  }

  public void bereiteDifferenzialVor() {
    System.out.println("bereite differenzial vor!");
  }

  @Override
  public void blinkeRechts() {
    bereiteDifferenzialVor();
    superBlinkeRechts();

    super.getHöhe();
    this.getHöhe();
  }
//
//  @Override
//  public double getHöhe() {
//    return 12;
//  }

  public static void main(String[] args) {
    Suv suv = new Suv();
    suv.starteAuto();
  }
}
