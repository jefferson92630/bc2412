public class Student {
  private long id;
  private int score;
  private int candyCount;

  public Student(long id, int score) {
    this.id = id;
    this.score = score;
    this.candyCount = 0; // initially they does not have candy, waiting for distribute
  }

  public int getScore() {
    return this.score;
  }

  public long getId() {
    return this.id;
  }

  public int getCandyCount() {
    return this.candyCount;
  }

  public void addOneCandy() {
    this.candyCount++;
  }

  public void addTwoCandy() {
    this.candyCount += 2;
  }

  public static void main(String[] args) {
    Student[] students = new Student[] {new Student(1L, 67), new Student(2L, 89),
        new Student(3L, 50), new Student(4L, 99), new Student(5L, 60), new Student(6L, 59)};

    while (Candy.count > 0) {
      for (Student s : students) {
        if (s.getScore() >= 80 && Candy.count >= 2) {
          s.addTwoCandy();
          Candy.count -= 2;
        } else if (s.getScore() >= 60 && s.getScore() < 80 && Candy.count >= 1) {
          s.addOneCandy();
          Candy.count--;
        }
      }
    }
    for (Student s : students) {
      System.out.println("Student " + s.getId() + " has " + s.getCandyCount() + " candies");
    }
  }

  // Question 1:
  // 20 candies -> distribute students according to their score
  // Rule: Every round of distribution, Above 80 score -> 2 candies; between 60 - 79 score -> 1 candy

  // Student 1: 67 score
  // Student 2: 89 score
  // Student 3: 50 score
  // Student 4: 99 score
  // Student 5: 60 score
  // Student 6: 59 score

  // Expected Output: (Sysout)
  // Student 1 has 4 candies
  // Student 2 has 6 candies
  // Student 3 has 0 candies
  // Student 4 has 6 candies
  // Student 5 has 4 candies
  // Student 6 has 0 candies

  // Tips: static -> candyCount (while loop)



}