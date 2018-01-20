public class Student {
  private String firstName;
  private String secondName;
  private int age;

  @Override
  public String toString() {
    return "Student{" +
        "firstName='" + firstName + '\'' +
        ", secondName='" + secondName + '\'' +
        ", age=" + age +
        '}';
  }

  private Student() {
    this.firstName = Builder.name;
    this.secondName = Builder.surname;
    this.age = Builder.howOld;
  }

  public static Builder createBuilder() {
    return new Builder();
  }

  public static class Builder {
    private static String name;
    private static String surname;
    private static int howOld;

    public Builder firstname(String firstName) {
      this.name = firstName;
      return this;
    }

    public Builder secondName(String surname) {
      this.surname = surname;
      return this;
    }

    public Builder age(int age) {
      this.howOld = age;
      return this;
    }

    public Student build() {
      return new Student();
    }
  }
}
