package ba.java.oo.interfaces;

public interface MagischesInterface {

  int getTelefonnummer();

  default int getTelefonnummer2() {
    return 0;
  }
}
