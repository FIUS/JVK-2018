/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;

/**
 * Task for the exercise 11 from worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise11 extends TaskTemplate {
    private Boolean test = true;
    /**
     * 
     */
    protected final Mario mario;
    /**
     */
    public AB2_Exercise11() {
        super(Presets.cage(1, 1).result(), "AB 2 Exercise 11 (a-d)");
        this.mario = new Mario(this.simulation);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
       this.mario.spawn(0, 0);
       lookNorth();
       if(!(this.mario.worldObject().direction== Direction.NORTH)) {
           this.test = false;
       }
       lookEast();
       if(!(this.mario.worldObject().direction== Direction.EAST)) {
           this.test = false;
       }
       lookSouth();
       if(!(this.mario.worldObject().direction== Direction.SOUTH)) {
           this.test = false;
       }
       lookWest();
       if(!(this.mario.worldObject().direction== Direction.WEST)) {
           this.test = false;
       }
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
        this.simulation.pause();
        Assertions.assertEquals(this.test,true);
    }
    
}
