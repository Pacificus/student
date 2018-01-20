
public class Main {

  public static void main(String[] args) {
    Student petro = Student.createBuilder()
        .firstname("Piotr")
        .secondName("Sikorsky")
        .age(21)
        .build();

    Student oleg = Student.createBuilder()
        .firstname("Oleg")
        .secondName("Markevich")
        .age(35)
        .build();

    Student alex = Student.createBuilder()
        .firstname("Alex")
        .secondName("Rosini")
        .age(21)
        .build();

    CustomeLinkedlist list = new CustomeLinkedlist();
    list.push(petro);
    list.push(oleg);
    list.push(alex);

    while ( !list.isEmpty() ) {
      System.out.println(list.pop());
    }
  }
}
