public class Heros {
  // max hp
  private static final int[] ARC_TAB;
  private static final int[] WAR_TAB;
  private static final int[] MAG_TAB;

  static {
    ARC_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    WAR_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    MAG_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  }

  public static int getMaxHp(Role role, int level) {
    switch (role) {
      case ARCHER:
        return ARC_TAB[level - 1];
      case WARRIOR:
        return WAR_TAB[level - 1];
      case MAGE:
      return MAG_TAB[level - 1];
      default:
        break;
    }
    return -1;
  }

}
