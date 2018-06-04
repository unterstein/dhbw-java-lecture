package ba.java.beispiele;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassesSamples {

  public static void main(String[] args) {
    new StaticInnerClass();
    new InnerClassesSamples().print();
  }

  public InnerClassesSamples() {
    innerClass1 = new InnerClass1(x * 2, y * 3);
  }

  int x = 5;
  int y = 20;
  InnerClass1 innerClass1;

  void print() {
    System.out.println("1:" + innerClass1.x);
    System.out.println("2:" + x);
    innerClass1.print();
  }

  class InnerClass1 {
    void print() {
      System.out.println("3:" + x);
      System.out.println("4:" + InnerClassesSamples.this.x);
    }

    int x, y;

    public InnerClass1(int x, int y) {
      this.x = x;
      this.y = y;
    }

  }

  public void lala() {
    InnerClass1 innerClass1 = new InnerClass1(1, 2);

    class InnerClass2 {
      int a, b;

      public InnerClass2(int a, int b) {
        this.a = a;
        this.b = b;
      }
    }

    InnerClass2 innerClass2 = new InnerClass2(2, 3);

    InnerClass1 i1 = new InnerClass1(1, 2) {
      int a, b;

      void lala() {

      }

      @Override
      void print() {
        System.out.println("lolo: " + x + ":" + y);
      }
    };
    JButton button = new JButton();

    ActionListener actionListener = new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(innerClass1.x);
        System.out.println("Knopf wurde gedrückt!");
      }
    };

    button.addActionListener(actionListener);

    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("(⊙＿⊙')");
      }
    });

    button.addActionListener((e) -> System.out.println("ᕕ( ᐛ )ᕗ"));
  }

  static class StaticInnerClass {

  }

  public void asd() {
    InnerClass1 innerClass2 = new InnerClass1(2, 3);
  }
}
