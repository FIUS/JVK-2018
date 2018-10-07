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
public abstract class AB2_Exercise09 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     */
    protected final Wall[] walls = new Wall[9];
    /**
     * 
     */
    public AB2_Exercise09() {
        super(Presets.cage(5, 5).result(), "AB 2 Exercise 09");
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
        Assertions.assertEquals(this.scanFront(),true);
        Assertions.assertEquals(this.scanBack(),true);
        Assertions.assertEquals(this.scanRight(),true);
        Assertions.assertEquals(this.scanLeft(),true);
        Assertions.assertEquals(this.scanUpperRight(),true);
        Assertions.assertEquals(this.scanUpperLeft(),true);
        Assertions.assertEquals(this.scanLowerRight(),true);
        Assertions.assertEquals(this.scanLowerLeft(),true);
        for(Wall w:walls){
            w.despawn();
        }
        Assertions.assertEquals(this.scanFront(),false);
        Assertions.assertEquals(this.scanBack(),false);
        Assertions.assertEquals(this.scanRight(),false);
        Assertions.assertEquals(this.scanLeft(),false);
        Assertions.assertEquals(this.scanUpperRight(),false);
        Assertions.assertEquals(this.scanUpperLeft(),false);
        Assertions.assertEquals(this.scanLowerRight(),false);
        Assertions.assertEquals(this.scanLowerLeft(),false);
        this.simulation.pause();
    }
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanFront();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanBack();
    
    /** 
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanLeft();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanUpperRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanUpperLeft();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanLowerRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract Boolean scanLowerLeft();
    
}
