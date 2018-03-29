package simulator;

import arena.Arena;
import constant.Instruction;
import robot.Robot;

public class Similator {

  private final Arena arena;

  public Similator(Arena arena) {
    this.arena = arena;
  }

  public void turn(Robot robot, Instruction inst) {
    robot.doTurn(inst, arena.getBounds());
  }



}
