package ba.java.swing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintBeispiel {
  public PaintBeispiel() {
    JFrame frame = new JFrame("Malen mit Swing");
    frame.setSize(400, 200);
    JPanel zeichenFläche = new JPanel() {

      // jede Swing JComponent hat eine methode paint(),
      // welche zum Zeichnen überschrieben werden kann.
      @Override
      public void paint(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(50, 50, 100, 100);
      }
    };
    frame.getContentPane().add(zeichenFläche);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new PaintBeispiel();
  }
}
