public class Main {

  public static void main(String[] args) {
    Student petro = Student.createBuilder()
        .firstname("Piotr")
        .secondName("Sikorsky")
        .age(21)
        .build();

    System.out.println(petro);
  }
}
