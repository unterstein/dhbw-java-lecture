package ba.java.swing;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

public class SwingDragAndDrop {
  JTextField txtField;
  JLabel lbl;

  public static void main(String[] args) {
    SwingDragAndDrop sdd = new SwingDragAndDrop();
  }

  public SwingDragAndDrop() {
    JFrame frame = new JFrame("Drag Drop Demo");
    txtField = new JTextField(20);
    lbl = new JLabel("ThisBeispiel is the text for drag and drop.");
    lbl.setTransferHandler(new TransferHandler("text"));
    MouseListener ml = new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        JComponent jc = (JComponent) e.getSource();
        TransferHandler th = jc.getTransferHandler();
        th.exportAsDrag(jc, e, TransferHandler.COPY);
      }
    };
    lbl.addMouseListener(ml);
    JPanel panel = new JPanel();
    panel.add(txtField);
    frame.add(lbl, BorderLayout.CENTER);
    frame.add(panel, BorderLayout.NORTH);
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
  }
}