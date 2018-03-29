package robot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import arena.Bounds;
import constant.Direction;
import constant.Instruction;

public class RobotTest {

  private Robot testRobot;
  private Bounds testBounds;

  @Before
  public void before() {
    testRobot = new Robot(0, 0, Direction.N);
    testBounds = new Bounds(0, 4, 0, 4);
  }

  @Test
  public void turnLeftTest1() {
    Robot northRobot = new Robot(0, 0, Direction.N);
    Robot eastRobot = new Robot(0, 0, Direction.E);
    Robot westRobot = new Robot(0, 0, Direction.W);
    Robot southRobot = new Robot(0, 0, Direction.S);

    Assert.assertEquals(Direction.W, northRobot.rotateLeft());
    Assert.assertEquals(Direction.N, eastRobot.rotateLeft());
    Assert.assertEquals(Direction.S, westRobot.rotateLeft());
    Assert.assertEquals(Direction.E, southRobot.rotateLeft());
  }

  @Test
  public void turnLeftTest2() {

    testRobot.doTurn(Instruction.L, testBounds);
    Assert.assertEquals(Direction.W, testRobot.getDirection());
    testRobot.doTurn(Instruction.L, testBounds);
    Assert.assertEquals(Direction.S, testRobot.getDirection());
    testRobot.doTurn(Instruction.L, testBounds);
    Assert.assertEquals(Direction.E, testRobot.getDirection());
    testRobot.doTurn(Instruction.L, testBounds);
    Assert.assertEquals(Direction.N, testRobot.getDirection());
  }

  @Test
  public void turnRightTest1() {
    Robot northRobot = new Robot(0, 0, Direction.N);
    Robot eastRobot = new Robot(0, 0, Direction.E);
    Robot westRobot = new Robot(0, 0, Direction.W);
    Robot southRobot = new Robot(0, 0, Direction.S);

    Assert.assertEquals(Direction.E, northRobot.rotateRight());
    Assert.assertEquals(Direction.S, eastRobot.rotateRight());
    Assert.assertEquals(Direction.N, westRobot.rotateRight());
    Assert.assertEquals(Direction.W, southRobot.rotateRight());
  }

  @Test
  public void turnRightTest2() {
    Bounds bounds = new Bounds(0, 5, 0, 5);

    testRobot.doTurn(Instruction.R, bounds);
    Assert.assertEquals(Direction.E, testRobot.getDirection());
    testRobot.doTurn(Instruction.R, bounds);
    Assert.assertEquals(Direction.S, testRobot.getDirection());
    testRobot.doTurn(Instruction.R, bounds);
    Assert.assertEquals(Direction.W, testRobot.getDirection());
    testRobot.doTurn(Instruction.R, bounds);
    Assert.assertEquals(Direction.N, testRobot.getDirection());
  }

  /**
   * Moves east until hitting bounds
   */
  @Test
  public void eastMoveTest() {
    int eastInitialY = 0;
    Robot eastRobot = new Robot(0, eastInitialY, Direction.E);

    eastRobot.move(testBounds);
    Assert.assertEquals(1, eastRobot.getX());
    Assert.assertEquals(eastInitialY, eastRobot.getY());

    eastRobot.move(testBounds);
    Assert.assertEquals(2, eastRobot.getX());
    Assert.assertEquals(eastInitialY, eastRobot.getY());

    eastRobot.move(testBounds);
    Assert.assertEquals(3, eastRobot.getX());
    Assert.assertEquals(eastInitialY, eastRobot.getY());

    eastRobot.move(testBounds);
    Assert.assertEquals(4, eastRobot.getX());
    Assert.assertEquals(eastInitialY, eastRobot.getY());

    eastRobot.move(testBounds);
    Assert.assertEquals(4, eastRobot.getX());
    Assert.assertEquals(eastInitialY, eastRobot.getY());

  }

  /**
   * Moves west until hitting bounds
   */
  @Test
  public void westMoveTest() {
    int westInitialY = 3;
    Robot westRobot = new Robot(4, westInitialY, Direction.W);
    westRobot.move(testBounds);
    Assert.assertEquals(3, westRobot.getX());
    Assert.assertEquals(westInitialY, westRobot.getY());

    westRobot.move(testBounds);
    Assert.assertEquals(2, westRobot.getX());
    Assert.assertEquals(westInitialY, westRobot.getY());

    westRobot.move(testBounds);
    Assert.assertEquals(1, westRobot.getX());
    Assert.assertEquals(westInitialY, westRobot.getY());

    westRobot.move(testBounds);
    Assert.assertEquals(0, westRobot.getX());
    Assert.assertEquals(westInitialY, westRobot.getY());

    westRobot.move(testBounds);
    Assert.assertEquals(0, westRobot.getX());
    Assert.assertEquals(westInitialY, westRobot.getY());
  }

  /**
   * Moves north until hitting bounds
   */
  @Test
  public void northMoveTest() {
    int northInitialX = 3;
    Robot northRobot = new Robot(northInitialX, 4, Direction.N);
    northRobot.move(testBounds);
    Assert.assertEquals(3, northRobot.getY());
    Assert.assertEquals(northInitialX, northRobot.getX());

    northRobot.move(testBounds);
    Assert.assertEquals(2, northRobot.getY());
    Assert.assertEquals(northInitialX, northRobot.getX());

    northRobot.move(testBounds);
    Assert.assertEquals(1, northRobot.getY());
    Assert.assertEquals(northInitialX, northRobot.getX());

    northRobot.move(testBounds);
    Assert.assertEquals(0, northRobot.getY());
    Assert.assertEquals(northInitialX, northRobot.getX());

    northRobot.move(testBounds);
    Assert.assertEquals(0, northRobot.getY());
    Assert.assertEquals(northInitialX, northRobot.getX());
  }

  /**
   * Moves south until hitting bounds
   */
  @Test
  public void southMoveTest() {
    int southInitialX = 3;
    Robot southRobot = new Robot(southInitialX, 0, Direction.S);
    southRobot.move(testBounds);
    Assert.assertEquals(1, southRobot.getY());
    Assert.assertEquals(southInitialX, southRobot.getX());

    southRobot.move(testBounds);
    Assert.assertEquals(2, southRobot.getY());
    Assert.assertEquals(southInitialX, southRobot.getX());

    southRobot.move(testBounds);
    Assert.assertEquals(3, southRobot.getY());
    Assert.assertEquals(southInitialX, southRobot.getX());

    southRobot.move(testBounds);
    Assert.assertEquals(4, southRobot.getY());
    Assert.assertEquals(southInitialX, southRobot.getX());

    southRobot.move(testBounds);
    Assert.assertEquals(4, southRobot.getY());
    Assert.assertEquals(southInitialX, southRobot.getX());
  }

  @Test
  public void collisionTest() {
    int initialPenalties = testRobot.getPenaltyCount();
    testRobot.changeDirection(Direction.N);
    testRobot.doTurn(Instruction.M, testBounds);
    Assert.assertEquals(initialPenalties + 1, testRobot.getPenaltyCount());

    // Should be no new new penalties for rotations
    testRobot.doTurn(Instruction.R, testBounds);
    Assert.assertEquals(initialPenalties + 1, testRobot.getPenaltyCount());
    testRobot.doTurn(Instruction.L, testBounds);
    Assert.assertEquals(initialPenalties + 1, testRobot.getPenaltyCount());
  }
}
