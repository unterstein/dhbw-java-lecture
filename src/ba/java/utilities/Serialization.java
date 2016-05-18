package ba.java.utilities;

import ba.java.auto.AudiQFuenf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Serialization {

  public static void main(String[] args) throws Exception {
    AudiQFuenf auto = new AudiQFuenf();
    auto.anzahlBlinker = 20;
    ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(new File("/Users/Hannes/Desktop/meinAudi")));
    ooStream.writeObject(auto);
//        xml
  }

}
