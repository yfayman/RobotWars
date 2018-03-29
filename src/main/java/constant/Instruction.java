package constant;

public enum Instruction {
  L("L"), R("R"), M("M");

  private final String name;

  Instruction(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


}
