public enum Currency {
  // Scenario for enum
  // 1. Finite numbers of values
  // 2. Not likely to have a new value

  HKD ("Hong Kong Dollar", 1), 
  CNY ("Chinese Yuan Renminbi", 2), 
  USD ("US Dollar", 3),
  ;

  private final String desc;
  private final int value;
  // can carry more than one attribute

  // private constructor for enum
  private Currency(String desc, int value) {
    this.desc = desc;
    this.value = value;
  }

  public String getDesc() {
    return this.desc;
  }

  public int getValue() {
    return this.value;
  }


  public static String getDescription(Currency currency) {
    // before Java 14
    if (currency == Currency.HKD)
      return "Hong Kong Dollar";
    else if (currency == Currency.CNY)
      return "Chinese Yuan Renminbi";
    else if (currency == Currency.USD)
      return "US Dollar";
    return "";
    // switch (currency) {
    //  case HKD:
    //   return "Hong Kong Dollar";
    //  case CNY:
    //    return "Chinese Yuan Renminbi";
    //  case USD:
    //    return "US Dollar";
    //  default:
    //    return "";
    // }
  }

  public static void main(String[] args) {
    System.out.println(Currency.getDescription(Currency.HKD)); // HKD Dollar
    // new Currency("ABC") // You cannot create enum by yourself

    System.out.println(Currency.HKD.getDesc()); // Hong Kong Dollar
    System.out.println(Currency.CNY.getValue()); // 2

    Currency hkd = Currency.HKD;
    System.out.println(hkd.getDesc()); // Hong Kong Dollar

    System.out.println(Currency.USD.getDesc()); // US Dollar

    Currency cny = Currency.CNY;
    System.out.println(cny.getDesc()); // Chinese Yuan Renminbi
  }
}
