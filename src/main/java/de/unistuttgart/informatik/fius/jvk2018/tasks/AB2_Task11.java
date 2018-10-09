/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;

/**
 * Task for the exercise 11 from worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Task11 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     */
    public AB2_Task11() {
        super(Presets.cage(1, 1).result(), "Worksheet 2, task 11 (a-d)");
        this.mario = new Mario(this.simulation);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
       this.mario.spawn(0, 0);
    }
    
    /**
     * 
     */
    protected abstract void lookWest();

    /**
     * 
     */
    protected abstract void lookSouth();

    /**
     * 
     */
    protected abstract void lookEast();

    /**
     * 
     */
    protected abstract void lookNorth();

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        lookNorth();
        assertEquals(Direction.NORTH, this.mario.worldObject().direction, "Mario is not facing North after calling lookNorth()");
        lookEast();
        assertEquals(Direction.EAST, this.mario.worldObject().direction, "Mario is not facing East after calling lookEast()");
        lookSouth();
        assertEquals(Direction.SOUTH, this.mario.worldObject().direction, "Mario is not facing South after calling lookSouth()");
        lookWest();
        assertEquals(Direction.WEST, this.mario.worldObject().direction, "Mario is not facing West after calling lookWest()");
    }
    
}
