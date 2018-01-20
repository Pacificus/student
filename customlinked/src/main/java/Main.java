
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

//    CustomeLinkedlist list = new CustomeLinkedlist();
//    list.push(petro);
//    list.push(oleg);
//    list.push(alex);
//
//    while ( !list.isEmpty() ) {
//      System.out.println(list.pop());
//    }

    CustomeHashMap hashMap = new CustomeHashMap();
    hashMap.put(petro, 4);
    hashMap.put(oleg, 3);
    hashMap.put(alex, 5);
    Student dima = Student.createBuilder().firstname("Dima").secondName("Gres").age(34).build();
    hashMap.put(dima, 3);
    hashMap.put(Student.createBuilder().firstname("Dima").secondName("Gres").age(34).build(), 6);

    hashMap.put(oleg, 7);
    System.out.println( hashMap.get(dima) );
  }
}
