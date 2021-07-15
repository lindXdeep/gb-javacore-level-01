package entities;

import java.util.jar.Attributes.Name;

import obstacles.RunningTrack;
import obstacles.Wall;

/**
 * Human
 */
public class Human implements Entity {

  private final int MAX_RUN;
  private final int MAX_JUMP;
  private final String name;

  public Human(final int MAX_RUN, final int MAX_JUMP, final String name) {
    this.MAX_RUN = MAX_RUN;
    this.MAX_JUMP = MAX_JUMP;
    this.name = name;
  }

  @Override
  public boolean run(final RunningTrack track) {
    return track.getLength() <= MAX_RUN;
  }

  @Override
  public boolean jump(final Wall wall) {
    return wall.getLength() <= MAX_JUMP;
  }

  @Override
  public String getName() {
    return name;
  }
}