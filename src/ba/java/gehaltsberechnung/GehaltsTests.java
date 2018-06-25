package ba.java.gehaltsberechnung;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GehaltsTests {

  @Test
  public void testAngestellte() {
    List<Mitarbeiter> mitarbeiter = List.of(
        new Angestellter(1000, 1000),
        new Angestellter(2000, 2000)
    );
    double alleGehaelter =
        new Gehaltsabrechnung(mitarbeiter).berechneAlleGehaelter();
    assertEquals(6000, alleGehaelter);
  }

  @Test
  public void testArbeiter() {
    List<Mitarbeiter> mitarbeiter = List.of(
        new Arbeiter(10, 120),
        new Arbeiter(10, 120)
    );
    double alleGehaelter =
        new Gehaltsabrechnung(mitarbeiter).berechneAlleGehaelter();
    assertEquals(2400, alleGehaelter);
  }

  @Test
  public void testEmpty() {
    List<Mitarbeiter> mitarbeiter = List.of();
    double alleGehaelter =
        new Gehaltsabrechnung(mitarbeiter).berechneAlleGehaelter();
    assertEquals(0, alleGehaelter);
  }
}
