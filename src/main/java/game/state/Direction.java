package game.state;

/**
 * Enum representing the directions.
 */
public enum Direction {

    UP(-1, 0),
    RIGHT(0, 1),
    DOWN(1, 0),
    LEFT(0, -1),
    SW(1, -1),
    SE(1, 1),
    NW(-1, -1),
    NE(-1, 1);

    private int dx;
    private int dy;

    private Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    /**
     * Returns the change in the x-coordinate when moving a step in this
     * direction.
     *
     * @return the change in the x-coordinate when moving a step in this
     * direction
     */
    public int getDx() {
        return dx;
    }

    /**
     * Returns the change in the y-coordinate when moving a step in this
     * direction.
     *
     * @return the change in the y-coordinate when moving a step in this
     * direction
     */
    public int getDy() {
        return dy;
    }

    /**
     * Returns the direction that corresponds to the changes in the x-coordinate
     * and the y-coordinate specified.
     *
     * @param dx the change in the x-coordinate
     * @param dy the change in the y-coordinate
     * @return the direction that corresponds to the changes in the x-coordinate
     * and the y-coordinate specified
     */
    public static Direction of(int dx, int dy) {
        for (Direction direction : values()) {
            if (direction.dx == dx && direction.dy == dy) {
                return direction;
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * Returns the opposite of the specified direction.
     *
     * @param direction the specified direction
     * @return the opposite of the specified direction
     */
    public static Direction opposite(Direction direction) {
        if (direction == UP) {
            return DOWN;
        }
        if (direction == DOWN) {
            return UP;
        }
        if (direction == LEFT) {
            return RIGHT;
        }
        if (direction == RIGHT) {
            return LEFT;
        }
        throw new IllegalArgumentException();
    }

}
