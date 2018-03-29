package arena;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;

public class Arena {

  private List<Robot> robots;

  private final Bounds bounds;

  public Arena(Bounds bounds) {
    this.bounds = bounds;
  }

  public List<Robot> getRobots() {
    if (robots == null) {
      robots = new ArrayList<Robot>();
    }
    return robots;
  }

  public void addRobot(Robot robot) {
    getRobots().add(robot);
  }

  public Bounds getBounds() {
    return bounds;
  }

}
