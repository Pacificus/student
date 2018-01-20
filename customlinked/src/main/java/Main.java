
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

    System.out.println(petro + " " + petro.hashCode());
    System.out.println(oleg + " " + oleg.hashCode());
  }
}
