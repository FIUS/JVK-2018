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
import de.unistuttgart.informatik.fius.icge.simulation.Wall;

/**
 * task for the exercise 9 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Task09 extends TaskTemplate {

    protected final Mario mario;
    protected final Wall[] walls = new Wall[9];

    /**
     * 
     */
    public AB2_Task09() {
        super(Presets.cage(5, 5).result(), "Worksheet 2, task 09");
        this.mario = new Mario(this.simulation);

        walls[0] = new Wall(this.simulation);
        walls[0].spawn(0, 0);
        walls[1] = new Wall(this.simulation);
        walls[1].spawn(0, 1);
        walls[2] = new Wall(this.simulation);
        walls[2].spawn(0, 2);
        walls[3] = new Wall(this.simulation);
        walls[3].spawn(1, 0);
        walls[4] = new Wall(this.simulation);
        walls[4].spawn(1, 1);
        walls[5] = new Wall(this.simulation);
        walls[5].spawn(1, 2);
        walls[6] = new Wall(this.simulation);
        walls[6].spawn(2, 0);
        walls[7] = new Wall(this.simulation);
        walls[7].spawn(2, 1);
        walls[8] = new Wall(this.simulation);
        walls[8].spawn(2, 2);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public final void solve() {
        for (Wall w : walls) w.despawn();
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        Assertions.assertEquals(true, this.scanFront());
        Assertions.assertEquals(true, this.scanBack());
        Assertions.assertEquals(true, this.scanRight());
        Assertions.assertEquals(true, this.scanLeft());
        Assertions.assertEquals(true, this.scanUpperRight());
        Assertions.assertEquals(true, this.scanUpperLeft());
        Assertions.assertEquals(true, this.scanLowerRight());
        Assertions.assertEquals(true, this.scanLowerLeft());

        this.solve();

        Assertions.assertEquals(false, this.scanFront());
        Assertions.assertEquals(false, this.scanBack());
        Assertions.assertEquals(false, this.scanRight());
        Assertions.assertEquals(false, this.scanLeft());
        Assertions.assertEquals(false, this.scanUpperRight());
        Assertions.assertEquals(false, this.scanUpperLeft());
        Assertions.assertEquals(false, this.scanLowerRight());
        Assertions.assertEquals(false, this.scanLowerLeft());
    }
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract boolean scanFront();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract boolean scanBack();
    
    /** 
     * @return true if on the scanned field is a collectable
     */
    protected abstract boolean scanRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract boolean scanLeft();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract boolean scanUpperRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract boolean scanUpperLeft();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract boolean scanLowerRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract boolean scanLowerLeft();
    
}
