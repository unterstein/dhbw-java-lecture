package ba.java.beispiele;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassBeispiel {

  private int x, y;

  void test() {
    class InnerClass2 {
      int x, y;
    }
    InnerClass2 innerClass2 = new InnerClass2();

    JButton button = new JButton();

    class MyActionListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("aklalsd");
        x = 12;
        y = 24;
      }
    }
    button.addActionListener(new MyActionListener());
    ActionListener al2 = (e) -> System.out.println(e);

    button.addActionListener((e) -> {
      System.out.println("aklalsd");
      x = 12;
      y = 24;
    });

    button.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("aklalsd");
        x = 12;
        y = 24;
      }
    });
    ActionListener al = new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("muh");
      }
    };

  }

  void test2() {
  }

  void printInt() {
    System.out.println("InnerClassBeispiel");
  }

  class InnerClass1 {

    void printInt() {
      System.out.println("InnerClass1");
    }
  }
}
