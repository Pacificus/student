import com.sun.xml.internal.bind.v2.model.core.NonElement;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;

import java.util.NoSuchElementException;

public class CustomeHashMap implements  FunctionalHashMap{
  private final static int SIZE = 10;
  private Node[] nodes;

  public CustomeHashMap() {
    nodes = new Node[SIZE];
  }

  @Override
  public int get(Student key) {
    int index = calculateIndex(key.hashCode());
    if (nodes[index] == null) {
      throw new NoSuchElementException("Element not found.");
    }

    Node goOn = nodes[index];
    while (true) {

      if ( goOn.key.equals(key) ) {
        return goOn.value;
      }

      if (goOn == null) {
        throw new NoSuchElementException("Element not found.");
      }

      goOn = goOn.next;
    }
  }


  @Override
  public void put(Student key, int grade) {
    Node curent = new Node(key, grade);
    int index = calculateIndex(key.hashCode());

    if (nodes[index] == null) {
      nodes[index] = curent;
      return;
    }

    Node goOn = nodes[index];
    while (true) {

      if ( goOn.key.equals(key) ) {
        goOn.value = grade;
        return;
      }

      if (goOn.next == null) {
        break;
      }

      goOn = goOn.next;
    }

    goOn.next = curent;
  }

  private static class Node {
    private Student key;
    private int value;
    private Node next;

    public Node(Student key, int value) {
      this.key = key;
      this.value = value;
      next = null;
    }
  }

  private int calculateIndex(int hash) {
    return hash % SIZE;
  }
}
