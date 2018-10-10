/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB2_Task09;

/**
 * Solution class for worksheet 2, task 9
 * 
 * @author Sebastian Paule
 */
public class AB2_Solution09 extends AB2_Task09 {
    
    private int getDirectionalX(int x, Direction dir) {
        if (dir == Direction.EAST) {
            return x + 1;
        } else if (dir == Direction.WEST) {
            return x - 1;
        } else {
            return x;
        }
    }
    
    private int getDirectionalY(int y, Direction dir) {
        if (dir == Direction.SOUTH) {
            return y + 1;
        } else if (dir == Direction.NORTH) {
            return y - 1;
        } else {
            return y;
        }
    }
    
    private Direction rotateClockwise(Direction dir) {
        switch (dir) {
            case WEST:
                return Direction.NORTH;
            case SOUTH:
                return Direction.WEST;
            case EAST:
                return Direction.SOUTH;
            case NORTH:
                return Direction.EAST;
        }
        return null;
    }
    
    private Direction rotateCounterClockwise(Direction dir) {
        switch (dir) {
            case EAST:
                return Direction.NORTH;
            case NORTH:
                return Direction.WEST;
            case WEST:
                return Direction.SOUTH;
            case SOUTH:
                return Direction.EAST;
        }
        return null;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is in front of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanFront(Mario mario) {
        // TODO work here
        Direction dir = mario.worldObject().direction;
        int x = getDirectionalX(mario.getColumn(), dir);
        int y = getDirectionalY(mario.getRow(), dir);
        boolean result = !this.simulation.collectablesAt(x, y).isEmpty();
        return result;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is behind mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanBack(Mario mario) {
        // TODO work here
        Direction dir = mario.worldObject().direction;
        dir = rotateClockwise(rotateClockwise(dir));
        int x = getDirectionalX(mario.getColumn(), dir);
        int y = getDirectionalY(mario.getRow(), dir);
        return !this.simulation.collectablesAt(x, y).isEmpty();
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is at the right of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanRight(Mario mario) {
        // TODO work here
        Direction dir = mario.worldObject().direction;
        dir = rotateClockwise(dir);
        int x = getDirectionalX(mario.getColumn(), dir);
        int y = getDirectionalY(mario.getRow(), dir);
        return !this.simulation.collectablesAt(x, y).isEmpty();
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is at the left of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanLeft(Mario mario) {
        // TODO work here
        Direction dir = mario.worldObject().direction;
        dir = rotateCounterClockwise(dir);
        int x = getDirectionalX(mario.getColumn(), dir);
        int y = getDirectionalY(mario.getRow(), dir);
        return !this.simulation.collectablesAt(x, y).isEmpty();
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell in front and one to the
     *         right of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanUpperRight(Mario mario) {
        // TODO work here
        Direction dir = mario.worldObject().direction;
        int x = getDirectionalX(mario.getColumn(), dir);
        int y = getDirectionalY(mario.getRow(), dir);
        dir = rotateClockwise(dir);
        x = getDirectionalX(x, dir);
        y = getDirectionalY(y, dir);
        return !this.simulation.collectablesAt(x, y).isEmpty();
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell in front and one to the
     *         left of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanUpperLeft(Mario mario) {
        // TODO work here
        Direction dir = mario.worldObject().direction;
        int x = getDirectionalX(mario.getColumn(), dir);
        int y = getDirectionalY(mario.getRow(), dir);
        dir = rotateCounterClockwise(dir);
        x = getDirectionalX(x, dir);
        y = getDirectionalY(y, dir);
        return !this.simulation.collectablesAt(x, y).isEmpty();
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell behind and one to the right
     *         of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanLowerRight(Mario mario) {
        // TODO work here
        Direction dir = mario.worldObject().direction;
        dir = rotateClockwise(rotateClockwise(dir));
        int x = getDirectionalX(mario.getColumn(), dir);
        int y = getDirectionalY(mario.getRow(), dir);
        dir = rotateCounterClockwise(dir);
        x = getDirectionalX(x, dir);
        y = getDirectionalY(y, dir);
        return !this.simulation.collectablesAt(x, y).isEmpty();
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell behind and one to the left
     *         of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanLowerLeft(Mario mario) {
        // TODO work here
        Direction dir = mario.worldObject().direction;
        dir = rotateClockwise(rotateClockwise(dir));
        int x = getDirectionalX(mario.getColumn(), dir);
        int y = getDirectionalY(mario.getRow(), dir);
        dir = rotateClockwise(dir);
        x = getDirectionalX(x, dir);
        y = getDirectionalY(y, dir);
        return !this.simulation.collectablesAt(x, y).isEmpty();
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is anywhere in the 3x3 field around
     *         mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanAround(Mario mario) {
        // TODO work here
        for (int x : new int[] { -1, 0, 1 }) {
            for (int y : new int[] { -1, 0, 1 }) {
                int actualX = mario.getColumn() + x;
                int actualY = mario.getRow() + y;
                if (!this.simulation.collectablesAt(x, y).isEmpty()) return true;
            }
        }
        return false;
    }
    
}
