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
 *  task for exercise 2 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Task02 extends TaskTemplate {
    private final Mario mario1;
    private final Mario mario2;

    /**
     *
     */
    public AB2_Task02() {
        super(new Territory(), "Worksheet 2, task 02");
        this.mario1 = new Mario(this.simulation);
        this.mario2 = new Mario(this.simulation);
    }
    
    /**
     * this method only exists here so we don't need it in the Solution class
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public final void solve() {
        // initially they look eastwards
        this.mario1.spawn(0, 0);
        this.turnAround(this.mario1); // he should look westwards
        this.mario2.spawn(3, 0);
        this.turnRight(this.mario2); // he should look southwards
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        Assertions.assertEquals(Direction.WEST, this.mario1.worldObject().direction);
        Assertions.assertEquals(Direction.SOUTH, this.mario2.worldObject().direction);
        this.simulation.pause();
    }

    /**
     * 
     */
    protected abstract void turnAround(Mario mario);

    /**
     * 
     */
    protected abstract void turnRight(Mario mario);
    
}
