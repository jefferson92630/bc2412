public abstract class Hero {
  private long id;
  private int hp;
  private int mp;
  private int level = 1;


  public Hero (long id, int hp, int mp) {
    this.id = id;
    this.hp = hp;
    this.mp = mp;
  }

  // Method:
  // Presentation: isAlive
  // Action: Level Up -> +MaxHP, +MaxMP

  // Hero is a Parent Class
  // Child Class: Archer, Mage, Warrior

  public long getId(){
    return this.id;
  }

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }

  public int getLevel() {
    return this.level;
  }

  public void levelUp() {
    level++;
  }

  public int setHp(int hp) {
    return this.hp = hp;
  }

  public int setMp(int mp) {
    return this.mp = mp;
  }

  public boolean isAlive (int hp) {
    if (this.hp != 0) {
      return true;
    }
    return false;
  }

public static void main(String[] args) {

}

}
