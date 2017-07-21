import ba.java.auto.AudiQFuenf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {

  @Test
  public void testBlinke() {
    AudiQFuenf q5 = new AudiQFuenf();
    q5.blinkeRechts();
  }

  @Test
  public void testWartung() {
    AudiQFuenf q5 = new AudiQFuenf();
    assertEquals(true, q5.brauchtWartung(), "Dieses Auto braucht Wartung!");
  }
}
