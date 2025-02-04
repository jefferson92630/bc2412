import factory.ModernFurnitureFactory;
import furnitureType.Chair;
import furnitureType.ModernChair;
import furnitureType.VictorianChair;
import factory.FurnitureFactory;

public class DemoFactory {
  
  public static void main(String[] args) {
    
    FurnitureFactory factory = new ModernFurnitureFactory();

    Chair chair = factory.createChair(); // decoupling
    
    // Runtime Polymorphism
    Chair mc = new ModernChair();
    Chair vc = new VictorianChair();
    System.out.println(mc.sitOn());
    System.out.println(mc.hasLegs());
    System.out.println(vc.hasLegs());
    System.out.println(vc.sitOn());
  }
}
