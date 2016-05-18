package ba.java.oo;

import java.util.Vector;

public class BessererStack<T> {
  private Vector<T> ownVector;

  public BessererStack() {
    ownVector = new Vector<>();
  }

  public void push(T element) {
    ownVector.add(element);
  }

  public T pull() {
    return ownVector.remove(ownVector.size() - 1);
  }

  public T peak() {
    return ownVector.get(ownVector.size() - 1);
  }

  public boolean isEmpty() {
    return ownVector.size() == 0;
  }

  public static void main(String[] args) {
    BessererStack<String> stack = new BessererStack<>();
    stack.push("1");
    stack.push("2");
    stack.push("3");
    while (stack.isEmpty() == false) {
      System.out.println(stack.pull());
    }
  }
}
