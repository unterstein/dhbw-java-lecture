package ba.java.weiteres.generics;

public class AlteListeVerwendung {

  public AlteListeVerwendung() {
    // Hmm...eigentlich will ich nur Integer zulassen, geht aber nicht :-(
    AlteListe liste = new AlteListe(10);
    liste.add(5);
    liste.add(1.5); // führt zu keinem Compiler-Fehler!

    // Der Rückgabetyp ist Object
    Object objectFromListe = liste.get(0);
    Integer integerFromListe = (Integer) objectFromListe;
  }
}











