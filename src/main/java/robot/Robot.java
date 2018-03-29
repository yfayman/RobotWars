package robot;

import arena.Bounds;
import constant.Direction;
import constant.Instruction;

public class Robot {

  private int x;
  private int y;

  private int penaltyCount;

  private Direction direction;

  public Robot(int x, int y) {
    this.x = x;
    this.y = y;
    this.direction = Direction.N;
  }

  public Robot(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public void doTurn(Instruction instruction, Bounds bounds) {
    switch (instruction) {
      case L:
        this.direction = rotateLeft();
        break;
      case R:
        direction = rotateRight();
        break;
      case M:
        move(bounds);
        break;
    }
  }

  protected Direction rotateLeft() {
    switch (this.direction) {
      case N:
        return Direction.W;
      case E:
        return Direction.N;
      case S:
        return Direction.E;
      case W:
        return Direction.S;
      default:
        return null;
    }
  }

  protected Direction rotateRight() {
    switch (this.direction) {
      case N:
        return Direction.E;
      case E:
        return Direction.S;
      case S:
        return Direction.W;
      case W:
        return Direction.N;
      default:
        return null;
    }
  }

  protected void move(Bounds bounds) {
    switch (this.direction) {
      case N: {
        if (y - 1 >= bounds.getMinY()) {
          y--;
        } else {
          penaltyCount++;
        }
        break;
      }
      case E: {
        if (x + 1 <= bounds.getMaxX()) {
          x++;
        }
        break;
      }
      case S: {
        if (y + 1 <= bounds.getMaxY()) {
          y++;
        } else {
          penaltyCount++;
        }
        break;
      }
      case W: {
        if (x - 1 >= bounds.getMinX()) {
          x--;
        } else {
          penaltyCount++;
        }
        break;
      }
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getPenaltyCount() {
    return penaltyCount;
  }

  public Direction getDirection() {
    return direction;
  }

  protected void changeDirection(Direction direction) {
    this.direction = direction;
  }



}
