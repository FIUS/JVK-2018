/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;

/**
 *  task for exercise 3 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Task03 extends TaskTemplate {
    private final Mario mario1;
    private final Mario mario2;
    private final Mario mario3;

    /**
     *
     */
    public AB2_Task03() {
        super(new Territory(), "Worksheet 2, task 03");
        this.mario1 = new Mario(this.simulation);
        this.mario2 = new Mario(this.simulation);
        this.mario3 = new Mario(this.simulation);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        this.mario1.spawn(-2, 0);
        this.stepRightUp(this.mario1);

        this.mario2.spawn(0, 0);
        this.stepBack(this.mario2);

        this.mario3.spawn(2, 0);
        this.stepLeftDown(this.mario3);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();

        for (Mario m : new Mario[]{ this.mario1, this.mario2, this.mario3 }) {
            Assertions.assertEquals(Direction.EAST, m.worldObject().direction);
        }

        Assertions.assertEquals(-1, this.mario1.getColumn());
        Assertions.assertEquals(1, this.mario1.getRow());

        Assertions.assertEquals(-1, this.mario2.getColumn());
        Assertions.assertEquals(0, this.mario2.getRow());

        Assertions.assertEquals(1, this.mario3.getColumn());
        Assertions.assertEquals(-1, this.mario3.getRow());
    }

    /**
     * 
     */
    protected abstract void stepRightUp(Mario mario);
    
    /**
     * 
     */
    protected abstract void stepLeftDown(Mario mario);
    
    /**
     * 
     */
    protected abstract void stepBack(Mario mario);
    
}
