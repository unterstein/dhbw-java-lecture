package ba.java.utilities;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashBeispiel {

  public static void main(String[] args) {
    // JCE!
    hash("meinPasswortIstSicher", "MD5");
    hash("meinPasswortIstSicher", "SHA");
    hash("meinPasswortIstSicher", "SHA-256");
    hash("meinPasswortIstSicher", "SHA-512");
  }

  private static String hash(String string, String algorithm) {
    try {
      string = "IchBin" + string + "EinSalt";
      long start = System.currentTimeMillis();
      MessageDigest digest = MessageDigest.getInstance(algorithm);
      byte[] bytes = digest.digest(string.getBytes());
      String result = new BigInteger(1, bytes).toString(16);
      System.out.println((System.currentTimeMillis() - start) + ":" + result.length() + ":" + result);
      return result;
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    return null;
  }
}
