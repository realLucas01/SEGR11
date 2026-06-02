package segeleven.ife.entertainment.fourconnecttest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import segeleven.ife.entertainment.fourconnect.Player;
import segeleven.ife.entertainment.fourconnect.Position;

class PositionTest {

  @Test
  void positionConstructorTest() {
    Integer x = 3;
    Integer y = 7;
    Position testPos = new Position(x, y);

    assertEquals(x, testPos.getXcord());
    assertEquals(y, testPos.getyCord());
  }

  @Test
  void getXtest() {
    Integer x = 4;
    Position testPos = new Position(x, 0);
    Integer testPosX = testPos.getXcord();
    assertEquals(x, testPosX);
  }

  @Test
  void getYtest() {
    Integer y = 2;
    Position testPos = new Position(0, y);
    Integer testPosY = testPos.getyCord();
    assertEquals(y, testPosY);
  }

  @Test
  void equalsTest() {
    Position testPos1 = new Position(1, 2);
    Position testPos2 = new Position(1, 2);
    boolean equalsResult = testPos1.equals(testPos2);
    assertTrue(equalsResult);
  }

  @Test
  void hashCodeTest() {
    Position testPos1 = new Position(1, 2);
    Position testPos2 = new Position(1, 2);
    Position testPos3 = new Position(9, 9);

    assertEquals(testPos1.hashCode(), testPos2.hashCode());
    assertNotEquals(testPos1.hashCode(), testPos3.hashCode());
  }

  @Test
  void equalsNullTest() {
    Position testPos1 = null;
    Position testPos2 = new Position(1, 2);

    assertFalse(testPos2.equals(testPos1));
  }

  @Test
  void equalsSameTest() {
    Position testPos1 = new Position(1, 2);
    assertTrue(testPos1.equals(testPos1));
  }

  @Test
  void equalsDifferentObjectTest() {
    Position testPos1 = new Position(1, 2);
    assertFalse(testPos1.equals(Player.EASYBOT));
  }

  @Test
  void testEqualsLogicalBranches() {
    Position base = new Position(10, 20);
    Position same = new Position(10, 20);
    Position differentX = new Position(99, 20);

    assertTrue(base.equals(same));
    assertFalse(base.equals(differentX));
  }
}
