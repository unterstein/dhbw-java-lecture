package ba.java.swing;

import java.awt.Component;
import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;

public class SwingApp {
  public SwingApp() {
    JFrame frame = new JFrame("Erste Swing Applikation");
    frame.getContentPane().add(new JLabel("Hallo!"));
    frame.setSize(400, 200);
    // frame.pack(); für automatische Größenberechnung
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
    JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm:ss");
    timeSpinner.setEditor(timeEditor);
    timeSpinner.setValue(new Date()); // will only show the current time
    frame.add(timeSpinner);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new SwingApp();
  }

}
