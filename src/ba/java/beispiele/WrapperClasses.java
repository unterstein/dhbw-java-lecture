package ba.java.beispiele;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class WrapperClasses {

  static int i3; // <<<<--- 0
  static Integer i4; /// <<<<--- null

  public static void main(String[] args) {
    System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
    VoiceManager vm = VoiceManager.getInstance();
    Voice kevin16 = vm.getVoices()[0];
    kevin16.allocate();
    kevin16.speak("Hello");

  }

  public static void printInt(int i) {
    System.out.println(i);
  }

  static class Kontostand {
    private double value;

    public double getValue() {
      return value;
    }

    public void setValue(double value) {
      this.value = value;
    }
  }
}
