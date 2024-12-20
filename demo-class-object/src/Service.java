public class Service {
  
  private String types;
  private String company;
  private int price;
  
  public Service(String types, String company, int price) {
    this.types = types;
    this.company = company;
    this.price = price;
  }

    public String getTypes() {
      return this.types;
    }
    public String getCompany() {
      return this.company;
    }
    public int getPrice() {
      return this.price;
    }

    public static void main(String[] args) {

      Service s1 = new Service ("R&M", "Kitchen Master", 1100);
      System.out.println(s1.getTypes());
      System.out.println(s1.getCompany());
      System.out.println(s1.getPrice());
      Service s2 = new Service ("Pest Control", "Ecolab", 1000);
      System.out.println(s2.getTypes());
      System.out.println(s2.getCompany());
      System.out.println(s2.getPrice());
      Service s3 = new Service ("Cleaning", "World Environmental", 2000);
      System.out.println(s3.getTypes());
      System.out.println(s3.getCompany());
      System.out.println(s3.getPrice());

      Service[] services = new Service [] {s1, s2, s3};
      for (Service s: services) {
        System.out.println(s.getTypes() + "," + s.getCompany() + "," + s.getPrice());
      }

    }

    }




