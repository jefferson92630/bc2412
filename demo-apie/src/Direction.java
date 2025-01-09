public enum Direction {
  EAST(90, 1),
  SOUTH(180, 2),
  WEST(270, -1),
  NORTH(360, -2),
  ;

  private final int degree;
  private final int value;

  private Direction(int degree, int value) {
    this.degree = degree;
    this.value = value;
  }

  public int getDegree() {
    return this.degree;
  }


  // Direction.NORTH.opposite -> Direction SOUTH
  public Direction opposite() {
    for (Direction d : values()) {
      if (d.value == this.value * -1)
      return d; 
    }
    return null; // throw exception
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.getDegree());
    System.out.println(Direction.EAST.opposite());
  }
}
