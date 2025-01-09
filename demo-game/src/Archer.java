import java.math.BigDecimal;

public class Archer extends Hero {
  
private int maxHP = 80;
private int maxMP = 40;
private int ag = 20;
private int pa = 10;
private int pd = 5;
private int ma = 5;
private int md = 3;
private double cc = 0.4;
private double cdm = 1.;

public Archer (long id, int hp, int mp) {
  super(id, hp, mp);
}


public int getMaxHP() {
  return this.maxHP;
}

public int getMaxMP() {
  return this.maxMP;
}

public int getAg() {
  return this.ag;
}

public int getPa() {
  return this.pa;
}

public int getPd() {
  return this.pd;
}

public int getMa() {
  return this.ma;
}

public int getMd() {
  return this.md;
}

public double getCc() {
  return this.cc;
}

public double getCdm() {
  return this.cdm;
}

@Override
public void levelUp() {
  super.levelUp();
  this.maxHP += 10;
  super.setHp(this.maxHP);
  this.maxMP += 5;
  super.setMp(this.maxMP);
  this.ag += 2;
  this.pa += 5;
  this.pd += 5;
  this.ma += 2;
  this.md += 2;
}

  public double getCd() {
    return BigDecimal.valueOf(this.pa)
    .multiply(BigDecimal.valueOf(this.cdm))
    .doubleValue();
  }




@Override
public String toString() {
  return "Archer["
        + "id=" + super.getId()
        +", hp=" + super.getHp()
        +", mp=" + super.getMp()
        +", level=" + super.getLevel()
        +", maxHP=" + this.maxHP
        +", maxMP=" + this.maxMP
        +", Ag=" + this.ag
        +", Pa=" + this.pa
        +", Pd=" + this.pd
        +", Ma=" + this.ma
        +", Md=" + this.md
        +", Cc=" + this.cc
        +", Cd=" + this.getCd()
        +", Cdm=" + this.cdm
        +"]";
}


public static void main(String[] args) {
  Archer a1 = new Archer(1L,100,100);
  System.out.println(a1);
  a1.levelUp();
 System.out.println(a1);
  
}


}
