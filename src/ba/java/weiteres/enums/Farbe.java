package ba.java.weiteres.enums;

public enum Farbe {
  ROT(255, 0, 0), GRUEN(0, 255, 0), BLAU(0, 0, 255);

  private int r, g, b;

  private Farbe(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public String toRGB() {
    return "r: " + r + ", g: " + g + ", b: " + b;
  }
}
