public class CustomeLinkedlist implements Functional {

  private static class Node {
    private Student student;
    private Node next;

    public Node(Student student) {
      this.student = student;
      next = null;
    }
  }

  @Override
  public void push(Student student) {

  }

  @Override
  public Student pop() {
    return null;
  }

  @Override
  public Student peek() {
    return null;
  }
}
