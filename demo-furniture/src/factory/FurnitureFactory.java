package factory;
import furnitureType.Chair;
import furnitureType.Sofa;

public interface FurnitureFactory {
  Chair createChair();
  Sofa createSofa();
}
