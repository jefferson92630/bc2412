public class Worker {
  private static int workerCount = 0;
  private Supermarket supermarket;

  public Worker(Supermarket supermarket) {
    this.supermarket = supermarket;
    Worker.workerCount++;
  }

  // If read private static variable, we should use static method
  public static int getWorkCount() {
    return Worker.workerCount;
  }

  public void moveIn(int quantity) {
    supermarket.setAvailableStock(supermarket.getAvailableStock() + quantity);
  } 

  public void moveOut(int quantity) {
    supermarket.setAvailableStock(supermarket.getAvailableStock() - quantity);
  } 

  }
  

