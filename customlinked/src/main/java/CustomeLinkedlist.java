import java.util.NoSuchElementException;

public class CustomeLinkedlist implements Functional {
  private Node begin;
  private Node end;


  private static class Node {
    private Student student;
    private Node next;

    public Node(Student student) {
      this.student = student;
      next = null;
    }
  }

  public CustomeLinkedlist() {
    end = begin = null;
  }

  @Override
  public void push(Student student) {
    Node current = new Node(student);
    if (begin == null) {
      end = begin = current;
      return;
    }

    end = end.next = current;
  }

  @Override
  public Student pop() {
    if (begin == null) {
      throw new NoSuchElementException("Element has no found.");
    }

    Student last = end.student;


    if (begin == end) {
      begin = end = null;
      return last;
    }

    Node beforeEnd = begin;

    while (beforeEnd.next != end) {
      beforeEnd = beforeEnd.next;
    }

    end = beforeEnd;

    return last;
  }

  @Override
  public Student peek() {
    if (begin == null) {
      throw new NoSuchElementException("Element has no found.");
    }

    return end.student;
  }

  public boolean isEmpty() {
    return begin == null;
  }
}
