public class CustomeHashMap implements  FunctionalHashMap{
  private final static int SIZE = 10;
  private Node[] nodes;

  public CustomeHashMap() {
    nodes = new Node[SIZE];
  }

  @Override
  public int get(Student key) {
    return 0;
  }

  @Override
  public void put(Student key, int grade) {

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
