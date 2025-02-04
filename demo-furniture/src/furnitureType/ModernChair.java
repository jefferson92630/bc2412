package furnitureType;
public class ModernChair extends Chair {

  @Override
  public boolean hasLegs() {
   return false;
  }

  @Override
  public boolean sitOn() {
    return false;
}

}