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
 *  task for exercise 2 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise02 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     *
     */
    public AB2_Exercise02() {
        super(Presets.cage(5, 5).result(), "AB 2 Exercise 02");
        this.mario = new Mario(this.simulation);
    }
    
    /**
     * this method only exists here so I don't need it in the Solution class
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.mario.spawn(0, 0);//he looks at east
        this.turnAround();
        Assertions.assertEquals(this.mario.worldObject().direction, Direction.WEST);//he should look at west
        this.turnRight();
        Assertions.assertEquals(this.mario.worldObject().direction, Direction.NORTH);//finally he should look at north
        this.simulation.pause();
    }

    /**
     * 
     */
    protected abstract void turnAround();

    /**
     * 
     */
    protected abstract void turnRight();
    
}
