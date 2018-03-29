package constant;

public enum Direction {
  N("NORTH"), S("SOUTH"), W("WEST"), E("EAST");

  Direction(String name) {
    this.name = name;
  }

  private final String name;

  public String getName() {
    return name;
  }


}
