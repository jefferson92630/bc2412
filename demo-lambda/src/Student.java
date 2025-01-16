public class Student {
  private String name;
  private int id;


  public static Builder builder() {
  return new Builder();
}

  public Student(Builder builder) {
    this.name = builder.name;
    this.id = builder.id;
  }

  private Student (String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public int getId() {
    return this.id;
  }

  public static class Builder {
    private String name;
    private int id;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder id(int id) {
      this.id = id;
      return this;
    }

    public Student build() {
      return new Student(this);
    }
  }

  public static void main(String[] args) {
    Student s1 = Student.builder().name("Peter").id(1).build();


    Student s2 = Student.builder().name("Mary").build();
  }

}
