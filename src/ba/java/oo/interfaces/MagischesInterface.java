package ba.java.oo.interfaces;

public interface MagischesInterface {

  int getTelefonnummer();

  default int getPrivattelefonnummer() {
    return getTelefonnummer();
  }
}
