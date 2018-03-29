package arena;

public class Bounds {

  final int minX;

  final int maxX;

  final int minY;

  final int maxY;

  public Bounds(int minX, int maxX, int minY, int maxY) {
    super();
    this.minX = minX;
    this.maxX = maxX;
    this.minY = minY;
    this.maxY = maxY;
  }

  public int getMinX() {
    return minX;
  }

  public int getMaxX() {
    return maxX;
  }

  public int getMinY() {
    return minY;
  }

  public int getMaxY() {
    return maxY;
  }



}
