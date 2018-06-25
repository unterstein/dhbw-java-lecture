package ba.java.oo;

import java.util.Stack;
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









    Stack<String> meinStack = new Stack<>();
    meinStack.push("lala");
    meinStack.add(0, "lolo");
    meinStack.get(0);
  }
}
