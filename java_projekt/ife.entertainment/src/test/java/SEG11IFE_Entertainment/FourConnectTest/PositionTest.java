package SEG11IFE_Entertainment.FourConnectTest;

import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.FourConnect.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void positionConstuctorTest(){
        Integer x = 3;
        Integer y = 7;
        Position testPos = new Position(x, y);

        assertEquals(x, testPos.getX());
        assertEquals(y, testPos.getY());
    }

    @Test
    void getXTest(){
        Integer x = 4;
        Position testPos = new Position(x,0);
        Integer testPosX = testPos.getX();
        assertEquals(x,testPosX);
    }
    @Test
    void getYTest(){
        Integer y = 2;
        Position testPos = new Position(0,y);
        Integer testPosY = testPos.getY();
        assertEquals(y,testPosY);
    }

    @Test
    void equalsTest(){
        Position testPos1 = new Position(1,2);
        Position testPos2 = new Position(1,2);
        boolean equalsResult = testPos1.equals(testPos2);
        assertTrue(equalsResult);
    }

    @Test
    void hashCodeTest(){
        Position testPos1 = new Position(1, 2);
        Position testPos2 = new Position(1, 2);
        Position testPos3 = new Position(9, 9);

        assertEquals(testPos1.hashCode(), testPos2.hashCode());

        assertTrue(testPos1.hashCode() != testPos3.hashCode());
    }

    @Test
    void equalsNullTest(){
        Position testPos1 = null ;
        Position testPos2 = new Position(1, 2);
        Position testPos3 = new Position(9, 9);

        assertFalse(testPos2.equals(testPos1));
    }

    @Test
    void equalsSameTest(){
        Position testPos1 = new Position(1, 2);
        assertTrue(testPos1.equals(testPos1));
    }

    @Test
    void equalsDifferentObjectTest(){
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
