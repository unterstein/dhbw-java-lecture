package ba.java.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DrueckMich {

  private int count = 0;
  private final String GEDRUECKED = " mal gedrückt";

  public DrueckMich() {
    JFrame derFrame = new JFrame("Action!");
    final JButton derButton = new JButton(count + GEDRUECKED);

    // Anonyme Überschreibung
//    derButton.addActionListener(new ActionListener() {
//
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        count++;
//        derButton.setText(count + GEDRUECKED);
//      }
//    });

    // Gleiche Implementierung als Lambda
    derButton.addActionListener(e -> {
      count++;
      derButton.setText(count + GEDRUECKED);
    });

    // oder einzeiler: derButton.addActionListener(e -> { count++; derButton.setText(count + GEDRUECKED); });

    derFrame.getContentPane().add(derButton);
    derFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    derFrame.pack();
    derFrame.setVisible(true);
  }

  public static void main(String[] argv) {
    new DrueckMich();
  }
}
