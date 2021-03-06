package game.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Test
    void testOf() {
        assertEquals(Direction.UP, Direction.of(-1, 0));
        assertEquals(Direction.RIGHT, Direction.of(0, 1));
        assertEquals(Direction.DOWN, Direction.of(1, 0));
        assertEquals(Direction.LEFT, Direction.of(0, -1));
    }

    @Test
    void testOpposite() {
        assertEquals(Direction.UP, Direction.opposite(Direction.DOWN));
        assertEquals(Direction.RIGHT, Direction.opposite(Direction.LEFT));
        assertEquals(Direction.DOWN, Direction.opposite(Direction.UP));
        assertEquals(Direction.LEFT, Direction.opposite(Direction.RIGHT));
    }

}