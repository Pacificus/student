public class CustomeHashMap {
  private final static int SIZE = 10;
  private Node[] nodes;

  public CustomeHashMap() {
    nodes = new Node[SIZE];
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


}
