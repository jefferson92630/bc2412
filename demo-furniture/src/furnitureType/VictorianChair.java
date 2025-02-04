package furnitureType;
public class VictorianChair extends Chair {

  @Override
  public boolean hasLegs() {
   return false;
  }

  @Override
  public boolean sitOn() {
    return false;
  }
}
