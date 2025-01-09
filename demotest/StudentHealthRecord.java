public class StudentHealthRecord {
  
  private String name;
  private char gender;
  private int height;
  private boolean foodAllergy;

  public StudentHealthRecord(String name, char gender, int height, boolean foodAllergy) {
    this.name = name;
    this.gender = gender;
    this.height = height;
    this.foodAllergy = foodAllergy;
  }

  public String getName() {
    return this.name;
  }

  public char getGender() {
    return this.gender;
  }

  public int getHeight() {
    return this.height;
  }

  public boolean getfoodAllergy() {
    return this.foodAllergy;
  }

    public static void main(String[] args) {

    StudentHealthRecord s1 = new StudentHealthRecord ("Peter Chan", 'M', 170, true);
    System.out.println(s1.getName());
    System.out.println(s1.getGender());
    System.out.println(s1.getHeight());
    System.out.println(s1.getfoodAllergy());
    StudentHealthRecord s2 = new StudentHealthRecord("Mary Lai", 'F', 156, false);
    StudentHealthRecord s3 = new StudentHealthRecord("Toby Chan", 'M', 165, true);

    StudentHealthRecord[] healthrecord = new StudentHealthRecord[] {s1, s2, s3};
    for (StudentHealthRecord s: healthrecord) {

      System.out.println(s.getName() + "," + s.getGender() + "," + s.getHeight() + "," + s.getfoodAllergy());
    }



  }

  }

