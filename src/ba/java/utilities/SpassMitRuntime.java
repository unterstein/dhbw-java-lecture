package ba.java.utilities;


import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SpassMitRuntime {
  public static void main(String[] args) throws IOException {
    Process exec = Runtime.getRuntime().exec("say hello");
    BigDecimal bigInteger = new BigDecimal("0.1239123902139917823789123879");
    BigDecimal bigInteger2 = new BigDecimal("0.1239123902139917823789123879");
    System.out.println(bigInteger.add(bigInteger2));
  }
}
