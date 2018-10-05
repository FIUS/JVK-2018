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

/**
 *  task for exercise 3 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise03 extends TaskTemplate{
    /**
     * 
     */
    protected final Mario mario;
    /**
     *
     */
    public AB2_Exercise03() {
        super(Presets.cage(5, 5).result(), "AB 2 Exercise 03");
        this.mario = new Mario(this.simulation);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.mario.spawn(1, 1);
        stepRightUp();
        stepBack();
        stepLeftDown();
        this.simulation.pause();
        Assertions.assertEquals(this.mario.lastPosition().column,2);
        Assertions.assertEquals(this.mario.lastPosition().row,1);
        //I let mario walk with the methods so when they are all right (or when they are all false but compensate each other)
        //mario should end on the given position 2,1
        this.simulation.pause();
    }

    /**
     * 
     */
    protected abstract void stepRightUp();
    
    /**
     * 
     */
    protected abstract void stepLeftDown();
    
    /**
     * 
     */
    protected abstract void stepBack();
    
}
